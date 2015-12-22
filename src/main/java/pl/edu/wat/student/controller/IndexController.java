package pl.edu.wat.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wat.student.model.Reservation;

/**
 * Created by Witold on 2015-12-22.
 */

@Controller
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index/index", "reservation", new Reservation());

        return mav;
    }
//    @RequestMapping(value = "/result", method = RequestMethod.POST)
//    public String result(@ModelAttribute("SpringWeb")Reservation reservation,
//                             ModelMap model) {
//        model.addAttribute("city", reservation.getAddress().getCity());
//        return "result";
//    }
}