/*import��
Ŭ������ �ڵ带 �ۼ��ϱ� ���� import������ ����ϰ��� �ϴ� Ŭ������ ��Ű���� �̸� ������ָ� �ҽ��ڵ忡�� ���Ǵ� Ŭ�����̸����� ��Ű������ ������ �� �ִ�
import���� ������ �����Ϸ����� �ҽ����Ͽ� ���� Ŭ������ ��Ű���� ���� ������ �����ϴ� ���̴�.
�����Ͻÿ� �����Ϸ��� import���� ���� �ҽ����Ͽ� ���� Ŭ�������� ��Ű���� �˾� �� ����, ��� Ŭ�����̸� �տ� ��Ű������ �ٿ� �ش�.
��Ŭ������ ����� ctrl+shift+o�� ������, �ڵ����� import���� �߰����ִ� ���� ����� ������ �ִ�.abstract

3.4 import���� ����
��� �ҽ�����(.java)���� import���� package�� ������, �׸��� Ŭ���� ���� ������ ��ġ�ؾ��Ѵ�
import���� package���� �޸� �� �ҽ����Ͽ� ������ ������ ���ִ�.

import���� �����ϴ� ����� ������ ����
import ��Ű����.Ŭ������;
�Ǵ�
import ��Ű����.*;*/




package import0;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {

		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("���� ��¥�� "+date.format(today));
		System.out.println("���� �ð���"+time.format(today));
	
	}

}
