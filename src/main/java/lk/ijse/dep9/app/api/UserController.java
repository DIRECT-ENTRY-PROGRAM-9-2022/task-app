package lk.ijse.dep9.app.api;

import lk.ijse.dep9.app.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void createUserAccount(@Valid @RequestBody UserDTO user){

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping(value = "/me",consumes = "application/json")
    public void updateUserAccountDetails(@RequestBody@Valid UserDTO user){
        System.out.println(user);

    }
    @GetMapping("/me")
    public void getUserAccountDetails(){

    }
    @DeleteMapping("/me")
    public void DeleteUserAccount(){

    }
}
