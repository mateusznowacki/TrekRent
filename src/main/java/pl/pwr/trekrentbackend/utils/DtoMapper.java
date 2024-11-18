package pl.pwr.trekrentbackend.utils;

import pl.pwr.trekrentbackend.dto.EquipmentTypeDto;
import pl.pwr.trekrentbackend.entity.EquipmentType;

public class DtoMapper {


    // Metoda do konwersji z Entity na DTO
    public static EquipmentTypeDto toEquipmentTypeDto(EquipmentType equipmentType) {
        return new EquipmentTypeDto(
                equipmentType.getId(),
                equipmentType.getName(),
                equipmentType.getDescription(),
                equipmentType.getAvailableCount(),
                equipmentType.getPrice(),
                equipmentType.getImagePath()
        );
    }

    // Metoda do konwersji z DTO na Entity
    public static EquipmentType toEquipmentType(EquipmentTypeDto dto) {
        EquipmentType equipmentType = new EquipmentType();
        equipmentType.setId(dto.id());
        equipmentType.setName(dto.name());
        equipmentType.setDescription(dto.description());
        equipmentType.setAvailableCount(dto.availableCount());
        equipmentType.setPrice(dto.price());
        equipmentType.setImagePath(dto.imagePath());
        return equipmentType;
    }
}
