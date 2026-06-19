package com.fotballai.service;

import com.fotballai.domain.Area;
import com.fotballai.repository.AreaRepository;
import com.fotballai.repository.TeamRepository;
import com.fotballai.service.dto.AreaDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AreaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Area.class);

    private final AreaRepository areaRepository;
    private final TeamRepository teamRepository;

    public AreaService(AreaRepository _areaRepository, TeamRepository _teamRepository) {
        areaRepository = _areaRepository;
        teamRepository = _teamRepository;
    }

    public Page<Area> findAll(Pageable pageable) {
        LOGGER.debug("Request to get all Areas");
        return areaRepository.findAll(pageable);
    }

    public Optional<Area> findById(Long id) {
        LOGGER.debug("Request to get Area with id: {}", id);
        return areaRepository.findById(id);
    }

    public Page<Area> findByCity(String locatedCity) {
        LOGGER.debug("Request to get Area with city: {}", locatedCity);
        return areaRepository.findByCity(locatedCity);
    }

    public void delete(Area area) {
        LOGGER.debug("Request to delete Area: {}", area);
        areaRepository.delete(area);
    }

    public AreaDto.UpsertRequest create(AreaDto.UpsertRequest request) {
        LOGGER.debug("Request to create Area: {}", request);

        Area area = new Area();
        area.setName(request.name());
        area.setCity(request.city());
        area.setCountry(request.country());
        area.setAddress(request.address());
        area.setTeams(request.teams());
        area.setCapacity(request.capacity());

        return mapToDto(areaRepository.save(area));
    }


    //Helper function
    private AreaDto.UpsertRequest mapToDto(Area area){
        return new AreaDto.UpsertRequest(
                area.getName(),
                area.getCity(),
                area.getCountry(),
                area.getAddress(),
                area.getTeams(),
                area.getCapacity()
        );
    }
}
