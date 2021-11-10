package com.sapiens.SpringMVC;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/")
    public String home(){
        return "Home Page";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "Contact Details: \n" +
                "first Name: Reema \n" +
                "last Name: Dabour \n"+
                "Age: 25 \n"+
                "salary: 7400$";
    }

    @RequestMapping("/about")
    public String about(){
        return "Company Details: \n" +
                "company Name: Sapiens \n" +
                "location: Holon \n";
    }

    @RequestMapping("/gallery")
    public String gallery(){
        return "Photos: \n"+
                "photo1 \n"+
                "photo2 \n"+
                "photo3 \n";
    }
}
