package pl.pwr.trekrentbackend.dto;


public record EquipmentTypeDto(
        Long id,
        String name,
        String description,
        int availableCount,
        double price,
        String imagePath
) {}
