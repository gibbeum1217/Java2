/*4.1�����ڶ�
�������� ������ ũ�� ���� �����ڿ� �� ���� �����ڷ� ���� �� �ִ�

���� ������ public, protected, default, private
�׿� static, final, abstract, synchronized

4.2 static- Ŭ������, ��������

�ν��Ͻ������� �ϳ��� Ŭ�����κ��� �����Ǿ����� ���� �ٸ� ���� ����������, Ŭ��������(static�������)�� �ν��Ͻ��� ������� ���� ���� ���´�
�� ������ �ϳ��� ������ ��� �ν��Ͻ��� �����ϱ� �����̴�.

�ν��Ͻ��޼���� static�޼����� �ٺ����� ���̴� �޼��� ������ �ν��Ͻ� ����� ����ϴ°��� ���ο� �ִ�

4.3 final - ��������, ����� �� ����
�������� �Ǵ� ����� �������� �ǹ̸� ������ ������ ���� ��� ��� ���� �� �ִ�

������ ���Ǹ� ���� ������ �� ���� ����� �Ǹ�, �޼��忡 ���Ǹ� �������̵��� �� �� ���� �ǰ�
Ŭ������ ���Ǹ� �ڽ��� Ȯ���ϴ� �ڼ�Ŭ������ �������� ���ϰ� �ȴ�.
*/

/*final class FinalTest { //������ �� �� ���� Ŭ����
	final int MAX_SIZE = 10; //���� ������ �� ���� �������(���)
	
	final void getMaxSize();  //�������̵� �� �� ���� �޼���(���� �Ұ�)
	
	final int LV = AMX_SIZE; //���� ������ �� ���� ��������(���)
	return MAX_SIZE;
	}
}*/

package modifier;

class Card{
	final int NUMBER;    //final�� ���� ����̹Ƿ� �Ϲ������� ����� �ʱ�ȭ�� ���ÿ� ������
	final String KIND;   //���ν��Ͻ������� ��� �����ڿ��� �ʱ�ȭ �ǵ��� �� �� �ִ�
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){ //��Ŭ�������� �Ű������� ���� �����ڸ� �����Ͽ�, �ν��Ͻ��� �����Ҷ� final�� ���� ��������� �ʱ�ȭ�ϴµ� �ʿ��� ���� 
		//�ڻ������� �Ű������κ��� �����޴� ���̴�. 
		//�̱���� Ȱ���ϸ� �� �ν��Ͻ����� fianl�� ���� ��������� �ٸ� ���� ������ �ϴ°��� �����ϴ�. 
		KIND = kind;  //�Ű������� �Ѱܹ��� ������ KIND�� NUMBER�� �ʱ�ȭ�Ѵ�.
		NUMBER = num;
	}
	
	Card() {
		this("HEART",1); //�⺻�����ڿ��� ���� �ʱ�ȭ ��Ű�� ������! 
		
	}
	
	public String toString() {
		return KIND +" " +NUMBER;
		
	}

}

public class FinalCardTest {
	public static void main(String args[]) {
		Card c = new Card("HEART", 10);
		
	//c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c.toString());
		
	}
}
