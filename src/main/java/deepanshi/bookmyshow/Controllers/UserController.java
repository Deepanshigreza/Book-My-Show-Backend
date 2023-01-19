package deepanshi.bookmyshow.Controllers;

import deepanshi.bookmyshow.DTO.UserRequestDto;
import deepanshi.bookmyshow.Models.User;
import deepanshi.bookmyshow.ServiceLayer.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")//common  api keyword
public class UserController {


    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String  addUser(@RequestBody UserRequestDto userRequestDto){

        return userService.createUser(userRequestDto);
    }

    @GetMapping("/findAllUser")
    public ResponseEntity <List<User>> findAllUser(){
    List<User> user=userService.findAll();
        return new ResponseEntity<List<User>>(user, HttpStatus.OK);

    }

    @GetMapping("/findUserByName/{name}")
    public User findUserByName(@PathVariable("name") String name){
    return userService.findUser(name);

    }





}
