/*예를 들어 다음과 같이 Tv클래스와 VCR클래스가 있을 때, TVCR클래스를 작성하기위해 두 클래스로부터 상속을 받을 수만 있다면 좋겠지만 다중상속을 허용하지 않으므로
한쪽만 선택하여 상속받고 나머지 한 쪽은 클래스 내에 포함시켜서 내부적으로 인스턴스를 생성해서 사용하도록 한다

public class Tv{
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() { power =! power; }
	public void channelUp() {channel++;}
	public void channelDown() {channel--;}
	public void volumeUp() {volume++:}
	public void volumeDown() {volume--;}
	
	
}

public class VCR_
	protected int counter;
	public void play() {
		
	}
	
	public void stop() {
		
	}
	
	puclic void reset() {
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int c) {
		counter = c;
	}
}

VCR클래스에 정의된 메서드와 일치하는 추상메서드를 갖는 인터페이스를 작성한다.

public inteface IVCR{
		public void play();
		public void stop();
		public void reset();
		public int getCounter();
		public void setCounter(int c);
	
}

이제 IVCR인터페이스를 구현하고 Tv클래스로부터 상속받는 TVCR클래스를 작성한다
이제 VCR클래스타입의 참조변수를 멤버변수로 선언하여 IVCR인터페이스의 추상메서드를 구현하는데 사용한다

public class TVCR extends Tv implements IVCR{
	VCR vcr = new VCR();
	
	public void play() {
		vcr.play(); //코드를 작성하는 대신 VCR인스턴스의 메서드를 호출한다
	}
	public void stop() {
		vcr.stop();
	}
	public void reset() {
		vcr.reset();
	}
	public int getCounter() {
		return vcr.getCounter();
	}
	public int setCounter(int c) {
		vcr.setCounter(c);
	}
}
IVCR인터페이스를 구현하기 위해서는 새로 메서드를 작성해야하는 부담이 있지만
이처럼 VCR클래스의 인스턴스를 사용하면 손쉽게 다중상속을 구현할 수 있다


7.6 인터페이스를 이용한 다형성
다형성에 대해 학습할때 자손클래스의 인스턴스를 조상타입의 참조변수로 참조하는것이 가능하다는 것을 배웠다
인터페이스 역시 이를 구현한 클래스의 조상이라 할 수 있으므로
해당 인터페이스 타입의 참조변수로 이를 구현한 클래스의 인스턴스를 참조할수 있으며, 인터페이스 타입으로의 형변환도 가능하다

인터페이스 Fightable을 클래스 Fighter가 구현했을때
다음과 같이 Fighter인스터느를 Fightable타입의 참조변수로 참조하는 것이 가능하다.


따라서 인터페이스는 다음과 같이 메서드의 매개변수의 타입으로 사용될 수 있다 ★
void attack(Fightable f) {
	//...
}

인터페이스타입의 매개변수가 갖는 이ㅡ미는
메서드 호출시 해당 인터페이스를 구현한 클래스의 인스턴스를 매개변수로 제공해야한다는 것이다

그래서 attack메서드를 호출할때는 매개변수로 Fightable인터페이스를 구현한 클래스의 인스턴스를 넘겨주어야 한다


class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {}
	public void attack(Fightable f) {}
	
	위와 같이 Fightable인터페이스를 구현한 Fighter클래스가 있을 때
	attack메서드의 매개변수로 Fighter인슽너스를 넘겨줄수 있다 즉, attack(new Fighter())와 같이 할 수 있다는 것이다
	
	그리고 다음과 같이 메서드의 리턴타입으로 인터페이스의 타입을 지정하는 것 역시 가능하다
	
	Fightable method() {
		
		Fighter f = new Fighter();
		return f;
	}
	리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다 ★★
	
	위의 코드에서는 method()의 리턴타입이 Fightable인터페이스이기 때문에 
	메서드의 return문에서 Fightable인터페이스를 구현한 Fighter클래스의 인스턴스를 반환한다. 
	*/
}


package interface0;

public class interface1 {

}
