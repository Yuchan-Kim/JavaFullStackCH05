package com.javaex.ex01;

public class Member {
	
	//필드
	private String id;
	private String name;
	private int point;
	
	//생성자
	public Member (String name, String id, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	//Getter / Setter Method
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//Method
	public void showInfo() {
		System.out.println("회원정보: " + this.name + 
				"(" + this.id + "), " + this.point + "점");
	}
	
	
}
