package trycatch1;


import java.io.*;

public class ExceptionEx16 {

	public static void main(String[] args) {
		
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+"�ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}


static File createFile(String fileName) throws Exception{
	
	if(fileName==null || fileName.equals(""))
		throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
	File f = new File(fileName); //FileŬ������ ��ü�� �����
	
	f.createNewFile(); //file��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
	return f; // ������ ��ü�� ������ ��ȯ�Ѵ�.
	} //createFile�޼����� �� 
} //Ŭ�����ǳ� 


/* �� ���������� ���ܰ� �߻��� createFile�޼��忡�� �߸� �Էµ� �����̸��� ���Ƿ� ó������ �ʰ�, ȣ���� main�޼��忡�� ���ܰ� �߻������� �˷��� 
�����̸��� �ٽ� �Է� �޵��� �Ͽ���.

���� ������ �޸� createFile�޼��忡 ���ܸ� �����߱� ������, FileŬ������ createNewFile()�� ���� ����ó���� ���� �ʝ� �ǹǷ�
creatNewFile(File f)�޼��带 ���� ���� ������ �ʾҴ�

�� ���� ��� Ŀ�ǵ�������κ��� �����̸��� �з� �޾Ƽ� ������ �����ϴ� ���� �ϸ�, ���� �̸��� �߸� �Է�������(null�Ǵ� �� ���ڿ��� ��) ���ܰ� �߻��ϵ��� �Ǿ��ִ�

�������� ������ ó������� �ִ� ���� ���� ���ܰ� ����� creatFile�޼��� ��ü������ ó���� �ϸ�
�� ���� createFile�޼��带 ȣ���� ���θ޼��忡�� ó���� �Ѵ� 
��ó�� ���ܰ� �߻��� �޼��峻���� ��ü������ ó���ص� �Ǵ� ���� �޼��� ������ try-catch���� ����ؼ� ó���ϰ�,
�ι�° ����ó�� �޼��忡 ȣ��� �Ѱܹ޾ƾ��Ұ�(fileName)�� �ٽ� �޾ƾ� �ϴ°��(�޼��� ������ ��ü������ �ذ��� �� �Ǵ� ���) ����
���ܸ� �޼��忡 �����ؼ�, ȣ���� �޼��忡�� ó���ؾ��Ѵ�. */