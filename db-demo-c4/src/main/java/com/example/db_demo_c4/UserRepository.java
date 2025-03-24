package com.example.db_demo_c4;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    public User findById(int id);
    public void deleteById(int id);
}
