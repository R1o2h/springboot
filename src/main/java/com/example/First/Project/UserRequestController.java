package com.example.First.Project;

import com.example.First.Project.Pojos.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController("/users")
@RequestMapping("/users")
public class UserRequestController {

        private ArrayList<UserRequest>users =new ArrayList<>();
        @PostMapping("/")
        public UserRequest createUser(@RequestBody UserRequest user) {
            users.add(user);
            return user;
        }
        @GetMapping("/")
        public ArrayList<UserRequest>getUsers() {
            return users;
        }
        @GetMapping("/{id}")
        public UserRequest getUser(@PathVariable("id") int id) {
            return users.get(id);
        }

}

