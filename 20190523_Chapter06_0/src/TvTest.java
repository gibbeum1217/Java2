class Tv{
	//Tv의속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	
	//Tv의 기능(메서드)
	void power() {power =! power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}


public class TvTest {
	public static void main(String args[]) {
		Tv t;   //TV인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();  //Tv인스턴스를 생성한다.
		t.channel = 7; //Tv인스턴스의 멤버변수 channel의 값을 7로 한다.  참조변수 t에 저장된 주소에 있는 인스턴스의 멤버변수 channel에 7을 저장한다
		//여기서 알 수 있는 것처럼, 인스턴스의 멤버변수(속성)을 사용하려면 '참조변수.멤버변수'와 같이 하면 된다.★ 
		t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다
		System.out.println("현재 채널은" +t.channel+"입니다.");
		
		//참조변수t가 참조하고있는 Tv인스턴스의 멤버변수channel에 저장되어 있는 값을 출력한다.
		//현재 channel의 값은 6이므로 '현재 채널은 6 입니다'가 화면에 출력된다. 
		
		/*
		 * 클래스명 변수명; //클래스의 객체를 참조하기 위한 참조변수를 선언 변수명 = new 클래스명(); // 클래스의 객체를 생성후, 객체의
		 * 주소를 참조변수에 저장
		 * 
		 * Tv t; t = new Tv();
		 */
		
	}
}


/*
 * 인스턴스와 참조변수의 관계는 마치 우리가 일상생활에서 사용하는 TV와 TV리모콘의 관계와 같다. TV리모콘(참조변수)을 사용하여
 * TV(인스턴스)를 다루기 때문이다. 다른 점이 라면, 인스턴스는 오직 참조변수를 통해서만 다룰 수 있다는 것이다.
 * 
 * 그리고 TV를 사용하려면 TV리모콘을 사용해야하고, 에어콘을 사용하려면, 에어콘 리모콘을 사용해야하는 것처럼 Tv인스턴스를 사용하려면,
 * Tv클래스 타입의 참조변수가 필요한 것이다. 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과
 * 일치해야한다.
 */