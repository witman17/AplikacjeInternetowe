package pl.edu.wat.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wat.student.database.RestaurantService;
import pl.edu.wat.student.model.db.Restaurant;
import pl.edu.wat.student.model.form.HomeForm;

import java.util.List;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    /**
     * Simply selects the home view to render by returning its name.
     */

    @RequestMapping(value = {"/home", "/"}, method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = {"/home", "/"}, method = RequestMethod.POST)
    public ModelAndView getRestaurants(@ModelAttribute("home") HomeForm form) {
        ModelAndView modelAndView = new ModelAndView("restaurants");
        List<Restaurant> restaurants = RestaurantService.findAllByCity(form.getCity());
        modelAndView.addObject(restaurants);
        return modelAndView;
    }

    @ModelAttribute("home")
    public HomeForm construct() {
        return new HomeForm();
    }


}