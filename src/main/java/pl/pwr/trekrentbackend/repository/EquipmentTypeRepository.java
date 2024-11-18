package pl.pwr.trekrentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pwr.trekrentbackend.entity.EquipmentType;

public interface EquipmentTypeRepository extends JpaRepository<EquipmentType, Long> {
}
