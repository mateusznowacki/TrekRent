package pl.pwr.trekrentbackend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pwr.trekrentbackend.dto.EquipmentTypeDto;
import pl.pwr.trekrentbackend.service.EquipmentTypeService;

import java.util.List;

@RestController
@RequestMapping("/api/equipment-types")
public class EquipmentTypeController {

    @Autowired
    private EquipmentTypeService equipmentTypeService;


    // Endpoint to get all equipment names, image paths, and their IDs
    @GetMapping("/get-all")
    public List<EquipmentTypeDto> getAllEquipmentTypes() {
        return equipmentTypeService.getAllEquipmentTypes();
    }
}
