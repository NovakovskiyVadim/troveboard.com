package com.troveboard.service;

import com.troveboard.model.User;
import com.troveboard.repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@RequestMapping("/api")
public class API {

    @Autowired
    private RegistrationRepo registrationRepo;

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    @ResponseBody
//    public String registration(@RequestParam String email, @RequestParam String password) {
    public String registration(@RequestBody User user) {

        //$ curl 'localhost:8082/api/registration?email=String&password=String'
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());

        return "success";

//        User user = registrationRepo.findByEmail(email);
//
//        if (user != null) {
//
//            if (user.getStatus().equals("reg")) {
//                return "User already exists1";
//            } else {
//                user.setPassword(password);
//                user.setStatus("reg");
//
//                registrationRepo.save(user);
//
//                return "success1";
//            }
//
//        } else {
//            user = new User();
//            user.setEmail(email);
//            user.setPassword(password);
//            user.setStatus("reg");
//
//            registrationRepo.save(user);
//
//            return "success2";
//        }
    }

    @RequestMapping("/trial")
    @ResponseBody
    public String trialVersion(@RequestParam String name, @RequestParam String email) {

        //$ curl 'localhost:8082/api/trial?name=String&email=String'

        User user = registrationRepo.findByEmail(email);

        if (user != null) {
            return "User already exists2";
        } else {
            user = new User();
            user.setEmail(email);
            user.setName(name);
            user.setStatus("trial");

            registrationRepo.save(user);

            return "success3";
        }
    }
}