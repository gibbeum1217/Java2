package trycatch1;

import java.io.*;

public class ExceptionEx15 {

	public static void main(String[] args) {
		File f = createFile(args[0]); //command line에서 입력받은 값을 이름으로 갖는 파일을 생성한다. 
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다."); 
	} //main메서드의 끝
	
	static File createFile(String fileName) {
		
		try {
			if(fileName==null||fileName.equals(""))
				throw new Exception("파일이름이 유효하지 않습니다.");
		}catch(Exception e) {
			fileName = "제목없음.txt"; //fileName이 부적절한 경우, 파일이름을 '제목없음.txt'로 한다.
		}finally {
			File f= new File(fileName);
			createNewFile(f); //생성된 객체를 이용해서 파일을 생성한다.
			return f;
		}
	} //createFile메서드의 끝 
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
			
		}catch(Exception e) {}
		
	}

}

/* 이 예제는 예외가 발생한 메서드에서 직접 예외를 처리하도록 되어 있다
createFile메서드를 호출한 main메서드에서는 예외가 발생한 사실을 알지 못한다
적절하지못한 파일이름(fileName)이 입력되면 예외를 발생시키고 catch블럭에서 파일이름을 '제목없음.txt'로 설정해서 파일을 생성한다
그리고 finally블럭에서는 예외의 발생여부에 관계없이 파일을 생성하는 일을 한다. */