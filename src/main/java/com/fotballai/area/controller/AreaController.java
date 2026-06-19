package com.fotballai.area.controller;

import com.fotballai.area.entity.Area;
import com.fotballai.area.service.AreaService;
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
