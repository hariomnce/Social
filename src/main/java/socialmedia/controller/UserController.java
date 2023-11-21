package socialmedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import socialmedia.model.User;
import socialmedia.repository.UserRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    // Create user Api
    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setId(user.getId());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());

        User saveUser = userRepository.saveAndFlush(newUser);
        return saveUser;
    }

    //Fetch By All Api
    @GetMapping("/allUsers")
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }


}
