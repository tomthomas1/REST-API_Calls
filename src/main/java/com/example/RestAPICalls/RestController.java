package com.example.RestAPICalls;
import com.example.RestAPICalls.entity.User;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
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

    /** UC 2 :
     * Method to pass name as query parameter
     *
     * @param name - We are passing the name from the client in the URL.
     * @return - will return the string message
     * URL : http://localhost:8080/hello/query?name=Tom
     */
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String helloUser(@RequestParam(value = "name") String name){
        return "Hello " + name + ". Welcome to Bridgelabz.";
    }

    /** UC3 :
     * Method to pass name as path variable
     * @param name - We are passing the name from the client in the URL.
     * @return - will return the string message
     * URL : http://localhost:8080/hello/param/Tom
     */
    @GetMapping("/param/{name}")
    public String helloUserParam(@PathVariable String name){
        return "Hello " + name + ". Welcome to Bridgelabz.";
    }


    /** UC4 :
     *Method using Post to pass firstname and lastname in the body.
     * We are using the JSON file format and passing the data.
     *
     * @param user - We are passing the entity user.
     * @return - Will return the string message
     * http://localhost:8080/hello/post
     */
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return " Hello " + user.getFirstName()  + " "+ user.getLastName() + ". Welcome to BridgeLabz";
    }

    /** UC 5 :
     * Method using PUT and pass first name as path variable and last name as Query parameter
     *
     * @param firstName - firstname as path variable
     * @param lastName - lastname as query parameter
     * @return -  the output string message.
     *  URL : http://localhost:8080/hello/put/Tom/?lastName=Thomas
     */
    @PutMapping ("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello " + firstName + " " + lastName  + ". Welcome to BridgeLabz";
    }
    
}

