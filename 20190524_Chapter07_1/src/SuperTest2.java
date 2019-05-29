
public class SuperTest2 {
	public static void main(String args[]) {
		Child c= new Child();
		c.method();
	}
}


class Parent{
	
	int x= 10;
}

class Child extends Parent{
	
	int x = 20;
	
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
		
	}
}

/*
 * 같은 이름의 멤버변수가 조상클래스인 Parent에도 있고 자손클래스인 Child에도 있을때는 super.x와 this.x는 서로 다른 값을
 * 참조하게 된다. super.x는 조상클래스로부터 상속받은 멤버변수x를 뜻하고, this.x는 자손 클래스에 선언된 멤버변수를 뜻한다.
 */