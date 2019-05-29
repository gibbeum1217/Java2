/*2.4 super

super는 자손클래스에서 조상클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수 ★ 이다.
멤버변수와 지역변수의 이름이 같을때 this륿 붙여서 구별했듯이
상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을때는 super를 붙여서 구별할 수 있다.
조상 클래스의 멤버와 자손클래스의 멤버가 중복 정의되어 서로 구별해야하는 경우에만 super를 사용하는 것이 좋다 ★
조상의 멤버와 자신의 멤버를 구별하는데 사용된다는 점을 제외하고는 super와 this는 근본적으로 같다 
this와 마찬가지로 super 역시 static메서드에서는 사용할 수 없고 인스턴스메서드에서만 사용할 수 있다
*/


public class SuperTest {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.method();
	}

}
class Parent{
	
	int x=10;
}

class Child extends Parent{
	void method() {   //오버라이딩 ★ : 조상으로부터 상속받은 메서드의 내용을 변경하는것 
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

