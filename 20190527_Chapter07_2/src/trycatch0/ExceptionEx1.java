package trycatch0;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			try {
				}catch(Exception e) {
					
				}
			
		}catch(Exception e) {
			try {
			
			}catch(Exception e) // ����. ���� e�� �ߺ� ����Ǿ���

			{
				
			}
		}
		
		try {
			
			
		}catch(Exception e) {
			
			}
		}

	}

/* ���� ������ �ƹ� �ϵ� ���� �ʴ´�

try�� �Ǵ� catch���� �Ǵٸ� try-catch���� ���Ե� �� �ִ�

catch�� ���� �ڵ忡���� ���� �߻��� �� �ֱ� �����̴�

��catch���� ��ȣ ���� ����� ������ catch�� �������� ��ȿ�ϱ� ������, ���� ��� catch���� �������� e�ϳ� ���� ����ص� �ȴ�

�׷��� catch�� ���� �� �ϳ��� try-catch���� ���Ե� ���, ���� �̸��� ���������� ����ؼ��� �� �ȴ�
�� catch���� ����� �� ���������� ������ ���� ��ġ�Ƿ� �ٸ� �̸��� ����ؾ߸� ���� �����Ǳ� �����̴�
  ���� ���� �������� catch�� ���� try-catch���� ����Ǿ� �ִ� ���������� �̸��� 'e'�� �ƴ� �ٸ� ������ �ٲ�� �Ѵ�
  */
  