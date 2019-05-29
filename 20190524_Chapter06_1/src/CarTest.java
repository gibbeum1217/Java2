class Car{
	String color;
	String gearType; // 변속기 종류- auto(자동), manual(수동)
	int door; //문의 개수
	
	/*
	 * 생성자도 메서드처럼 매개변수를 선언하여 호출 시 값을 넘겨받아서 인스턴스의 초기화작업에 사용할 수 있다 인스턴스마다 각기 다른 값으로
	 * 초기화되어야하는 경우가 많기 때문에 매개변수를 사용한 초기화는 매우 유용하다 아래의 코드는 자동차를 클래스로 정의한 것인데, 단순히
	 * color, gearType, door세 개의 인스턴스 변수와 두개의 생성자만을 가지고 있다
	 * 
	 * Car인스턴스를 생성할때, 생성자 Car()를 사용한다면, 인스턴스를 생성한 다음에 인스턴스변수들을 따로 초기화해주어야하지만! 매개변수가
	 * 있는 생성자 Car(String color, String gearType, int door)를 사용한다면 인스턴스를 생성하는 동시에 원하는
	 * 값으로 초기화를 할 수 있게 된다 ★
	 */
	
	Car(){}  //생성자
	
	Car(String c, String g, int d){ //생성자
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
		
		System.out.println("c1의 color = " +c1.color + ", gearType=" +c1.gearType + ", door="+c1.door);
		System.out.println("c2의 color = " +c2.color + ", gearType=" +c2.gearType + ", door="+c2.door);
	
	}
}
