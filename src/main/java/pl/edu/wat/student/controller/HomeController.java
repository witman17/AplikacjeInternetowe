package pl.edu.wat.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
    public String getRestaurants(@ModelAttribute("home") HomeForm form, RedirectAttributes attributes) {
        List<Restaurant> restaurants = RestaurantService.findAllByCity(form.getCity());
        attributes.addFlashAttribute("restaurants", restaurants);
        return "redirect:restaurants";
    }

    @ModelAttribute("home")
    public HomeForm construct() {
        return new HomeForm();
    }


}