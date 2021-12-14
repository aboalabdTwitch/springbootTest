package com.example.demo.Pages.login;

import com.example.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends JpaRepository<User,Long>{
//    public Optional<login> findByUsername(String username);

//    public User findByName(String username);

}
