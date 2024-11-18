package pl.pwr.trekrentbackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import pl.pwr.trekrentbackend.enums.Condition;

import java.util.List;

@Entity
@Table(name = "equipment")
@Data
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipment_type_id", referencedColumnName = "id")
    private EquipmentType equipmentType;

    private Condition condition;

    private boolean isAvailable;

    // Relacja do wypożyczeń
    @OneToMany(mappedBy = "equipment")
    private List<Rental> rentals;
}
