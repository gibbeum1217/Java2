/*상속이란 ★기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다.
상속을 통해서 클래스를 작성하면 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리 할 수 있기 때문에
코드의 추가 및 변경이 매우 용이하다.

class Child extends Parent{

}

이 두 클래스는 서로 상속관계에있다고 하며, 상속해주는 클래스를 '조상클래스'라 하고 상속 받는 클래스를 '자손 클래스'라 한다.
자손클래스는 조상 클래스의 모든 멤버를 상속받기 때문에, Child클래스는 Parent클래스의 멤버들을 포함한다고 할 수 있다. 

만약 Parent클래스에 age라는 정수형 변수를 멥버변수로 추가하면, 자손 클래스는 조상의 멤버를 모두 상속받기 때문에
Child클래스는 자동적으로 age라는 멤버변수가 추가된것과 같은 효과를 얻는다


이번엔 반대로 자손인 Child클래스에 새로운 멤버로 play()메서드를 추가해보자.

class Parent{
	int age;
}
class Child extends Parent{
	
	void play() {
		System.out.println("놀자~");
	}
}

조상 클래스가 변경되면 자손 클래스는 자동적으로 영향을 받게 되지만, 자손 클래스가 변경되는 것은 조상 클래스에 아무런 영향을 주지 못한다.★
자손 클래스는 조상 클래스의 모든 멤버를 상속 받으므로 항상 조상 클래스보다 같거나 많은 멤버를 갖는다. 

class Parent{}
class Child extends Parent{}
class Child2 extends Parent{}

클래스 Child와 Child2가 모두 Parent클래스를 상속받고 있으므로 Parent클래스와 Child클래스, 그리고 Parent클래스와 Child2클래스는 서로 상속관계에 있지만
클래스 Child와 Child2간에는 서로 아무런 관계도 성립되지 않는다. 클래스 간의 관계에서 형제관계와 같은 것은 없다.
부모와 자식의 관계(상속관계)만이 존재할 뿐이다.

*/




class Tv{
	boolean power;
	int channel;
	
	void power() { power =! power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}


/*
 * Tv클래스로부터 상속받고 기능을 추가하여 CaptionTv클래스를 작성하였다. 멤버변수 caption은 캡션기능의 상태를 저장하기 위한
 * boolean형 변수이고 displayCaption(String text)은 매개변수로 넘겨받은 문자열(text)를 캡션이 켜져있는
 * 경우(caption의 값이 true인 경우)에만 화면에 출력한다.
 * 
 * 자손 클래스의 인스턴스를 생성하면 조상클래스의 멤버도 함께 생성되기 때문에 따로 조상클래스의 인스턴스를 생성하지 않고도 조상 클래스의
 * 멤버들을 사용할 수 있다.
 * 
 * Caption Tv: caption displayCaption() Tv(power, channel, power(), channelUp(),
 * channelDown() 전부다 포함)
 */
class CaptionTv extends Tv{
	
	boolean caption;
	void displayCaption(String text) {
		if(caption) { //캡션 상태가 on(true)일때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption=true;
		ctv.displayCaption("Hello, World");
	}

}
