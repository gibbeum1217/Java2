package trycatch1;

public class Exception7 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 0���� ������ ArithmeticException�� �߻���Ų��
			System.out.println(4); // ��������ʴ´�
		}catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException){
				System.out.println("true");
			System.out.println("ArithmeticException");	
			}
			
		}catch(Exception e) { // ��ArithmeticException�� ������ ��� ���ܰ� ó���ȴ� 
			
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}


/* ���� ���������� �ΰ��� catch�� ArithmeticExceptionŬ���� Ÿ���� ���������� ������ �Ͱ� ExceptionŬ���� Ÿ���� ���������� ������ ���� ����Ͽ���.
try������ ArithmeticException�� �߻��Ͽ����Ƿ� catch���� �ϳ��� ���ʷ� �˻��ϰ� �Ǵµ�, 
ù ��° �˻翡�� ��ġ�ϴ� catch���� ã�ұ� ������ �� �� ��° catch���� �˻����� �ʰ� �ȴ�


���� try�� ������ ArithmeticException�� �ƴ� �ٸ� ������ ���ܰ� �߻��� ��쿡�� �� ���� catch���� ExceptionŬ���� Ÿ���� ���������� ������ ������ ó���Ǿ��� ���̴�.
��ó�� try-catch���� �������� ExceptionŬ���� Ÿ���� ���������� ������ catch���� ���ϸ�, � ������ ���ܰ� �߻��ϴ��� �� catch���� ���� ó���ǵ��� �� �� �ִ�.

*/