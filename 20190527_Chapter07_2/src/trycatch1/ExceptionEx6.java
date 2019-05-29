package trycatch1;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //0으로 나눠서 ArithmeticException을 발생시킨다
			System.out.println(4); //실행되지 않는다
			
		}catch(Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}

/*
이예제는 예제 8-5를 변경한 것인데, 결과는 같다
catch블럭의 괄호()안에 ArithmeticException타입의 참조변수 대신에 Exception클래스의 참조변수를 선언하였다

ArithmeticException클래스는 Exception클래스의 자손이므로 ArithmeticException인스턴스와 Exception클래스와의 instanceof연산결과가 true가 되어
Exception클래스타이의 참조변수를 선언한 catch블럭의 문장들이 수행되고 예외는 처리되는 것이다 */