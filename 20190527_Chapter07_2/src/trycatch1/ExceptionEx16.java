package trycatch1;


import java.io.*;

public class ExceptionEx16 {

	public static void main(String[] args) {
		
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"다시 입력해 주시기 바랍니다.");
		}
	}


static File createFile(String fileName) throws Exception{
	
	if(fileName==null || fileName.equals(""))
		throw new Exception("파일이름이 유효하지 않습니다.");
	File f = new File(fileName); //File클래스의 객체를 만든다
	
	f.createNewFile(); //file객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
	return f; // 생성된 객체의 참조를 반환한다.
	} //createFile메서드의 끝 
} //클래스의끝 


/* 이 예제에서는 예외가 발생한 createFile메서드에서 잘못 입력된 파일이름을 임의로 처리하지 않고, 호출한 main메서드에게 예외가 발생했음을 알려서 
파일이름을 다시 입력 받도록 하였다.

앞의 예제와 달리 createFile메서드에 예외를 선언했기 때문에, File클래스의 createNewFile()에 대한 예외처리를 하지 않앋 되므로
creatNewFile(File f)메서드를 굳이 따로 만들지 않았다

두 예제 모두 커맨드라인으로부터 파일이름을 압력 받아서 파일을 생성하는 일을 하며, 파일 이름을 잘못 입력했을때(null또는 빈 문자열일 때) 예외가 발생하도록 되어있다

차이점은 예외의 처리방법에 있다 앞의 예는 예외가 밸사한 creatFile메서드 자체내에서 처리를 하며
이 예는 createFile메서드를 호출한 메인메서드에서 처리를 한다 
이처럼 예외가 발생한 메서드내에서 자체적으로 처리해도 되는 것은 메서드 내에서 try-catch문을 사용해서 처리하고,
두번째 예제처럼 메서드에 호출시 넘겨받아야할값(fileName)을 다시 받아야 하는경우(메서드 내에서 자체적으로 해결이 안 되는 경우) 에는
예외를 메서드에 선언해서, 호출한 메서드에서 처리해야한다. */