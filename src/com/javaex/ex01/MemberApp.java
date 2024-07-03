package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member member01 = new Member("정우성","jws",50000);
		Member member02 = new Member("유재석","yjs",30000);
		Member member03 = new Member("이효리","lhr",40000);
		
		member01.showInfo();
		member02.showInfo();
		member03.showInfo();
	}

}
