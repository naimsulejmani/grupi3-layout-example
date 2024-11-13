package dev.naimsulejmani.grupi3layoutexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private List<String> students = new ArrayList<>();
    public StudentController() {
        students.add("Naim Sulejmani");
        students.add("Ariandi");
        students.add("Lirak");
        students.add("Ardit");
        students.add("Ardian");
        students.add("Ardita");
        students.add("Ardiani");
    }

    @GetMapping("")
    public String index() {
        return "students";
    }

    @GetMapping("/list")
    public String listStudents(@RequestParam(value = "name", required = false) String name,
                               Model model) {
        if(name != null) {
            var students = this.students.stream()
                    .filter(s -> s.trim().toLowerCase().contains(name.toLowerCase())).toList();
            model.addAttribute("students", students);
        } else {
            model.addAttribute("students", this.students);
        }
        System.out.println(name);
        return "list-students";
    }
}












