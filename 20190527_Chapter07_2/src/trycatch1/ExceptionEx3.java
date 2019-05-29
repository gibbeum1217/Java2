package trycatch1;

public class ExceptionEx3 {

	public static void main(String args[]) {

		int number = 100;
		int result =0;
		
		
		for(int i=0; i<10; i++) {
			
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("0");
				
			}
		}
	}
}
	
	/*���� ������� ����, 4��°�� 0�� ��µǾ��µ� �� ������ for���� 4��° �ݺ����� ArithmeticException�� �߻��߱� �����̴�
	
	�׷��� ArithmeticException�� �ش��ϴ� catch���� ã�Ƽ� �� catch�� ���� ������� �����Ѵ��� try-catch���� ��� for���� ���� �ݺ��� ��� �����Ͽ� �۾��� ��� ��ġ�� ����������
	����Ǿ���. ���� ����ó���� ���� �ʾҴٸ�,�� ��° �ٱ����� ��µǰ� ���ܰ� �߻��ؼ� ���α׷��� ������������ ����Ǿ��� ���̴�. */