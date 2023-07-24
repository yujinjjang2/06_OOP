package edu.kh.oop.practice.model.vo;

// 클래스 다이어그램 .. 시험에 나올수도~!
public class Hero {
	
	// 필드 == 멤버변수
	private String job; // 직업이름
	private int hp; // HP
	private int mp; // MP
	private char gender; // 성별
	private int level; // 레벨
	
	
	// 생성자
	// 기본생성자 단축키 ctrl + space + enter
	public Hero() {}
	
	// 메서드
	public void attack() {
		System.out.println(job + "가 기본 공격을 했다.(-150)");
	}
	
	public void jump() {
		System.out.println(job + "의 점프!");
	}
	
	// getter / setter
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public int getMp() {
		return mp;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return level;
	}

}
