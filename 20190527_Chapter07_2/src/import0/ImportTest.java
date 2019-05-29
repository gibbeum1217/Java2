/*import문
클래스의 코드를 작성하기 전에 import문으로 사용하고자 하는 클래스의 패키지를 미리 명시해주면 소스코드에서 사용되는 클래스이름에서 패키지명은 생략할 수 있다
import문의 역할은 컴파일러에게 소스파일에 사용된 클래스의 패키지에 대한 정보를 제공하는 것이다.
컴파일시에 컴파일러는 import문을 통해 소스파일에 사용된 클래스들의 패키지를 알아 낸 다음, 모든 클래스이름 앞에 패키지명을 붙여 준다.
이클립스는 단축기 ctrl+shift+o를 누르면, 자동으로 import문을 추가해주는 편리한 기능을 가지고 있다.abstract

3.4 import문의 선언
모든 소스파일(.java)에서 import문은 package문 다음에, 그리고 클래스 선언문 이전에 위치해야한다
import문은 package문과 달리 한 소스파일에 여러번 선언할 수있다.

import문을 선언하는 방법은 다음과 같다
import 패키지명.클래스명;
또는
import 패키지명.*;*/




package import0;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {

		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 "+date.format(today));
		System.out.println("현재 시간은"+time.format(today));
	
	}

}
