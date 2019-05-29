package abstract0;

/*
 * abstract는 미완성의 의미를 가지고 있다. 메서드의 선언부만 작성하고 실제 수행내용은 구현하지 않은 추상메서드를 선언하는데 사용된다.
 * 
 * package abstract0;
 * 
 * public class TimeTest {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * abstract가 사용될 수 있는곳- 클래스, 메서드
 * 
 * abstract 클래스- 클래스내에 추상 메서드가 선언되어 있음을 의미한다 메서드- 선언부만 작성하고 구현부는 작성하지않은 추상 메서드임을
 * 알린다
 * 
 * 추상클래스는 아직 완성되지 않은 메서드가 존재하는 '미완성 설계도'이므로 인스턴스를 생성할 수 없다
 * 
 * abstract class AbstractTest { //추상클래스 (추상메서드를 포함한 클래스) abstract void move();
 * //추상메서드(구현부가 없는 메서드)
 * 
 * 
 * } 꽤 드물지만 추상메서드가 없는 클래스 즉 완성된 클래스도 abstract를 붙여서 추상 클래스로 만드는 경우도 있다
 * 
 * 
 * 4.5 접근제어자(access modifier) 접근제어자는 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서 접근하지
 * 못하도록 제한하는 역할을 한다.
 * 
 * 접근제어자가 default임을 알리기 위해 실제로 default를 붙이지는 않는다 클래스나 멤버변수, 메서드, 생성자에 접근 제어자가
 * 지정되어 있지 않다면, 접근제어자가 default임을 뜻한다
 * 
 * 접근제어자가 사용될 수 있는곳- 클래스, 멤버변수, 메서드, 생성자 private 같은 클래스 내에서만 접근이 가능하다 default 같은
 * 패키지 내에서만 접근이 가능하다 protected 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다 public
 * 접근 제한이 전혀 없다
 * 
 * 
 * public은 접근 제한이 전혀 없는 것이고, private은 같은 클래스 내에서만 사용하도록 제한하는 가장 높은 제한이다. 그리고
 * default는 같은패키지내의 크래스에서만 접근이 가능하도록 하는 것이다. 마지막으로 protected는 패키지에 관계없이 상속관계에 있는
 * 자손클래스에서 접근할 수 있도록 하는 것이 제한목적이지만, 같은 패키지 내에서도 접근이 가능하다. 그래서 protected가
 * default보다 접근범위가 더 넓다
 * 
 * 
 * -접근제어자를 이용한 캡슐화- 클래스나 멤버, 주로 멤버에 접근 제어자를 사용하는 이유는 클래스의 내부에 선언된 데이터를 보호하기
 * 위해서이다 데이터가 유효한 값을 유지하도록 또는 비밀번호와 같은 데이터를 외부에서 함부로 변경하지 못하도록 하기 위해서는 외부로부터의
 * 접근을 제한하는것이 필요하다 이것을 데이터 감추기라고 하며, 객체지향개념의 캡슐화에 해닫되는 내용이다.
 * 
 * 접근제어자가 default라면 패키지 내부만 확인해 보면 되고, private이면 클래스 하나만 살펴보면 된다 이처럼 접근 제어자 하나가
 * 때로는 상당한 차이를 만들어 낼 수 있다. 접근제어자를 적절히 선택해서 접근 범위를 최소화하도록 노력하자.
 * 
 * 
 * get으로 시작하는 메서드는 단순히 멤버변수의 값을 반환하는 일을 하고 ★ set으로시작하는 메서드는 매개변수에지정된 값을 검사하여 조건에
 * 맞는 값일 때만 멤버변수의 값을 변경하도록 작성되어 있다 ★ 보통 멤버변수의 값을 읽는 메서드의 이름을 get멤버변수이름으로하고,
 * 멤버변수의 값을 변경하는 메서드의 이름을 set멤버변수이름으로 한다. 그리고 get으로 시작하는 메서드를 겟터 set으로 시작하는 메서드를
 * 셋터라고 부른다.
 */

public class TimeTest{
	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		System.out.println(t);
//		t.hour=13;  변수 hour의 접근제어자가 private이므로 접근할 수 없다
		t.setHour(t.getHour()+1); //현재시간보다 1시간 후로 변경한다
		System.out.println(t.toString());
	}
}
	
	
class Time{
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public String toString() {
		
		return hour + ":" + minute + ":" +second;
	}
}