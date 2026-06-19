package com.fotballai.web.rest;

import com.fotballai.domain.Area;
import com.fotballai.service.AreaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/area")
public class AreaController {

    private final AreaService areaService;
    public AreaController(AreaService _areaService) {
        areaService = _areaService;
    }

    @PostMapping("/save")
    public Area createArea(@RequestBody Area area) {
        return areaService.save(area);
    }
}
