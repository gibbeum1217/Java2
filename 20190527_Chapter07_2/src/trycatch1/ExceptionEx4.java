package trycatch1;

public class ExceptionEx4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		}catch(Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}


/*실행결과
1
2
3
4
6*/

/*위의 예제에서는 예외가 발생하지 않았으므로 catch블럭의 문장이 실행되지 않았다
다음의 예제는 위의 예제를 변경해서 try블럭에서 예외가 발생하도록 하였다.*/