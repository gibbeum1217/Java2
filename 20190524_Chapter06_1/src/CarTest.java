class Car{
	String color;
	String gearType; // ���ӱ� ����- auto(�ڵ�), manual(����)
	int door; //���� ����
	
	/*
	 * �����ڵ� �޼���ó�� �Ű������� �����Ͽ� ȣ�� �� ���� �Ѱܹ޾Ƽ� �ν��Ͻ��� �ʱ�ȭ�۾��� ����� �� �ִ� �ν��Ͻ����� ���� �ٸ� ������
	 * �ʱ�ȭ�Ǿ���ϴ� ��찡 ���� ������ �Ű������� ����� �ʱ�ȭ�� �ſ� �����ϴ� �Ʒ��� �ڵ�� �ڵ����� Ŭ������ ������ ���ε�, �ܼ���
	 * color, gearType, door�� ���� �ν��Ͻ� ������ �ΰ��� �����ڸ��� ������ �ִ�
	 * 
	 * Car�ν��Ͻ��� �����Ҷ�, ������ Car()�� ����Ѵٸ�, �ν��Ͻ��� ������ ������ �ν��Ͻ��������� ���� �ʱ�ȭ���־��������! �Ű�������
	 * �ִ� ������ Car(String color, String gearType, int door)�� ����Ѵٸ� �ν��Ͻ��� �����ϴ� ���ÿ� ���ϴ�
	 * ������ �ʱ�ȭ�� �� �� �ְ� �ȴ� ��
	 */
	
	Car(){}  //������
	
	Car(String c, String g, int d){ //������
		color = c;
		gearType =g;
		door =d;
		
	}
	
}






public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("c1�� color = " +c1.color + ", gearType=" +c1.gearType + ", door="+c1.door);
		System.out.println("c2�� color = " +c2.color + ", gearType=" +c2.gearType + ", door="+c2.door);
	
	}
}
