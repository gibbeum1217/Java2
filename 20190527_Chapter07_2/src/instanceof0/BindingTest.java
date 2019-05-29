/*조상 클래스에 선언된 멤버변수와 같은 이름의 인스턴스변수를 자손 클래스에 중복으로 정의했을 때,
 * 조상타입의 참조변수로 자손 인스턴스를 참조하는 경우와 자손타입의 참조변수로 자손 인스턴스를 참조하는 경우는 서로 다른 결과를 얻는다.
 * 메서드의 경우 조상클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우에도 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출되지만
  ★멤버변수의 경우 참조변수의 타입에 따라 달라진다
  
  static메서드는 static변수처럼 참조변수의 타입에 영향을 받는다
  참조타입에 영향을 받지 않는 것은 인스턴스메서드 뿐이다
  그래서 static메서드는 반드시 참조변수가 아닌 ★클래스이름.메서드()로 호출해야 한다
  
  결론부터 말하자면, 멤버변수가 조상클래스와 자손클래스에 중복으로정의된 경우, 조상타입의 참조변수를 사용했을 때는 조상 클래스에 선언된 멤버변수가 사용되고
  자손타입의 참조변수를 사용했을 때는 자손 클래스에 선언된 멥버변수가 사용된다.
   하지만 중복 정의되지 않은 경우, 조상타입의 참조변수를 사용했을 때와 자손타입의 참조변수를 사용했을 때의 차이는 없다
   중복된 경우는 참조타입에 따라 달라지지만, 중복되지 않은 경우 하나뿐이므로 선택의 여지가 없기 때문이다.
  
    
 */

package instanceof0;

import BindingTest2.Child;
import BindingTest2.Parent;

public class BindingTest {

	public static void main(String[] args) {
		
		Parent p = new Child(); //타입은 다르지만, 참조변수p와 c 모두 Child인스턴스를 참조하고 있다 그리고 Parent클래스와 Child클래스는 서로 같은 멤버들을 정의하고 있다
		//이때 조상타입의 참조변수 p로 Child인스턴스의 멤버들을 사용하는 것과 자손타입의 참조변수 c로 Child인스턴스의 멤버들을 사용하는 것의 차이를 알 수 있다
		//메서드인 method()의 경우 참조변수의 타입과 관계없이 항상 실제 인스턴스의 타입인 Child클래스에 정의된 메서드가 호출되지만,
		//인스턴스변수인 x는 참조변수의 타입에 따라서 달라진다. 
		Child c = new Child();
		
		System.out.println("p.x = " +p.x);
		p.method();
		
		System.out.println("c.x= " +c.x);
		c.method();
	}

}


class Parent{
	
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");

	}
}

class Child extends Parent{
	int x= 200;
	
	void method() {
		
		System.out.println("Child Method");
	}
}
