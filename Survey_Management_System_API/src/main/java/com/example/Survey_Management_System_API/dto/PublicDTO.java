package com.example.Survey_Management_System_API.dto;


public class PublicDTO {
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private Long publicId;
	
    private String nickname;
    private int age;
    
}
