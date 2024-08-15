package com.example.Survey_Management_System_API.repository;

import com.example.Survey_Management_System_API.entity.Public;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicRepository extends JpaRepository<Public, Long> { 
	 boolean existsByNickname(String nickname);
	 

}
