package com.maticuad.volleyballApp.controllers;


import com.maticuad.volleyballApp.dto.UserDTO;
import com.maticuad.volleyballApp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/hello")
    public String helloUser() {
        return "User access level";
    }

//    @GetMapping("/all")
//    public ResponseEntity<List<UserDTO>> getUsers() {
//        return ResponseEntity.ok();
//    }
//
//    @GetMapping("/{username}")
//    public ResponseEntity<UserDTO> getUserByUsername(@PathVariable String username) {
//        return ResponseEntity.ok();
//    }


}
