
  package Singleton0;
 /* 
 * public class SingletonTest {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * class Singleton{
 * 
 * ... 
 * private static Singleton s = new Singleton(); -- getInstance()에서 사용될수 있도록
 * 인스턴스가 미리 생성되어야 하므로 static이어야 한다
 * 
 * private Singleton() {
 * 
 * ... }★ //인스턴스를 생성하지않고도 호출할수 있어야 하므로 static이어야 한다. 
 * 
 * 
 * public static Singleton getInstance() { 
 * 
 *   return s; 
 *   
 *   } 
 *   
 * }
 * 
 * Math클래스는 몇 개의 상수와 static메서드만으로 구성되어 있기 때문에 인스턴스를 생성할 필요가 없다 그래서 외부로부터의 불필요한
 * 접근을 막기위해 다음과 같이 생성자의 접근제어자를 private으로 지정하였다 
 * 
 * public final class Math{ 
 * 
 * private Math() {} 
 * 
 * ... 
 * 
 * 
 * }
 */


final class Singleton{
	
	private static Singleton s = new Singleton();

	private Singleton() { //싱글톤 생성자 생성
		
}


public static Singleton getInstance() {
	if(s==null) 
		s = new Singleton();      //s가 null이면 Singleton객체를 생성하겠다. 
	
	return s;            //바로위에서 객체생성했으니 s를 반환하겠다!!
	}
}
class SingletonTest{
	public static void main(String args[]) {
//		Singleton s = new Singleton(); -- 에러!Singleton() has private access in Singleton
		
		Singleton s = Singleton.getInstance();
		//Singleton s1 = Singleton.getInstance();  --static이니까 s랑 s1같은 주소값을 바라보고 있다.
	}
}


	
