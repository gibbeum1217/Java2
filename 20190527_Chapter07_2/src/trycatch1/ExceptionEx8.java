package trycatch1;

public class ExceptionEx8 {

	
	public static void main(String args[]) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 예외발생!!
			System.out.println(4); // 실행되지 않는다
		}catch(ArithmeticException ae) {
		ae.printStackTrace(); // 참조변수 ae를 통해 생성된 ArithmeticException인스턴스에 접근할 수 있다
		System.out.println("예외메시지:" + ae.getMessage());
		
	}
		System.out.println(6);
	}
}


/* 위 예제의 결과는 예외가 발생해서 비정상적으로 종료되었을 때의 결과와 비슷하지만 예외는 try-catch문에 의해 처리되었으며 프로그램은 정상적으로 종료되었다.
그 대신 ArithmeticException인스턴스의 printStackTract()를 사용해서, 호출스택에 대한 정보와 예외메시지를 출력하였다

 이처럼 try-catch문으로 예외처리를 하여 예외가 발생해도 비정상적으로 종료하지 않도록 해주는 동시에, printStackTrace() 또는 getMessage()와 같은 메서드를 통해서 예외의
발생원인을 알 수 있다


멀티 catch블럭
JDK1.7부터 여러 catch블럭을 |기호를 이용해서, 하나의 catch블럭으로 합칠 수 있게 되었으며, 이를 멀티 catch블럭이라 한다
아래의 코드에서 알 수 있듯이 멀티 catch블럭을 이용하면 중복된 코드를 줄일 수 있다
그리고 |기호로 연결할 수 있는 예외 클래스의 개수에는 제한이 없다


만일 멀티 catch블럭의 |기호로 연결된 예외 클래스가 조상과 자손의 관계에 있다면 컴파일 에러가 발생한다

try {
	...
	
}catch(ParentException|ChildException e){ // 에러!
	e.prinkStackTrace();
	
}


왜냐하면 두 예외 클래스가 조상과 자손의 관계에 있다면, 그냥 다음과 같이 조상 클래스만 써주는 것가 똑같기 때문이다. 불필요한 코드는 제거하라는 의미에서 에러가 발생하는 것이다
try{
	...
	}catch(ParentException e){
		e.prinsStackTrace();
}

그리고 멀티 catch는 하나의 catch블럭으로 여러 예외를 처리하는 것이기 떄문에, 발생한 예외를 멀티 catch블럭으로 처리하게 되었을 때
멀티 catch블럭내에서는 실제로 어떤 예외거 발생한 것인지 알 수 없다
그래서 참조변수 e로 멀티 catch블럭에 |기호로 연결된 예외클래스들의 공통분모인 조상 예외 클래스에 선언된 멤버만 사용할 수 있다.*/