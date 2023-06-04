package groupProject.database.controller;

import groupProject.database.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/u")
public class UserController {
    @GetMapping("/")
    public List<User> getAll() {
        return new ArrayList<>();
    }
    @GetMapping("/app")
    public String nameProject(){
        return "XIN CHAO";
    }
}
