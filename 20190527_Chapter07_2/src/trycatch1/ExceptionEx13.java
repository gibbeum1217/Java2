package trycatch1;

public class ExceptionEx13 {

	public static void main(String[] args) {
		method1(); //같은 클래스의 static멤버이므로 객체생성없이 호출 가능
	}
	
	static void method1() {
		
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}

}

//예외는 처리 되었지만 printStackTrace()를 통해 예외에 대한 정보를 화면에 출력하였다
//예외가 method1()에서 발생했으며 main메서드가 method1()을 호출했음을 알 수 있다 

/* 1.클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통적으로 사용해야하는 것에 static을 붙인다.

- 인스턴스를 생성하면, 각 인스턴스들은 서로 독립적기 때문에 서로 다른 값을 유지한다. 경우에 따라서는 각 인스턴스들이 공통적으로 같은 값이 유지되어야 하는 경우 static을 붙인다.







2. static이 붙은 멤버변수는 인스턴스를 생성하지 않아도 사용할 수 있다.

- static이 붙은 멤버변수(클래스변수)는 클래스가 메모리에 올라갈때 이미 자동적으로 생성되기 때문이다.


*/
	
	