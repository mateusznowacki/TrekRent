package pl.pwr.TrekRent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.pwr.TrekRent.entity.User;
import pl.pwr.TrekRent.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public void registerUser(@RequestBody User user) {
        userRepository.save(user);
    }


}
