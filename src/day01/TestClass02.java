package day01;

public class TestClass02 {

	public static void main(String[] args) {
		/*
		 escape
		 -문자열 안에서 특수한 기능을 한다.
		 \n : 엔터값과 비슷하다.
		 \t : tab크기만큼 오른쪽으로 커서 이동
		 \ ": "(큰따옴표)하나 표현
		 \\ : 역슬러시 하나 표현
		 
		 */
		System.out.println( "안\n녕\n하\n세\n여" );
		System.out.println("안\t녕\t하\t세\t요");
		System.out.println("이름\t나이");
		System.out.println("홍길동\t20살");
		
		System.out.println("   \" \\  ");
		System.out.println("C:\\0.공유자료\\내가 만든 폴더");
	}

}
