package com.example.Survey_Management_System_API.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Public {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publicId;

    private String nickname;
    private Integer age;
	public Long getPublicId() {
		return publicId;
	}
	public void setPublicId(Long publicId) {
		this.publicId = publicId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
    
}
