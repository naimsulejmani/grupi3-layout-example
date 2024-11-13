package dev.naimsulejmani.grupi3layoutexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/subjects")
public class SubjectController {

    private final List<Subject> subjects = new ArrayList<>();

    public SubjectController() {
        subjects.add(new Subject("1", "Math", "Math is the study of numbers, quantities, and shapes.", "Prof. Math", "1"));
        subjects.add(new Subject("2", "Physics", "Physics is the natural science that studies matter, its motion and behavior through space and time, and the related entities of energy and force.", "Prof. Physics", "2"));
        subjects.add(new Subject("3", "Chemistry", "Chemistry is the scientific discipline involved with elements and compounds composed of atoms, molecules and ions: their composition, structure, properties, behavior and the changes they undergo during a reaction with other substances.", "Prof. Chemistry", "3"));
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("subjects", subjects);
        return "subjects/index";
    }

}
