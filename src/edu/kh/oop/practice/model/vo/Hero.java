package edu.kh.oop.practice.model.vo;

public class Hero {
	
	private String job;
	private int hp;
	private int mp;
	private char gender;
	private int level;
	
	public Hero() { }
	
	public void attack() {
		System.out.println(job + "가 기본 공격을 했다.(-150)");
	}
	
	public void jump() {
		System.out.println(job + "의 점프!");
	}
	
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
