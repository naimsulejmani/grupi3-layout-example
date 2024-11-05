package dev.naimsulejmani.grupi3layoutexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/about")
    public String home() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("pageTitle", "Contact Page");
        return "contact";
    }
    @GetMapping("/random")
    public String random() {
        Random random = new Random();
        int r = random.nextInt(3);
        return switch (r) {
            case 1 -> "about";
            case 2 -> "contact";
            default -> "index";
        };
    }

}








