package pl.pwr.TrekRent.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pwr.TrekRent.entity.User;
import pl.pwr.TrekRent.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public static User createUser() {
        return new User();
    }
}
