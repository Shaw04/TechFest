package com.example.TechFest.data.User1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin
@RestController
@RequestMapping(path = "/user")

public class UserController {
		public UserService userService;
		
		
		@Autowired
		public UserController(UserService userService) { 
			this.userService = userService;
		}
	
	
	
		@GetMapping
		public List<User1> GetUsers(){
			return userService.GetUsers();
		}
		
		@PostMapping
	    public User1 addNewUser(@RequestBody User1 user){
	        return userService.addNewUser(user);
	    }
		
		@PostMapping("/login")
	    public ResponseEntity<User1> login(@RequestBody User1 credentials) {
	        
			User1 user = userService.authenticate(credentials);
			if (user != null) {
	            return ResponseEntity.ok(user);
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	        }
	    }
	
	    @DeleteMapping(path = "{UserID}")
	    public void deleteUser(@PathVariable("UserID") Long id){
	        userService.deleteUser(id);
	    }
	    @PutMapping(path = "{UserID}")
	    public User1 updateUser(@PathVariable("UserID")Long Id,
	                           @RequestBody User1 user1){
	        return userService.updateUser(Id,user1);
	    }
}
