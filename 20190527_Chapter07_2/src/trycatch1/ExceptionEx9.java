/* 1.6 ���� �߻���Ű��

Ű���� throw�� ����ؼ� ���α׷��Ӱ� ���Ƿ� ���ܸ� �߻���ų �� ������, ����� �Ʒ��� ������ ������ �ȴ�

����, ������ new�� �̿��ؼ� �߻���Ű���� ���� Ŭ������ ��ü�� ���� ����
Exception e = new Exception("���Ƿ� �߻�������");

Ű���� throw�� �̿��ؼ� ���ܸ� �߻���Ų��
throw e; */

  

package trycatch1;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻�������.");
			throw e;
			//throw new Exception("���Ƿ� �߻�������.");
		} catch (Exception e) {
			
			System.out.println("���� �޽���: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���.");
				
	}

}
