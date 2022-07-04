package MrTurtle.services;

import MrTurtle.models.User;
import MrTurtle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @GetMapping(path = "/all/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userRepository.getReferenceById(id);
    }
    @PostMapping(path = "/add")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping(path = "/update")
    public User updateUser(@RequestBody User user) {
        User userWithId = userRepository.getReferenceById(user.getId());
        if(userWithId == null) {
            throw new EntityNotFoundException();
        } else {
            return userRepository.save(user);
        }
    }
}
