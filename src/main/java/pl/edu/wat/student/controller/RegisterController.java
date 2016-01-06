package pl.edu.wat.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.edu.wat.student.database.UserService;
import pl.edu.wat.student.model.db.User;

@Controller
public class RegisterController {


    @ModelAttribute("user")
    public User construct() {
        return new User();
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegister() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user) {
        UserService.save(user);
        return "home";
    }
}
