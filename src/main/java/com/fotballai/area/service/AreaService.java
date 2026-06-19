package com.fotballai.area.service;

import com.fotballai.area.entity.Area;
import com.fotballai.area.repository.AreaRepository;
import org.springframework.stereotype.Service;

@Service
public class AreaService {

    private final AreaRepository areaRepository;

    public AreaService(AreaRepository _areaRepository) {
        areaRepository = _areaRepository;
    }

    public Area save(Area area) {
       return areaRepository.save(area);
    }

    public void deleteById(Long Id) {
        areaRepository.deleteById(Id);
    }
}
