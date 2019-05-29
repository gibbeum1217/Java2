package trycatch1;

import java.io.*;

public class ExceptionEx15 {

	public static void main(String[] args) {
		File f = createFile(args[0]); //command line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�. 
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�."); 
	} //main�޼����� ��
	
	static File createFile(String fileName) {
		
		try {
			if(fileName==null||fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		}catch(Exception e) {
			fileName = "�������.txt"; //fileName�� �������� ���, �����̸��� '�������.txt'�� �Ѵ�.
		}finally {
			File f= new File(fileName);
			createNewFile(f); //������ ��ü�� �̿��ؼ� ������ �����Ѵ�.
			return f;
		}
	} //createFile�޼����� �� 
	
	static void createNewFile(File f) {
		try {
			f.createNewFile();
			
		}catch(Exception e) {}
		
	}

}

/* �� ������ ���ܰ� �߻��� �޼��忡�� ���� ���ܸ� ó���ϵ��� �Ǿ� �ִ�
createFile�޼��带 ȣ���� main�޼��忡���� ���ܰ� �߻��� ����� ���� ���Ѵ�
������������ �����̸�(fileName)�� �ԷµǸ� ���ܸ� �߻���Ű�� catch������ �����̸��� '�������.txt'�� �����ؼ� ������ �����Ѵ�
�׸��� finally�������� ������ �߻����ο� ������� ������ �����ϴ� ���� �Ѵ�. */