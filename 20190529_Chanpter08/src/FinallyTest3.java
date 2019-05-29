
public class FinallyTest3 {

	public static void main(String[] args) {
		FinallyTest3.method1();
		
		//method1()은 static메서드이므로 인스턴스 생성없이 직접 호출이 가능하다.
		
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다.");
	}

	
	static void method1() {
		
		try {
			System.out.println("method1()이 호출되었습니다.");
			return; //현재 실행중인 메서드를 종료한다
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
	}
	
}


/* 위의 결과에서 알 수 있듯이, try블럭에서 return문이 실행되는 경우에도 finally블럭의 문장들이 먼저 실행된후에, 현재 실행중인 메서드를 종료한다.abstract

이와 마찬가지로 catch블럭의 문자 수행중에 return문을 만난도 fianlly블럭의 문장들은 수행된다 */