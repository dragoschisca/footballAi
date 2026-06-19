package com.fotballai.area.repository;

import com.fotballai.area.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
     Area findByName(String name);
     Area findByCity(String city);
     Area findByCountry(String country);
     Area findByAddress(String address);

}
