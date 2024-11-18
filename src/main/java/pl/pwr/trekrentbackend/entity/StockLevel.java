package pl.pwr.trekrentbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "stock_levels")
@Data
public class StockLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_type_id", referencedColumnName = "id", nullable = false)
    private EquipmentType equipmentType;

    private int availableCount;

}
