package com.example.demo.Pages.login;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping
public class controler {

    @Autowired
    private service service;


    @GetMapping("/login")
    public List<User> any(){
    return service.getUsers();
    }
    @GetMapping("/getaddress")
    public List<Address> addresses(){
        return service.getAddress();
    }

    @PostMapping("/user")
    public List<User> saveUsers(@RequestBody User login){
        System.out.println(login.getName());
        return List.of(service.SaveUsers(login));
    }

    @PostMapping("/address")
    public List<Address> saveUsers(@RequestBody Address address){
        System.out.println(address.getCity());
        return List.of(service.saveAddress(address));
    }

    @GetMapping("/username/{id}")
    public String users(@PathVariable("id") Long id)
    {
        if (service.getUser(id).isPresent())
        return service.getUser(id).get().getAddress().getCity();
        else return "not Found";

    }





}
