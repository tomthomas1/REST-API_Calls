package com.example.RestAPICalls;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    /** UC-1 :
     * Method to display hello to user.
     * We have used the GET method here
     * @return - Will return the string message.
     * URL : http://localhost:8080/hello
     */
    @GetMapping("/hello")
    public String helloUser(){
        return "Hello. Welcome to BridgeLabz.";
    }
}

