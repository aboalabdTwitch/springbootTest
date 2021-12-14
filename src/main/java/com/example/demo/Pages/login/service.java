package com.example.demo.Pages.login;
import com.example.demo.Entity.Address;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class service {

    @Autowired
    private repository repository;
    @Autowired
    private AddressRep addressRep;

    public List<User> getUsers(){
        return repository.findAll();
    }
    public List<Address> getAddress(){
        return addressRep.findAll();
    }

    public User SaveUsers(User user){
//        login log=repository.findByUsername(login.getUsername());
//        if (log.getId()!=null) {
//            throw new IllegalStateException("Token");
//        }
        return repository.save(user);
    }
    public Address saveAddress(Address address){
        return addressRep.save(address);
    }

    public Optional<User> getUser(Long id){
        return repository.findById(id);
    }



}
