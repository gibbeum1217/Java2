package trycatch1;

public class ExceptionEx14 {

	public static void main(String[] args) {
		
		try {
			method1();
		}catch(Exception e) {
				System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
				e.printStackTrace();
			
		}
	}	
		static void method1() throws Exception{
			throw new Exception();
		
	}

}


/* �� ���� ��� main�޼��尡 metho1()�� ȣ���ϸ�, metho1()���� ���ܰ� �߻��Ѵ�
�������� ����ó�� ����� �ִ�

method1()���� ���ܸ� �����Ͽ� �ڽ��� ȣ���ϴ� �޼���(main)�� ���ܸ� ����������, ȣ���� �޼���(main�޼���)������ try-catch������ ����ó���� �ߴ�.abstract
���ܰ� �߻��� �޼��忡�����ܸ� ó������ �ʰ� ȣ���� �޼���� �Ѱ��ָ�, ȣ���� �޼��忡���� method1()�� ȣ���� ���ο��� ���ܰ� �߻��� ������ ���ֵǾ� �̿����� ó���� �ϰ� �ȴ�

 ��ó�� ���ܰ� �߻��� �޼��� method1()���� ���ܸ� ó���� ���� �ְ�, ���ܰ� �߻��� �޼��带 ȣ���� main�޼��忡�� ó���� ���� �ִ� */