package trycatch1;

public class ExceptionEx5 {

	
	public static void main(String args[]) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); // 0���� ������ ���Ƿ� ArithmeticExcpetion�� �߻���Ų��
			System.out.println(4);//������� �ʴ´�
		}catch(ArithmeticException ae) {
			System.out.println(5);
		}
		
		System.out.println(6);
	}
}

/*
���� ������ ����� ����, 1,2,3�� ����� ���� try������ ���ܰ� �߻��߱� ������ try ���� �ٷ� ����� System.out.println(4);�� ������� �ʴ´�
�׸���� �߻��� ���ܿ� �ش��ϴ� catch������ �̵��Ͽ� ������� �����Ѵ�
������ ��ü try-catch���� ����� �� ���� ������ �����Ͽ� 6�� ȭ�鿡 ����Ѵ�.abstract
*/