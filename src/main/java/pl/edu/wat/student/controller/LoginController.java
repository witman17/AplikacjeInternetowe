package pl.edu.wat.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.edu.wat.student.database.UserService;
import pl.edu.wat.student.model.db.User;

@Controller
public class LoginController {


    @ModelAttribute("user")
    public User construct() {
        return new User();
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logged(@ModelAttribute("user") User user) {
        User dbUser = UserService.findOne(user.getEmail());
        if (dbUser != null) {
            //TODO zalogowanie się itp
            if (dbUser.getPassword().compareTo(user.getPassword()) == 0)
                return "home";
            else
                return "login";
        }
        return "login";
    }
}
