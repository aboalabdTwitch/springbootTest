package com.example.demo.Pages.login;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRep extends JpaRepository<Address,Long> {
}
