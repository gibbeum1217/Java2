class Tv{
	//Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	//Tv의 기능(메서드)
	void power() {power =!power;}
	void channelUp() {++channel;}
	void channelDown() {==channel;}
	
}



public class TvTest3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은" +t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
		
	
		t2=t1; //t1이 저장하고 있는 값(주소)을 t2에 저장한다.   t1은 참조변수이므로 인스턴스의 주소를 저장학 있다
		//이 문장이 수행되면 t2가 가지고 있던 값은 잃어버리게 되고 t1에 저장되어 있던 값이 t2에 저장되게 된다
		//그렇게 되면 t2역시 t1이 참조하고 있던 인스턴스를 같이 참조하게되고 t2가 원래 참조하고 있던 인스턴스는 더이상 사용할 수 없게 된다. 
		//자신을 참조하고 있는 참조변수가 하나도 없는 인스턴스는 더이상 사용되어질 수 없으므로 가비지 컬렉터에 의해서 자동적으로 메모리에서 제거된다.
		
		t1.channel=7; //channel의 값을 7로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " +t1.channel+"입니다.");
		System.out.println("t2의 channel값은" +t2.channel+"입니다.");
	}

}

//이 예제에서 알 수 있듯이, 참조변수에는 하나의 값(주소)만이 저장될 수 있으므로 둘 이상의 참조변수가 하나의 인스턴스를 가리키는(참조하는)것은 가능하지만
//하나의 참조변수로 여러 개의 인스텉ㄴ스를 가리키는 것은 가능하지 않다.

