package dev.naimsulejmani.grupi3layoutexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class HomeController {
    private List<Advertisement> advertisements = new ArrayList<>();

    public HomeController() {
        advertisements.add(new Advertisement("Adidas", "Adidas is a German multinational corporation, founded and headquartered in Herzogenaurach, Germany, that designs and manufactures shoes, clothing and accessories.", "/images/adidas.webp"));
        advertisements.add(new Advertisement("Nike", "Nike, Inc. is an American multinational corporation that is engaged in the design, development, manufacturing, and worldwide marketing and sales of footwear, apparel, equipment, accessories, and services.", "/images/nike.jpg"));
        advertisements.add(new Advertisement("Puma", "Puma SE, branded as Puma, is a German multinational corporation that designs and manufactures athletic and casual footwear, apparel and accessories, which is headquartered in Herzogenaurach, Bavaria, Germany.", "/images/puma.jpg"));
    }

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
        switch (r) {
            case 1 -> {
                return "about";
            }
            case 2 -> {
                return "contact";
            }
            default -> {
                return "index";
            }
        }
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        double rnd = Math.random();
        model.addAttribute("rnd", rnd);
        model.addAttribute("type", "world_cup");
        model.addAttribute("advertisements", advertisements);

        return "profile";
    }
}








