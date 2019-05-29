/*인터페이스의 장점

1.개발시간을 단축시킬 수 있다
일단 인터페이스가 작성되면 이를 사용해서 프로그램을 작성하는 것이 가능하다
메서드를 호출하는 쪽에서는 메서드의 내용에 관계없이 선언부만 알면 되기 때문이다
   그리고 동시에 다른 한 쪽에서는 인터페이스를 구현하는 클래스를 작성하게 하면, 인터페이스를 구현하는 클래스가 작성될때까지 기다리지 않고도 양쪽에서 동시에 개발을 진행할 수 있다
   
   2.표준화가 가능하다
   프로젝트에 사용되는 기본틀을 인터페이스로 작성한 다음, 개발자들에게 인터페이스를 구현하여 프로그램을 작성하도록 함으로써 보다 일관되고 정형화된 프로그램의 개발이 가능하다
   
   3. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다
   서로 상속관계에있지도 않고, 같은 조상클래스를 가지고 있지 않은 서로 아무런 곤계도 없는 클래스들에게 하나의 인터페이스를 공통적으로 구현하도록 함으로써 관계를 맺어 줄 수 있다
   
   4. 독립적인 프로그래밍이 가능하다
   
   인터페이스를 이용하면 클래스의 선언과 구현을 분리시킬 수 있기 때문에
   실제구현에 독립적인 프로그램을 작성하는 것이 가능하다
   클래스와 클래스간의 직접적인 관계를 인터페이스를 이용해서 간접적인 관계로 변경하면, 한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍이 가능하다
   
   게임에 나오는 모든 유닛들의 최고조상은 Unit클래스이고 유닛의 종류는 지상유닛(GroundUnit)고 공중유닛(AirUnit)으로 나누어진다
   그리고 지상유닛에는 Marine, SCV, Tank가 있고
   공중유닛으로는 Dropship이 있다
   
   SCV에게 Tank와 Dropship과 같은 기계화 유닛을 수리할 수 있는 기능을 제공하기 위해 repair메서드를 정의한다면 다음과 같은 것이다
   
   void repair(Tank t) {
  //Tank를 수리한다
	}
	void repair(Dropship d) {
		//Dropship을 수리한다.
	}
	이런식으로 수리가 가능한 유닛의 개수만큼 다른 버전의 오버로딩된 메서드를 정의해야 할 것이다
	이것을 피하기 위해 매개변수의 타입을 이 들의 공통 조상으로 하면 좋겠지만 Dropship은 공통조상이 다르기 때문에 공통조상의 타입으로 메서드를 정의한다고 해도 최소한 2개의 메서드가 필요할 것이다
	void repair(GroundUnit gu) {
		//매개변수로 넘겨진 지상유닛을 수리한다
	}
	void repair(AirUnit au) {
		
		//매개변수로 넘겨진 공중유닛을 수리한다
	}
	
	그리고 GroundUnit의 자손중에는 Marine과 같이 기계화 유닛이 아닌 클래스도 포함될수 있기 때문에 repair메서드의 매개변수 타입으로 GroundUnit은 부적합하다
	현재의 상속관계에서는 이들의 공통점은 없다. 이 때 인터페이스를 이용하면 기존의 상속체계를 유지하면서 이들 기계화 유닛에 공통점을 부여 할 수 있다
	
	다음과 같이 Repairable이라는 인터페이스를 정의하고 수리가 가능한 기계화 유닛에게 이 인터페이스를 구현하도록 하면 된다
	
	interface Repairable {}
	class SCV extends GroundUnit implements Repairable{
		//...
	}
	class Tank extends GroundUnit implements Repairable{
		//...
	}
	class Dropship extends AirUnit implements Repairable{
		//...
	}

	이제 이 3개의 클래스에는 같은 인터페이스를 구현했다는 공통점이 생겼다
	그리고 repair메서드의 매개변수의 타입을 Repairalbe로 선언하면, 이 메서드의 매개변수로 Repairable인터페이스를 구현한 클래스의 인스턴스만 받아들여질 것이다. 
	
	void repair(Repairable r) {
		//매개변수로 넘겨받은 유닛을 수리한다. 
	}
*/
package interface1;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
	
		scv.repair(tank); // SCV가 Tank를 수리하도록 한다
		scv.repair(dropship);
	//  scv.repair(marine);
	}

}

interface Repairable{}

class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
	//...
}
	
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
	
}


class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
	//...
}

class Dropship extends AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP; // 초기화
	}
	
	public String toString() {
		return "Dropship";
	}
	//...
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
	//...
}

class SCV extends GroundUnit implements Repairable{
	
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {  //repair메서드의 매개변수 r은 Repairable타입이기 때문에 인터페이스 Repairable에 정의된 멤버만 사용할 수 있다
		//그러나 Repairable에는 정의된 멤버가 없으므로 이 타입의 참조변수로는 할 수 있는 일은 아무 것도 없다. 
		
		if(r instanceof Unit) { //그래서 instanceof연산자로 타입을 체크한뒤 캐스팅하여 Unit클래스에 정의된 hitPoint와 MAX_HP를 사용할 수 있도록 하였다. 
			Unit u = (Unit)r;
			while(u.hitPoint !=u.MAX_HP) {   //그다음엔 유닛의 현재체력(hitPoint)이 유닛이 가질 수 있는 최고 체력(MAX_HP)이 될때까지 체력을 증가시키는 작업을 수행한다.
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		}
	}
}
