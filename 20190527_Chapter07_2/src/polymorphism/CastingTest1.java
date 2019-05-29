package polymorphism;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;//Car타입의 참조변수car를 선언하고 null로 초기화한다 
		FireEngine fe = new FireEngine(); //FireEngine인스턴스를 생성하고 FireEngine타입의 참조변수가 참조하도록 한다. 
		FireEngine fe2 = null;
		
		fe.water();
		car=(Car)fe; //★참조변수 fe가 참조하고 있는 인스턴스를 참조변수 car가 참조하도록 한다.
		//★fe의값(fe가 참조하고있는 인스턴스의 주소)이 car에 저장된다 
		//이때 두 참조변수의 타입이 다르므로 참조변수 fe가 형변환되어야하지만 생략되었다
		   //이제는 참조변수 car를 통해서도 FireEngine인스턴스를 사용할 수 있지만, fe와는 달리 car은 Car타입이므로 Car클래스의멤버가아닌 water()는 사용할 수 없다.
		//car.water(); //컴파일 에러!! Car타입의 참조변수로는 water()를 호출할 수 없다
		fe2=(FireEngine)car; // 조상타입-> 자손타입
		
		//참조변수 car가 참조하고있는 인스턴스를 참조변수 fe2가 참조하도록 한다.
		// 이 때 두 참조변수의 타입이 다르므로 참조변수 car를 형변환 하였다. car에는 FireEngine인스턴스의 주소가 저장되어 있으므로 fe2에도 FireEngine인스턴스의 주소가 저장된다
		//이제는 참조 변수 fe2를 통해서도 FireEngine 인스턴스를 사용할 수 있지만, car와는 달리 fe2는 FireEngine타입이므로 FireEngine인스턴스의 모든 멤버들을 사용할 수 있다 
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
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");  // 위에 fe.water(); fe2.water();때문에 두번 호출되는거!!
	}
	
}
