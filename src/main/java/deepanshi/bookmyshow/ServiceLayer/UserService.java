package deepanshi.bookmyshow.ServiceLayer;

import deepanshi.bookmyshow.DTO.UserRequestDto;
import deepanshi.bookmyshow.Models.User;
import deepanshi.bookmyshow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
public String createUser(UserRequestDto userRequestDto){
User user=User.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();
    try{
        userRepository.save(user);

    }catch(Exception e){
        return "user couldnt be added";
    }
    return "User added sucessfully";
}

public List<User> findAll(){
    List<User> userList=userRepository.findAll();

    return  userList;
}

public User findUser(String name){
    return userRepository.findByName(name);
}

}
