package dev.abhijeet.userms.controllers;


import dev.abhijeet.userms.dto.UserDTO;
import dev.abhijeet.userms.model.User;
import dev.abhijeet.userms.repo.UserRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody @Valid UserDTO userDTO) {
        //generally we call services here. But to keep it simple I am directly calling the repo
        User user = new User();
        user.setAddress(userDTO.getAddress());
        user.setName(userDTO.getName());
        User savedUser = userRepo.save(user);
        return ResponseEntity.ok(savedUser.getId());
    }

    @GetMapping
    public ResponseEntity<?> getUsers(){
        //I am not using pagination just to keep it simple
        return ResponseEntity.ok(userRepo.findAll());
    }
}
