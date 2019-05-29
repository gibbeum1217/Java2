/*���� Ŭ������ ����� ��������� ���� �̸��� �ν��Ͻ������� �ڼ� Ŭ������ �ߺ����� �������� ��,
 * ����Ÿ���� ���������� �ڼ� �ν��Ͻ��� �����ϴ� ���� �ڼ�Ÿ���� ���������� �ڼ� �ν��Ͻ��� �����ϴ� ���� ���� �ٸ� ����� ��´�.
 * �޼����� ��� ����Ŭ������ �޼��带 �ڼ��� Ŭ�������� �������̵��� ��쿡�� ���������� Ÿ�Կ� ������� �׻� ���� �ν��Ͻ��� �޼���(�������̵��� �޼���)�� ȣ�������
  �ڸ�������� ��� ���������� Ÿ�Կ� ���� �޶�����
  
  static�޼���� static����ó�� ���������� Ÿ�Կ� ������ �޴´�
  ����Ÿ�Կ� ������ ���� �ʴ� ���� �ν��Ͻ��޼��� ���̴�
  �׷��� static�޼���� �ݵ�� ���������� �ƴ� ��Ŭ�����̸�.�޼���()�� ȣ���ؾ� �Ѵ�
  
  ��к��� �����ڸ�, ��������� ����Ŭ������ �ڼ�Ŭ������ �ߺ��������ǵ� ���, ����Ÿ���� ���������� ������� ���� ���� Ŭ������ ����� ��������� ���ǰ�
  �ڼ�Ÿ���� ���������� ������� ���� �ڼ� Ŭ������ ����� ��������� ���ȴ�.
   ������ �ߺ� ���ǵ��� ���� ���, ����Ÿ���� ���������� ������� ���� �ڼ�Ÿ���� ���������� ������� ���� ���̴� ����
   �ߺ��� ���� ����Ÿ�Կ� ���� �޶�������, �ߺ����� ���� ��� �ϳ����̹Ƿ� ������ ������ ���� �����̴�.
  
    
 */

package instanceof0;

import BindingTest2.Child;
import BindingTest2.Parent;

public class BindingTest {

	public static void main(String[] args) {
		
		Parent p = new Child(); //Ÿ���� �ٸ�����, ��������p�� c ��� Child�ν��Ͻ��� �����ϰ� �ִ� �׸��� ParentŬ������ ChildŬ������ ���� ���� ������� �����ϰ� �ִ�
		//�̶� ����Ÿ���� �������� p�� Child�ν��Ͻ��� ������� ����ϴ� �Ͱ� �ڼ�Ÿ���� �������� c�� Child�ν��Ͻ��� ������� ����ϴ� ���� ���̸� �� �� �ִ�
		//�޼����� method()�� ��� ���������� Ÿ�԰� ������� �׻� ���� �ν��Ͻ��� Ÿ���� ChildŬ������ ���ǵ� �޼��尡 ȣ�������,
		//�ν��Ͻ������� x�� ���������� Ÿ�Կ� ���� �޶�����. 
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