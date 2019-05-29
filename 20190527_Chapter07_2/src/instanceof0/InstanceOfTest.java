package instanceof0;

public class InstanceOfTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			
			System.out.println("This is FireEngine instance.");
			
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
			
		}
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
			
		}
		System.out.println(fe.getClass().getName()); //참조변수.getClass().getName()은 참조변수가 가리키고 있는 인스턴스의 클래스 이름을 문자열(String)로 반환한다
		
	}

}

class Car{}
class FireEngine extends Car{}

//FireEngine클래스는 Object클래스와 Car클래스의 자손 클래스이므로 조상의 멤버들을 상속받았기 때문에, FireEngine인스턴스는 Object인스턴스와 Car인스턴스를 포함하고 있는 셈이기 떄문이다.
//요약하면 실제 인스턴스와 같은 타입의 instanceof연산 이외에 조상타입의 instanceof연산에도 true를 결과로 얻으며
//instanceof연산의 결과가 true라는 것은 검사한 타입을의 형변환을 해도 아무런 문제가 없다는 뜻이다.
//★ 어떤 타입에 대한 instanceof연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다 



/*
 * 
 * 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof연산자를 사용한다
 * 주로 조건문에 사용되며 instanceof의 왼쪽에는 참조변수를 오른ㅉㄱ에는 타입(클래스명)이 피연산자로 위치한다
 * 그리고 연산의 결과로 boolean 값인 true와 false중의 하나를 반환한다
 * 
 *   instanceof를 이용한 연산결과로 true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
 *   
 *   instanceof연산자를 이용해서 참조변수c가 가리키고 있는 인스턴스의 타입을 체크하고
 *   적절히 형변환한 다음에 작업을 해야한다
 *   
 *   조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있기 때문에
 *   참조변수의 타입과 인스턴스의 타입이 항상 일치하지는 않는다는 것을 배웠다
 *   조상타입의 참조변수로는 실제 인스턴스의 멤버들을 모두 사용할 수 없기 때문에, 실제 인스턴스와 같은 타입의 참조변수로 형변환을 해야만 인스턴스의 모든 멤버들을 사용할 수 있다 ★
 *   
 *   */
