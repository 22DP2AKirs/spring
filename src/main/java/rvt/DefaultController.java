package rvt;

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
}
