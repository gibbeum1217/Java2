package trycatch1;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //0���� ������ ArithmeticException�� �߻���Ų��
			System.out.println(4); //������� �ʴ´�
			
		}catch(Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}

/*
�̿����� ���� 8-5�� ������ ���ε�, ����� ����
catch���� ��ȣ()�ȿ� ArithmeticExceptionŸ���� �������� ��ſ� ExceptionŬ������ ���������� �����Ͽ���

ArithmeticExceptionŬ������ ExceptionŬ������ �ڼ��̹Ƿ� ArithmeticException�ν��Ͻ��� ExceptionŬ�������� instanceof�������� true�� �Ǿ�
ExceptionŬ����Ÿ���� ���������� ������ catch���� ������� ����ǰ� ���ܴ� ó���Ǵ� ���̴� */