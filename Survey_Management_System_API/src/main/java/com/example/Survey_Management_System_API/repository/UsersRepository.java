package com.example.Survey_Management_System_API.repository;

import com.example.Survey_Management_System_API.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> { }
