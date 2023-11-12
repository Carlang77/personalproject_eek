package ee.mainor.myproject.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {


    @GetMapping("/register")
    public String getRegisterPage(){
        return "register_page";
    }


    @GetMapping("/login")
    public String getLoginPage(){
        return "login_page";
    }


}
