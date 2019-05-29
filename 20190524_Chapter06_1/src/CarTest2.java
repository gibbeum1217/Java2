class Car{
	
	String color; //색상
	String gearType; // 변속기종료 - 자동, 수동
	int door; //문의 개수

	Car(){
		
		this("white", "auto", 4);  // 생성자 Car()에서 또다른 생성자 (String color, String gearType, int door)를 호출 하였다.
		                                 //생성자간의 호출에는 생성자의 이름대신 this를 사용해야만 하므로 Car 대신 this를 사용했다 ★
		                             //생성자Car()를 사용해서 Car인스턴스 생성한 경우에, 인스턴스변수color는 "white", gearType은 "auto", door는 4로 초기화되도록 하였다
		//이것은 마치 실생활에서 자동차(Car인스턴스)를 생산할때, 아무런 옵션도 주지 않으면, 기본적으로 흰색에 자동변속기어 그리고 문의 개수가 4개인 자동차가 생상되도록 하는 것에 비유 할 수 있다
		
	}
	
	Car(String color){
		this(color, "auto", 4);
		
	}
	
	Car(String color, String gearType, int door){
		this.color =color;
		this.gearType =gearType;
		this.door=door;
		
		/*
		 * 생성자의 매개변수로 선언된 변수의 이름이 color로 인스턴스변수 color와 같을 경우에는 이름만으로는 두 변수가 서로 구분히 안된다
		 * 이런 경우에는 인스턴스변수앞에 this를 사용하면 된다 'this'로 인스턴스변수에 접근할 수 있는 것이다. 하지만 this를 사용할 수
		 * 있는 것은 인스턴스멤버뿐이다. static메서드에서는 인스턴스 멤버들을 사용할 수 없는것처럼, this역시 사용할 수 없다
		 * static메서드는 인스턴스를 생성하지않고도 호출될 수 있으므로 static메서드가 호출된 시점에 인스턴스가 존재하지 않을 수도 있기
		 * 때문이다.
		 */
		
	}
}

public class CarTest2 {
	public static void main(String[] args) {
		
			Car c1 = new Car();
			Car c2 = new Car("blue");
		
			System.out.println("c1의 color = " +c1.color+", gearType="+c1.gearType+",door="+c1.door);
			System.out.println("c2의 color = " +c2.color+", gearType="+c2.gearType+",door="+c2.door);
	}
}
