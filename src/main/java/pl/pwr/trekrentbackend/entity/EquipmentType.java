package pl.pwr.trekrentbackend.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotNull
    private int availableCount;

    @NotNull
    private double price;

    private String imagePath;

    // Relacja do konkretnych sztuk sprzętu
    @OneToMany(mappedBy = "equipmentType", fetch = FetchType.LAZY)
    private List<Equipment> equipmentList;


}
