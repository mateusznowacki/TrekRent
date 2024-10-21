package pl.pwr.TrekRent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pwr.TrekRent.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
