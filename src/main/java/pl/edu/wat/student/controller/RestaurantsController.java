package pl.edu.wat.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Witold on 2016-01-07.
 */
@Controller
public class RestaurantsController {
    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    public String restaurants() {
        return "restaurants";
    }
}
