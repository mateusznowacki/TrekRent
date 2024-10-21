package pl.pwr.TrekRent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pl.pwr.TrekRent.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


}
