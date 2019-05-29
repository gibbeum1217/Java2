package trycatch1;

public class ExceptionEx3 {

	public static void main(String args[]) {

		int number = 100;
		int result =0;
		
		
		for(int i=0; i<10; i++) {
			
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("0");
				
			}
		}
	}
}
	
	/*위의 결과에서 보면, 4번째에 0이 출력되었는데 그 이유는 for문의 4번째 반복에서 ArithmeticException이 발생했기 때문이다
	
	그래서 ArithmeticException에 해당하는 catch블럭을 찾아서 그 catch블럭 내의 문장들을 실행한다음 try-catch문을 벗어나 for문의 다음 반복을 계속 수행하여 작업을 모두 마치고 정상적으로
	종료되었다. 만일 예외처리를 하지 않았다면,세 번째 줄까지만 출력되고 예외가 발생해서 프로그램이 비정상적으로 종료되었을 것이다. */