/*2.4 super

super�� �ڼ�Ŭ�������� ����Ŭ�����κ��� ��ӹ��� ����� �����ϴµ� ���Ǵ� �������� �� �̴�.
��������� ���������� �̸��� ������ this�b �ٿ��� �����ߵ���
��ӹ��� ����� �ڽ��� Ŭ������ ���ǵ� ����� �̸��� �������� super�� �ٿ��� ������ �� �ִ�.
���� Ŭ������ ����� �ڼ�Ŭ������ ����� �ߺ� ���ǵǾ� ���� �����ؾ��ϴ� ��쿡�� super�� ����ϴ� ���� ���� ��
������ ����� �ڽ��� ����� �����ϴµ� ���ȴٴ� ���� �����ϰ�� super�� this�� �ٺ������� ���� 
this�� ���������� super ���� static�޼��忡���� ����� �� ���� �ν��Ͻ��޼��忡���� ����� �� �ִ�
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
	void method() {   //�������̵� �� : �������κ��� ��ӹ��� �޼����� ������ �����ϴ°� 
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

