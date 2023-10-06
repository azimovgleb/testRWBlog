package by.rw.vtb.myRwBlog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Home");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "About");
        model.addAttribute("pageInfo", "Page about us");
        return "about";
    }

    @GetMapping("/support")
    public String support(Model model){
        model.addAttribute("info", "Contacts: +1 11 111-11-11");
        return "support";
    }
}
