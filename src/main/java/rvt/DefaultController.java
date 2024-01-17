package rvt;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }

    @GetMapping(value = "/student")
    public ModelAndView students() {
        ModelAndView modelisUnSkats = new ModelAndView("students");
        String name = "Peter";
        return modelisUnSkats;
    }

    @GetMapping(value = "/about")
    public ModelAndView about() {
        ModelAndView modelisUnSkats = new ModelAndView("about");
        String name = "Peter";
        return modelisUnSkats;
    }

    @GetMapping(value = "/test")
    public ModelAndView testAction() {
        Money wallet1 = new Money(10,0);
        Money wallet2 = new Money(5,10);
        ModelAndView modelisUnSkats = new ModelAndView();


        String brand = "Ford";

        modelisUnSkats.addObject("Brends", brand);
        modelisUnSkats.addObject("Modelis", "Mustang");
        modelisUnSkats.addObject("Gads", "1920");

        
        modelisUnSkats.addObject("wallet1", wallet1);
        modelisUnSkats.addObject("wallet2", wallet2);
        modelisUnSkats.addObject("wallet3", wallet1.plus(wallet2));
        return modelisUnSkats;
    }
}
