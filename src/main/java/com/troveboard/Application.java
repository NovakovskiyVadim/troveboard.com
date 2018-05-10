package com.troveboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String showWelcomePage(){

        System.out.println("GGGGGGGGGOOOOOOOOOOODDDDDDDDDDDD!!!!!!!!!!");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");

//        return "Good";
        return "index.html";
    }


    /*

    location / {
        proxy_set_header X-Forwarded-Host $host;
        proxy_set_header X-Forwarded-Server $host;
        proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
        proxy_pass http://188.120.224.64:8082/;
    }

     */


}
