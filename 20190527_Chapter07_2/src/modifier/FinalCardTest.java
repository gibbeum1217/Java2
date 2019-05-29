/*4.1제어자란
제어자의 종류는 크게 접근 제어자와 그 외의 제어자로 나눌 수 있다

접근 제어자 public, protected, default, private
그외 static, final, abstract, synchronized

4.2 static- 클래스의, 공통적인

인스턴스변수는 하나의 클래스로부터 생성되었더라도 각기 다른 값을 유지하지만, 클래스변수(static멤버변수)는 인스턴스에 관계없이 같은 값을 갖는다
그 이유는 하나의 변수를 모든 인스턴스가 공유하기 때문이다.

인스턴스메서드와 static메서드의 근본적인 차이는 메서드 내에서 인스턴스 멤버를 사용하는가의 여부에 있다

4.3 final - 마지막의, 변경될 수 없는
마지막의 또는 변경될 수없는의 의미를 가지고 있으며 거의 모든 대상에 사용될 수 있다

변수에 사용되면 값을 변경할 수 없는 상수가 되며, 메서드에 사용되면 오버라이딩을 할 수 없게 되고
클래스에 사용되면 자신을 확장하는 자손클래스를 정의하지 못하게 된다.
*/

/*final class FinalTest { //조상이 될 수 없는 클래스
	final int MAX_SIZE = 10; //값을 변경할 수 없는 멥버변수(상수)
	
	final void getMaxSize();  //오버라이딩 할 수 없는 메서드(변경 불가)
	
	final int LV = AMX_SIZE; //값을 변경할 수 없는 지역변수(상수)
	return MAX_SIZE;
	}
}*/

package modifier;

class Card{
	final int NUMBER;    //final이 붙은 상수이므로 일반적으로 선언과 초기화를 동시에 하지만
	final String KIND;   //★인스턴스변수의 경우 생성자에서 초기화 되도록 할 수 있다
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){ //★클래스내에 매개변수를 갖는 생성자를 선언하여, 인스턴스를 생성할때 final이 붙은 멤버변수를 초기화하는데 필요한 값을 
		//★생성자의 매개변수로부터 제공받는 것이다. 
		//이기능을 활용하면 각 인스턴스마다 fianl이 붙은 멤버변수가 다른 값을 갖도록 하는것이 가능하다. 
		KIND = kind;  //매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화한다.
		NUMBER = num;
	}
	
	Card() {
		this("HEART",1); //기본생성자에서 값을 초기화 시키고 싶을때! 
		
	}
	
	public String toString() {
		return KIND +" " +NUMBER;
		
	}

}

public class FinalCardTest {
	public static void main(String args[]) {
		Card c = new Card("HEART", 10);
		
	//c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c.toString());
		
	}
}
