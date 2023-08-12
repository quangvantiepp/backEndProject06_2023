package groupProject.database.controller;



import groupProject.database.domain.entity.User;
import groupProject.database.service.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    // test return
    @GetMapping("/app")
    public String nameProject(){
        return "XIN CHAO";
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id ){
        return userService.findById(id);
    }
    @PostMapping("/{id}")
    public User createNew(User user){
        return userService.create(user);
    }
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, User user){
        return userService.update(id, user);
    }
    @DeleteMapping("/{id}")
    public void delete(Long id){
        userService.delete(id);
    }
}
