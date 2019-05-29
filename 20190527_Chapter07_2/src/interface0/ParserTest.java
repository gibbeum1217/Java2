/*두 조상으로부터 상속받는 멤버 중에서 멤버변수의 이름이 같거나 메서드의 선언부가 일치하고 구현 내용이 다르다면 
이 두 조상으로부터 상속받는 자손클래스는 어느 조상의 것을 상속받게 되는것인지 알 수 없다. 어느 한쪽으로부터의 상속을 포기하던가, 이름이 충돌하지 않도록 조상클래스를 변경하는 수밖에 없다.abstract

자바도 인터페이스를 이용하면 다중상속이 가능하다라고 하는 것일 뿐 자바에서 인터페이스로 다중상속을 구현하는 경우는 거의 없다
인터페이스는 static상수만 정의할수 있으므로 조상클래스의 멤버변수와 충돌하는 경우는 거의 없고
충돌된다 하더라도 클래스 이름을 붙여서 구분이 가능하다
그리고 추상메서드는 구현내용이 전혀 없으므로 조상클래스의 메서드와 선언부가 일치하는 경우에는 당연히 조상 클래스 쪽의 메서드를 상속받으면 되므로 문제되지 않는다
그러나, 이렇게 하면 상속받는 멤버의 충돌은 피할 수 있지만, 다중상속의 장점을 잃게 된다

예를들어 다음과 같이 Tv클래스와 VCR클래스가 이을때 TVCR클래스를 작성하기위해 두 클래스로부터 상속을 받을 수만 있으면 좋겠지만 다중상속을 허용하지 않으므로
한 쪽만 선택하여 상속받고 나머지 한 쪽은 클래스 내에 포함시켜서 내부적으로 인스턴스를 생성해서 사용하도록 한다
*/



package interface0;

interface Parseable{ //Parseable 인터페이스는 구문분석(parsing)을 수행하는 기능을 구현할 목적으로 추상메서드 parse(String fileName)을 정의했다
	public abstract void parse(String fileName);
}


class ParserManager{
	             // 리턴타입           이름
	public static Parseable getParser(String type) { //ParserManager 클래스의 getParser메서드는 매개변수로 넘겨받는 type의 겂애 따라 XMLParser인스턴스
		//또는 HTMLParser인스턴스를 반환한다   getParser메서드의 수행결과로 참조변수 parser는 XMLParser인스턴스의 주소값을 갖게 된다
		//마치 Parseable parser = new XMLParser();이 수해된것과 같다
		
		if(type.equals("XML")){
			return new XMLParser();
		}else {
			Parseable p = new HTMLParser();
			return p;
			
		}
	}
}

class XMLParser implements Parseable{ //그리고 XMLParser클래스와 HTMLParser클래스는 Parseable 인터페이스를 구현하였다
	public void parse(String fileName) {
		System.out.println(fileName + "-XML parsing completed.");
	}
}

class HTMLParser implements Parseable{
	
	public void parse(String fileName) {
		System.out.println(fileName + "-HTML parsing completed.");
	}
}


public class ParserTest {
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML");  //ParserMangager클래스의 스태틱메서드 getParser!!
		parser.parse("document.xml");     //참조 변수 parser를 통해 parse()를 호출하면 parser가 참조하고있는 XMLParser인스턴스의 parse메서드가 호출된다
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
