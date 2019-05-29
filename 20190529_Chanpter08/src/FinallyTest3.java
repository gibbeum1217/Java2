
public class FinallyTest3 {

	public static void main(String[] args) {
		FinallyTest3.method1();
		
		//method1()�� static�޼����̹Ƿ� �ν��Ͻ� �������� ���� ȣ���� �����ϴ�.
		
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�.");
	}

	
	static void method1() {
		
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return; //���� �������� �޼��带 �����Ѵ�
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}
	}
	
}


/* ���� ������� �� �� �ֵ���, try������ return���� ����Ǵ� ��쿡�� finally���� ������� ���� ������Ŀ�, ���� �������� �޼��带 �����Ѵ�.abstract

�̿� ���������� catch���� ���� �����߿� return���� ������ fianlly���� ������� ����ȴ� */