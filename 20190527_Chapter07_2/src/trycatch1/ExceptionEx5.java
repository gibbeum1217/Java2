package trycatch1;

public class ExceptionEx5 {

	
	public static void main(String args[]) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0으로 나눠서 고의로 ArithmeticExcpetion을 발생시킨다
			System.out.println(4);//실행되지 않는다
		}catch(ArithmeticException ae) {
			System.out.println(5);
		}
		
		System.out.println(6);
	}
}

/*
위의 예제의 결과를 보면, 1,2,3을 출력한 다음 try블럭에서 예외가 발생했기 때문에 try 블럭을 바로 벗어나서 System.out.println(4);는 실행되지 않는다
그리고는 발생한 예외에 해당하는 catch블럭으로 이동하여 문장들을 수행한다
다음엔 전체 try-catch문을 벗어나서 그 다음 문장을 실행하여 6을 화면에 출력한다.abstract
*/