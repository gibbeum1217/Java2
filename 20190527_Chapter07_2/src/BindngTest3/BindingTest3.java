package BindngTest3;

public class BindingTest3 {

	public static void main(String[] args) {
			Parent p = new Child();
			Child c = new Child();
			
			System.out.println("p.x =" +p.x);
			p.method();
			System.out.println();
			System.out.println("c.x = " + c.x);
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
	
	int x = 200;
	
	void method() {
		
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);
		System.out.println("this.x="+this.x);
	}
}

/*자손 클래스 Child에 선언된 인스턴스변수 x와 조상클래스 Parent로부터 상속받은 인스턴스변수 x를 구분하는데 참조변수 super와 this가 사용된다
 * 자손인 Child클래스에서의 super.x는 조상클래스인 Parent에 선언된 인스턴스변수 x를 뜻하며, 
 * this.x또는 x는 Child클래스의 인스턴스변수 x를 뜻한다
 * 그래서 위 결과에서 x는 this.x와 값이 같다
 * 
 * 
 *예제에서 알 수 있듯이 인스턴스변수에 직접 접근하면, 참조변수의 타입에 따라 사용되는 인스턴스변수가 달라질 수 있으므로 주의해야 한다
 *
 * 
 *
 */

*/