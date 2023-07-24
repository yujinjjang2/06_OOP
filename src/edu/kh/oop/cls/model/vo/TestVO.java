package edu.kh.oop.cls.model.vo;

class TestVO {
	
// 접근제한자 (default) : 같은 패키지내에서만 import가 가능함을 나타냄.
	
	
// Student와 같은 패키지에 있기 때문에
// -> public, protected, (default) 3개는 접근 가능

	public void ex() {
		Student std = new Student();
		
		System.out.println( std.v1 );
		System.out.println( std.v2 );
		System.out.println( std.v3 );
		
		//System.out.println( std.v4 );
		// v4는 private이기 때문에 같은 패키지라도
		// 다른 클래스에서 직접 접근 불가
		
	}


}
