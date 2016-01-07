package pl.edu.wat.student.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.edu.wat.student.database.RestaurantService;
import pl.edu.wat.student.model.db.Restaurant;
import pl.edu.wat.student.model.form.ReservationForm;

@Controller
public class ReservationController {

    @ModelAttribute("restaurant")
    public Restaurant construct() {
        return new Restaurant();
    }

    @RequestMapping(value = "/reservation", method = RequestMethod.GET)
    public String reservation(@RequestParam String id, Model model) {
        Restaurant restaurant = RestaurantService.findOne(id);
        ReservationForm reservationForm = new ReservationForm(restaurant);
        model.addAttribute("resForm", reservationForm);
        return "reservation";
    }
}
