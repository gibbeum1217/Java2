
public class ExceptionEx17 {

	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		
	}

} //main메서드의 끝


static void method1() throws Exception{
	
	try {
		throw new Exception();
		
	}catch(Exception e) {
		System.out.println("method1메서드에서 예외가 처리되었습니다.");
		throw e; // 다시 예외를 발생시킨다
		}
	} //method1메서드의 끝 
}


/* 예외를 처리한 후에 인위적으로 다시 발생시키는 방법을 통해서 가능한데, 이것을 예외되던지기 라고 한다

먼저 예외가 발생할 가능성이 있는 메서드에서 try-catch문을 사용해서 예외를 처리해주고 catch문에서 필요한 작업을 행한 후에 throw문을 사용해서 예외를 다시 발생시킨다

다시 발생된 예외는 이 메서드를 호출한 메서드에게 전달되고 호출한 메서드의 try-catch문에서 예외를 또다시 처리한다.abstract
 
결과에서알 수 있듯이 method1()과 main메서드 양쪽이ㅡ catch블럭이 모두 수행되었음을 알수있다
method1()의 catch블럭에서 예외를 처리하고도 throw문을 
통해 다시 예외를 발생 시켰다. 
그리고 이 예외를 main메서드 한번 더 처리하였다. 

   반환값이 있는 return문의 경우, catch블럭에도 return문이 있어야한다. 예외가 발생했을 경우에도 값을 반환하기 때문이다.abstract

static int method1(){
	try{
		System.out.println("method1()이 호출되었습니다.");
		return  0; //현재 실행 중인 메서드를 종료한다
		}catch(Exception e){
		e.printStackTrace();
		return 1; // catch블럭내에도 return문이 필요하다
		}finally{
		System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
		}
		
		또는 catch블럭에서 예외 되던지기를 해서 호출한 메서드로 예외를 전달하면 return문이 없어도 된다
		
		static int method1() throws Exception{ //예외를 선언해야함
			try{
				System.out.println("method1()이 호출되었습니다.");
				return 0;
			}catch(Exception e){
				e.printStackTrace();
				
				return1;
				throw new Exception();
				
				}finally{
				System.out.println("method1()의 finally블럭이 실행되었습니다.");
				}
			}
			
			*/
		
		
}