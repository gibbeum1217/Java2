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

/*�ڼ� Ŭ���� Child�� ����� �ν��Ͻ����� x�� ����Ŭ���� Parent�κ��� ��ӹ��� �ν��Ͻ����� x�� �����ϴµ� �������� super�� this�� ���ȴ�
 * �ڼ��� ChildŬ���������� super.x�� ����Ŭ������ Parent�� ����� �ν��Ͻ����� x�� ���ϸ�, 
 * this.x�Ǵ� x�� ChildŬ������ �ν��Ͻ����� x�� ���Ѵ�
 * �׷��� �� ������� x�� this.x�� ���� ����
 * 
 * 
 *�������� �� �� �ֵ��� �ν��Ͻ������� ���� �����ϸ�, ���������� Ÿ�Կ� ���� ���Ǵ� �ν��Ͻ������� �޶��� �� �����Ƿ� �����ؾ� �Ѵ�
 *
 * 
 *
 */

*/