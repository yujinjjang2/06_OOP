package edu.kh.oop.cls.model.vo;

public class User {

	// 속성 ( == 필드 )
	// 아이디, 비밀번호, 이름, 나이, 성별 ( 추상화 진행 )
	// 데이터 직접접근 불가원칙 -> 필드는 기본적으로 모두 private ( 캡슐화 진행 )
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	
	// 기능 ( == 생성자 + 메서드 )
	
	// 생성자 : new 연산자를 통해서 객체가 생성될 때
	//       생성된 객체의 필드값 초기화 + 기능 수행 역할.
	
	
	// 기본생성자
	public User() {
		// 기능
		System.out.println("기본 생성자로 User 객체 생성");
		
		// 필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "홍길동";
		userAge = 20;
		userGender = '남';
		
		// 기본 생성자를 이용해서 User객체를 만들면
		// 그 객체는 프린터 구문을 수행하고,
		// 필드 초기화구문을 거쳐서 홍길동 하나가 만들어짐
		
	}
	
	
	// 매개변수 생성자
	// ** 사용되는 기술 , 변수 : 매개변수, Overloading(오버로딩), this
	
	// ** 매개변수 : 생성자나 메서드 호출 시 ()안에 작성되어
	//              전달되어지는 값을 저장하는 변수
	// -> 전달 받은 값을 저장하고 있는 매개체(지니고있는) 역할의 변수
	public User( String userId , String userPw ) {
		
		System.out.println("매개변수 생성자를 이용해서 User 객체 생성");
		System.out.println(userId + "/" + userPw);
		
		this.userId = userId;
		this.userPw = userPw;
		// 필드     = 매개변수
		
		// 매개변수로 전달받은 값을 필드에 초기화 (this 참조 변수)
		// *** this 참조변수 ***
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
		// - 모든 객체 내부에 숨겨져있다.
		// 왜 사용?
		// -> 필드명과 매개변수명이 같을경우
		//  이를 구분하기 위해서 사용한다.
		// 개발자들이 지켜야할 룰: 매개변수명과 필드변수명 동일하게!
		
	}
	
	
	// 필드를 전부 초기화 하는 목적의 매개변수 생성자
	public User( String userId, String userPw, String userName,
			int userAge, char userGender ) {
		
//		System.out.println();
		
		// this() 생성자
		// 같은 클래스의 다른 생성자를 호출할 때 사용
		// 생성자 내에서 반드시 첫번째 줄에 작성되어야한다! 위에 다른코드쓰면 에러
		//Constructor call must be the first statement in a constructor
		// -> 생성자 호출은 반드시 첫번째 줄에 작성해야만 한다!
		// 왜 사용하는가?
		// 중복 코드 제거, 코드 길이 감소, 재사용성 증가
		// 가독성이 좀 어려운 경우가 생길 수 있어서 많이 사용되지 않음.
		
		this(userId, userPw);
		//this.userId = userId;
		//this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	
	
	// 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의
	// 중복을 허용하지 않음.
	//private String userId; // Duplicate field User.userId
	//public User() {} // Duplicate method User() in type User
	
	
	// ** 오버로딩 (Over loading) ** 오버라이딩이랑 면접에서 많이 물어봄..~~
	// - 클래스 내에 동일한 이름의 메서드(생성자도 포함)를
	// 여러개 작성하는 기법
	
	// -> 하나의 이름으로 여러 기능을 수행할 수 있게 하는 것
	
	// [오버로딩 조건]
	// 1) 메서드의 이름이 동일
	// 2) 매개변수의 개수, 타입, 순서 중 1개라도 달라야 함.
	
	//public User() {} // 기본 생성자가 이미 작성되어 있어서 중복
	
	public User(String userId) {} // 매개변수의 개수 같은 생성자 없음
									// 오버로딩 성립
	
	public User(int userAge) {} // 매개변수의 개수는 같지만 타입이 다름
									// 오버로딩 성립
	
	public User(String userId, int userAge) {}
	// 매개변수의 개수와 동일한것은 있으나 하나의 타입이 다름
	
	public User(int userAge, String userId) {}
	// 매개변수의 개수, 타입은 같지만 순서가 다름
	
	//public User(int userAge, String userName) {} // 에러
	// 매개변수의 개수, 타입, 순서가 모두 같아서 오버로딩 불가
	// -> 변수명은 신경쓰지 않는다!


	// 캡슐화로 인한 간접 접근 기능 (getter/setter)
	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getUserPw() {
		return userPw;
	}



	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public int getUserAge() {
		return userAge;
	}



	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}



	public char getUserGender() {
		return userGender;
	}



	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
	
	
	
	
}
