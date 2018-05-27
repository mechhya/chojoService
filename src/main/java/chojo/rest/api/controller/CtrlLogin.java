package chojo.rest.api.controller;


import chojo.rest.api.dto.LoginDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@RestController
public class CtrlLogin {

    @PostMapping(value= "/login", produces = "application/json")
    public LoginDto validateUser(@RequestBody LoginDto reqLoginDto){

        LoginDto resLoginDto = new LoginDto();
        resLoginDto.setUserName("hello " + reqLoginDto.getUserName());
        resLoginDto.setPassword("Password " + reqLoginDto.getPassword());
        return resLoginDto;
    }
}
