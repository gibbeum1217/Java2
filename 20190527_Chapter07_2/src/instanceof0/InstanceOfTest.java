package instanceof0;

public class InstanceOfTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			
			System.out.println("This is FireEngine instance.");
			
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
			
		}
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
			
		}
		System.out.println(fe.getClass().getName()); //��������.getClass().getName()�� ���������� ����Ű�� �ִ� �ν��Ͻ��� Ŭ���� �̸��� ���ڿ�(String)�� ��ȯ�Ѵ�
		
	}

}

class Car{}
class FireEngine extends Car{}

//FireEngineŬ������ ObjectŬ������ CarŬ������ �ڼ� Ŭ�����̹Ƿ� ������ ������� ��ӹ޾ұ� ������, FireEngine�ν��Ͻ��� Object�ν��Ͻ��� Car�ν��Ͻ��� �����ϰ� �ִ� ���̱� �����̴�.
//����ϸ� ���� �ν��Ͻ��� ���� Ÿ���� instanceof���� �̿ܿ� ����Ÿ���� instanceof���꿡�� true�� ����� ������
//instanceof������ ����� true��� ���� �˻��� Ÿ������ ����ȯ�� �ص� �ƹ��� ������ ���ٴ� ���̴�.
//�� � Ÿ�Կ� ���� instanceof������ ����� true��� ���� �˻��� Ÿ������ ����ȯ�� �����ϴٴ� ���� ���Ѵ� 



/*
 * 
 * ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� instanceof�����ڸ� ����Ѵ�
 * �ַ� ���ǹ��� ���Ǹ� instanceof�� ���ʿ��� ���������� ������������ Ÿ��(Ŭ������)�� �ǿ����ڷ� ��ġ�Ѵ�
 * �׸��� ������ ����� boolean ���� true�� false���� �ϳ��� ��ȯ�Ѵ�
 * 
 *   instanceof�� �̿��� �������� true�� ����ٴ� ���� ���������� �˻��� Ÿ������ ����ȯ�� �����ϴٴ� ���� ���Ѵ�.
 *   
 *   instanceof�����ڸ� �̿��ؼ� ��������c�� ����Ű�� �ִ� �ν��Ͻ��� Ÿ���� üũ�ϰ�
 *   ������ ����ȯ�� ������ �۾��� �ؾ��Ѵ�
 *   
 *   ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ������ �� �ֱ� ������
 *   ���������� Ÿ�԰� �ν��Ͻ��� Ÿ���� �׻� ��ġ������ �ʴ´ٴ� ���� �����
 *   ����Ÿ���� ���������δ� ���� �ν��Ͻ��� ������� ��� ����� �� ���� ������, ���� �ν��Ͻ��� ���� Ÿ���� ���������� ����ȯ�� �ؾ߸� �ν��Ͻ��� ��� ������� ����� �� �ִ� ��
 *   
 *   */
