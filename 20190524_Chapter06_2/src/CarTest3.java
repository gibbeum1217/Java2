//5.5 생성자를 이용한 인스턴스의 복사

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4); // ★ this(매개변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
		//this는 '참조변수' 이고 this()는 '생성자'이다.
	}
	
	//현재 사용하고 있는 인스턴스와 같은 상태를 갖는 인스턴스를 하나 더 만들고자 할대 생성자를 이용할 수 있다
	//두 인스턴스가 같은 상태를 갖는다는 것은 두 인스턴스의 모든 인스턴스 변수(상태)가 동일한 값을 갖고 있다는 것을 뜻한다
	
	Car(Car c) { //★인스턴스의 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
		
		//위의 코드는 Car클래스의 참조변수를 매개변수로 선언한 생성자이다. 
		//매개변수로 넘겨진 참조변수가 가리키는 Car인스턴스의 인스턴스 변수인 color, gearType, door의 값을 인스턴스 자신으로 복사하는 것이다. 
	}
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
	
	
	
	
}
public class CarTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1); // 인스턴스 c2는 c1을 복사하여 생성된것이므로 서로 같은 상태를 갖지만, 서로 독립적으로 메모리 공간에 존재하는
		//별도의 인스턴스이므로 c1의값들이 변경되어도 c2는 영향을 받지 않는다.
		
		System.out.println("c1의 color = " +c1.color+", gearType="+c1.gearType+",door="+c1.door);
		System.out.println("c2의 color = " +c2.color+", gearType="+c2.gearType+",door="+c2.door);
		c1.door=100; //c1의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행후");
		System.out.println("c1의 color = " +c1.color+", gearType="+c1.gearType+",door="+c1.door);
		System.out.println("c2의 color = " +c2.color+", gearType="+c2.gearType+",door="+c2.door);
	}

}
