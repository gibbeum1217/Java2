class Car{
	
	String color; //����
	String gearType; // ���ӱ����� - �ڵ�, ����
	int door; //���� ����

	Car(){
		
		this("white", "auto", 4);  // ������ Car()���� �Ǵٸ� ������ (String color, String gearType, int door)�� ȣ�� �Ͽ���.
		                                 //�����ڰ��� ȣ�⿡�� �������� �̸���� this�� ����ؾ߸� �ϹǷ� Car ��� this�� ����ߴ� ��
		                             //������Car()�� ����ؼ� Car�ν��Ͻ� ������ ��쿡, �ν��Ͻ�����color�� "white", gearType�� "auto", door�� 4�� �ʱ�ȭ�ǵ��� �Ͽ���
		//�̰��� ��ġ �ǻ�Ȱ���� �ڵ���(Car�ν��Ͻ�)�� �����Ҷ�, �ƹ��� �ɼǵ� ���� ������, �⺻������ ����� �ڵ����ӱ�� �׸��� ���� ������ 4���� �ڵ����� ����ǵ��� �ϴ� �Ϳ� ���� �� �� �ִ�
		
	}
	
	Car(String color){
		this(color, "auto", 4);
		
	}
	
	Car(String color, String gearType, int door){
		this.color =color;
		this.gearType =gearType;
		this.door=door;
		
		/*
		 * �������� �Ű������� ����� ������ �̸��� color�� �ν��Ͻ����� color�� ���� ��쿡�� �̸������δ� �� ������ ���� ������ �ȵȴ�
		 * �̷� ��쿡�� �ν��Ͻ������տ� this�� ����ϸ� �ȴ� 'this'�� �ν��Ͻ������� ������ �� �ִ� ���̴�. ������ this�� ����� ��
		 * �ִ� ���� �ν��Ͻ�������̴�. static�޼��忡���� �ν��Ͻ� ������� ����� �� ���°�ó��, this���� ����� �� ����
		 * static�޼���� �ν��Ͻ��� ���������ʰ� ȣ��� �� �����Ƿ� static�޼��尡 ȣ��� ������ �ν��Ͻ��� �������� ���� ���� �ֱ�
		 * �����̴�.
		 */
		
	}
}

public class CarTest2 {
	public static void main(String[] args) {
		
			Car c1 = new Car();
			Car c2 = new Car("blue");
		
			System.out.println("c1�� color = " +c1.color+", gearType="+c1.gearType+",door="+c1.door);
			System.out.println("c2�� color = " +c2.color+", gearType="+c2.gearType+",door="+c2.door);
	}
}
