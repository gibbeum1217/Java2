package polymorphism;

public class polymorphism {

}



/* 5.1다형성이란?
		
		객체지향 개념에서 다형성이란 여러 가지 형태를 가질수 있는 능력을 의미하며, 자바에서는 한타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함 ★으로써
		다형성을 프로그램적으로 구현하였다
		이를 좀더 구체적으로 말하자면, 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하였다는 것이다. 예제를 통하여 보다 자세히 알아보도록 하자
		
		class Tv{
	boolean power;
	int channel;
	
	void power() {power =! power;}
	void channelUp() {++channel;}
	void channelDwon() {--channel;}
	
}

class CaptionTv extends Tv{
	
String text;
void caption() {}
}



Tv t = new Tv();
CaptionTv c = new CaptionTv();

지금까지 우리는 생성된 인스턴스를 다루기 위해서, 인스턴스의 타입과 일치하는 참조변수만을 사용했다.
즉 Tv인스턴스를 다루기 위해서는 Tv타입의 참조변수를 사용하고, CaptionTv인스턴스를 다루기 위해서는 CaptionTv타입의 참조변수를 사용했다

   이처럼 인스턴스의 타입과 참조변수의 타입이 일치하는 것이 보통이지만, Tv와 CaptionTv클래스가 서로 상속관계에 있을 경우, 다음과 같이 조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조하도록 
   하는 것도 가능하다
   
   Tv t = new CationTv(); // 조상 타입의 참조변수로 자손 인스턴스를 참조
   
   그러면 이제 인스턴스를 같은 타입의 참조변수로 참조하는것고 조상타입의 참조변수로 참조하는 것은 어떤 차이가 있는지에 대해서 알아보도록 하자.
   
   CaptionTv c = new CaptionTv();
   Tv t = new CaptionTv();
   
   위의코드에서 CaptiontTv인스턴스 2개를 생성하고, 참조변수 c와 t가 생성된 인스턴스를 하나씩 참조하도록 하였다.
   이 경우 실제 인스턴스가 CaptionTv타입이라 할지라도, 참조변수 t로는 CaptionTv인스턴스의 모든 멤버를 사용할 수 없다.
   생성된 CaptionTv인스턴스의 멤버 중에서 Tv클래스에 정의 되지 않은 멤버, text와 caption()은 참조변수 t로 사용이 불가능하다.
   즉 t.text또는 t.caption()와 같이 할 수 없다는 것이다
   둘다 같은 타입의 인스턴스지만 참조변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다.
   
   
   
   

 */