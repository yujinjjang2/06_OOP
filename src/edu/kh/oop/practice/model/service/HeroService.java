package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		Hero warrior = new Hero();
		Hero wizard = new Hero();
		Hero healer = new Hero();
		
		warrior.setJob("워리어");
		warrior.setHp(18000);
		warrior.setMp(5000);
		warrior.setGender('남');
		warrior.setLevel(5);
		
		wizard.setJob("마법사");
		wizard.setHp(5000);
		wizard.setMp(25000);
		wizard.setGender('여');
		wizard.setLevel(2);
		
		healer.setJob("힐러");
		healer.setHp(10000);
		healer.setMp(50000);
		healer.setGender('남');
		healer.setLevel(10);
		
		System.out.println("직업 : " + warrior.getJob());
		System.out.println("hp : " + warrior.getHp());
		System.out.println("mp : " + warrior.getMp());
		System.out.println("성별 : " + warrior.getGender());
		System.out.println("현재 레벨은 " + warrior.getLevel() + " 입니다.");
		
		System.out.println();
		
		System.out.println("직업 : " + wizard.getJob());
		System.out.println("hp : " + wizard.getHp());
		System.out.println("mp : " + wizard.getMp());
		System.out.println("성별 : " + wizard.getGender());
		System.out.println("현재 레벨은 " + wizard.getLevel() + " 입니다.");
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		wizard.attack();
		warrior.setHp( warrior.getHp() - 150 ); // 17850
		
		System.out.println();
		
		System.out.println("직업 : " + warrior.getJob());
		System.out.println("hp : " + warrior.getHp());
		System.out.println("mp : " + warrior.getMp());
		System.out.println("성별 : " + warrior.getGender());
		System.out.println("현재 레벨은 " + warrior.getLevel() + " 입니다.");
		
		System.out.println();
		System.out.println("================================");
		System.out.println("직업 : " + healer.getJob());
		System.out.println("hp : " + healer.getHp());
		System.out.println("mp : " + healer.getMp());
		System.out.println("성별 : " + healer.getGender());
		System.out.println("현재 레벨은 " + healer.getLevel() + " 입니다.");
		
		System.out.println();
		
		healer.jump();
		
	}
}
