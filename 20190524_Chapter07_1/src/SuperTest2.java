
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
 * ���� �̸��� ��������� ����Ŭ������ Parent���� �ְ� �ڼ�Ŭ������ Child���� �������� super.x�� this.x�� ���� �ٸ� ����
 * �����ϰ� �ȴ�. super.x�� ����Ŭ�����κ��� ��ӹ��� �������x�� ���ϰ�, this.x�� �ڼ� Ŭ������ ����� ��������� ���Ѵ�.
 */