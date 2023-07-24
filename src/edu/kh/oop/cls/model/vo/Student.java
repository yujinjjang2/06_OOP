package edu.kh.oop.cls.model.vo;

public class Student { // 클래스 선언부
// [접근제한자] [예약어] class 클래스명	
	
	// 접근제한자 public : 같은 프로젝트 내에서
	// 					   어떤 클래스에서든 import 할 수 있음을 나타냄.
	
	
	// 1. 필드(field) : 객체의 속성을 작성하는 클래스 내부 영역
	// == 멤버 변수 : 메서드 밖에 작성된 변수
	
	// 인스턴스 변수 : 필드에 작성되는 일반 변수
	// ex) private int age;
	// 클래스 변수( == static 변수 ) : 필드에 static 예약어가 작성된 변수
	
	
	/* 필드 구성 (대괄호는 생략가능)
	 *   [접근제한자]     [예약어]      자료형     변수명       [=초기값;]
	 * +   public          final      기본자료형
	 * #   protected       static      (참조형)
	 * ~   (default)    final static     배열
	 * -   private      static final   클래스명
	 *
	 * 
	 * 필드의 접근 제한자의 뜻 : 직접 접근 가능한 범위를 나타냄.
	 */
	
	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	private int v4 = 40;
	
	// 접근 제한자 예제
	public void ex() {
		System.out.println( v1 );
		System.out.println( v2 );
		System.out.println( v3 );
		System.out.println( v4 );
	}
	
	// ---------------------------------------------
	
	public static String schoolName = "KH고등학교";
	
	private String name; // 캡슐화 원칙 -> 간접 접근 방법 필요
	
	{// 초기화 블록 : 객체 생성 시 필드 값 초기화
		name = "김길동";
	}
	
	
	// getter/setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	// 2. 생성자(constructor)
	
	
	// 3. 메서드(method)
	
	
	
	
	
	
	
	
	
	
	
	
	
}
