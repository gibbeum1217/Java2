package BindingTest2;

public class BindingTest2 {

	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x ="+p.x);
		p.method();
		
		System.out.println("c.x="+c.x);
		c.method();
	}

}

class Parent{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
	
}


class Child extends Parent{}

/*
�������� �����ʹ� �޸� ChildŬ�������� �ƹ��� ����� ���ǵǾ������ʰ� �ܼ��� �������κ��� ������� ��ӹ޴´�
�׷��� ������ ���������� Ÿ�Կ� ������� ������ ������� ����ϰ� �ȴ�

   ��ó�� �ڼ� Ŭ�������� ���� Ŭ������ ����� �ߺ����� �������� �ʾ��� ���� ���������� Ÿ�Կ� ���� ��ȭ�� ����
   ��� Ŭ������ ����� ȣ��Ǿ�� ����, �� ������ ����� ȣ��Ǿ�� ����, �ڼ��� ����� ȣ��Ǿ�� ������ ���� ������ ������ ���� �����̴�.
   
   ���������� Ÿ�Կ� ���� ����� �޶����� ���� ���� Ŭ������ ��������� ���� �̸��� ��������� �ڼ�Ŭ������ �ߺ��ؼ� ������ ��� ���̴�.

*/