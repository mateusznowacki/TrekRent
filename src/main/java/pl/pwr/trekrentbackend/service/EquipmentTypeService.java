package pl.pwr.trekrentbackend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pwr.trekrentbackend.dto.EquipmentTypeDto;
import pl.pwr.trekrentbackend.entity.EquipmentType;
import pl.pwr.trekrentbackend.repository.EquipmentTypeRepository;
import pl.pwr.trekrentbackend.utils.DtoMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EquipmentTypeService {

    @Autowired
    private EquipmentTypeRepository equipmentTypeRepository;

    public List<EquipmentTypeDto> getAllEquipmentTypes() {
        return equipmentTypeRepository.findAll().stream()
                .map(DtoMapper::toEquipmentTypeDto) // Użycie mappera do konwersji encji na DTO
                .collect(Collectors.toList());
    }



}
