package pl.pwr.TrekRent.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "equipment_types")
@Data
public class EquipmentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @NotBlank
    private int availableCount;

    @NotBlank
    private double price;

    @NotBlank
    private String imagePath;

    // Relacja do konkretnych sztuk sprzętu
    @OneToMany(mappedBy = "equipmentType")
    private List<Equipment> equipmentList;


}
