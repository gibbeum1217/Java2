package trycatch1;

public class ExceptionEx8 {

	
	public static void main(String args[]) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // ���ܹ߻�!!
			System.out.println(4); // ������� �ʴ´�
		}catch(ArithmeticException ae) {
		ae.printStackTrace(); // �������� ae�� ���� ������ ArithmeticException�ν��Ͻ��� ������ �� �ִ�
		System.out.println("���ܸ޽���:" + ae.getMessage());
		
	}
		System.out.println(6);
	}
}


/* �� ������ ����� ���ܰ� �߻��ؼ� ������������ ����Ǿ��� ���� ����� ��������� ���ܴ� try-catch���� ���� ó���Ǿ����� ���α׷��� ���������� ����Ǿ���.
�� ��� ArithmeticException�ν��Ͻ��� printStackTract()�� ����ؼ�, ȣ�⽺�ÿ� ���� ������ ���ܸ޽����� ����Ͽ���

 ��ó�� try-catch������ ����ó���� �Ͽ� ���ܰ� �߻��ص� ������������ �������� �ʵ��� ���ִ� ���ÿ�, printStackTrace() �Ǵ� getMessage()�� ���� �޼��带 ���ؼ� ������
�߻������� �� �� �ִ�


��Ƽ catch��
JDK1.7���� ���� catch���� |��ȣ�� �̿��ؼ�, �ϳ��� catch������ ��ĥ �� �ְ� �Ǿ�����, �̸� ��Ƽ catch���̶� �Ѵ�
�Ʒ��� �ڵ忡�� �� �� �ֵ��� ��Ƽ catch���� �̿��ϸ� �ߺ��� �ڵ带 ���� �� �ִ�
�׸��� |��ȣ�� ������ �� �ִ� ���� Ŭ������ �������� ������ ����


���� ��Ƽ catch���� |��ȣ�� ����� ���� Ŭ������ ����� �ڼ��� ���迡 �ִٸ� ������ ������ �߻��Ѵ�

try {
	...
	
}catch(ParentException|ChildException e){ // ����!
	e.prinkStackTrace();
	
}


�ֳ��ϸ� �� ���� Ŭ������ ����� �ڼ��� ���迡 �ִٸ�, �׳� ������ ���� ���� Ŭ������ ���ִ� �Ͱ� �Ȱ��� �����̴�. ���ʿ��� �ڵ�� �����϶�� �ǹ̿��� ������ �߻��ϴ� ���̴�
try{
	...
	}catch(ParentException e){
		e.prinsStackTrace();
}

�׸��� ��Ƽ catch�� �ϳ��� catch������ ���� ���ܸ� ó���ϴ� ���̱� ������, �߻��� ���ܸ� ��Ƽ catch������ ó���ϰ� �Ǿ��� ��
��Ƽ catch���������� ������ � ���ܰ� �߻��� ������ �� �� ����
�׷��� �������� e�� ��Ƽ catch���� |��ȣ�� ����� ����Ŭ�������� ����и��� ���� ���� Ŭ������ ����� ����� ����� �� �ִ�.*/