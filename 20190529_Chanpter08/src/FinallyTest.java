
public class FinallyTest {

	public static void main(String[] args) {

		try{
			startInstall(); //���α׷��� ��ġ�� �ʿ��� �غ� �Ѵ�
		
		copyFiles(); //���ϵ��� �����Ѵ�
		deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�
	}catch(Exception e) {
		e.printStackTrace();
		deleteTempFiles(); //���α׷� ��ġ�� ���� �ӽ����ϵ��� �����Ѵ�.
	}
}
		
		
		
		static void startInstall() {
			
			//���α׷��� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´�
		}
		
		static void copyFiles() {}//���ϵ��� �����ϴ� �ڵ带 ���´� 
		static void deleteTempFiles() {}//�ӽ����ϵ��� �����ϴ� �ڵ带 ���´� 
		
		
}

/* �� ������ �ϴ� ���� ���α׷���ġ�� ���� �غ� �ϰ� ���ϵ��� �����ϰ� ��ġ�� �Ϸ�Ǹ�, ���α׷��� ��ġ�ϴµ� ���� �ӽ����ϵ��� �����ϴ� ������ ����ȴ�

���α׷��� ��ġ���� �߿� ���ܰ� �߻��ϴ���, ��ġ�� ���� �ӽ����ϵ��� �����ǵ��� catch���� deleteTempFiles()�޼��带 �־���

  �ᱹ try ���� ������ �����ϴ� ���ȿ�(���α׷��� ��ġ�ϴ� ������) ������ �߻����ο� ������� deleteTempFiles()�޼���� ����Ǿ�� �ϴ� ���̴� */