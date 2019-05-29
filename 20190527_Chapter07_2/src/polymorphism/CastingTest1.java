package polymorphism;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;//CarŸ���� ��������car�� �����ϰ� null�� �ʱ�ȭ�Ѵ� 
		FireEngine fe = new FireEngine(); //FireEngine�ν��Ͻ��� �����ϰ� FireEngineŸ���� ���������� �����ϵ��� �Ѵ�. 
		FireEngine fe2 = null;
		
		fe.water();
		car=(Car)fe; //���������� fe�� �����ϰ� �ִ� �ν��Ͻ��� �������� car�� �����ϵ��� �Ѵ�.
		//��fe�ǰ�(fe�� �����ϰ��ִ� �ν��Ͻ��� �ּ�)�� car�� ����ȴ� 
		//�̶� �� ���������� Ÿ���� �ٸ��Ƿ� �������� fe�� ����ȯ�Ǿ�������� �����Ǿ���
		   //������ �������� car�� ���ؼ��� FireEngine�ν��Ͻ��� ����� �� ������, fe�ʹ� �޸� car�� CarŸ���̹Ƿ� CarŬ�����Ǹ�����ƴ� water()�� ����� �� ����.
		//car.water(); //������ ����!! CarŸ���� ���������δ� water()�� ȣ���� �� ����
		fe2=(FireEngine)car; // ����Ÿ��-> �ڼ�Ÿ��
		
		//�������� car�� �����ϰ��ִ� �ν��Ͻ��� �������� fe2�� �����ϵ��� �Ѵ�.
		// �� �� �� ���������� Ÿ���� �ٸ��Ƿ� �������� car�� ����ȯ �Ͽ���. car���� FireEngine�ν��Ͻ��� �ּҰ� ����Ǿ� �����Ƿ� fe2���� FireEngine�ν��Ͻ��� �ּҰ� ����ȴ�
		//������ ���� ���� fe2�� ���ؼ��� FireEngine �ν��Ͻ��� ����� �� ������, car�ʹ� �޸� fe2�� FireEngineŸ���̹Ƿ� FireEngine�ν��Ͻ��� ��� ������� ����� �� �ִ� 
		fe2.water();
	}

}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
		
	}
	
	void stop() {
		System.out.println("stop!!!");
		
	}
}

class FireEngine extends Car{
	void water() { // ���� �Ѹ��� ���
		System.out.println("water!!!");  // ���� fe.water(); fe2.water();������ �ι� ȣ��Ǵ°�!!
	}
	
}
