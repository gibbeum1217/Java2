/*�������̽��� ����

1.���߽ð��� �����ų �� �ִ�
�ϴ� �������̽��� �ۼ��Ǹ� �̸� ����ؼ� ���α׷��� �ۼ��ϴ� ���� �����ϴ�
�޼��带 ȣ���ϴ� �ʿ����� �޼����� ���뿡 ������� ����θ� �˸� �Ǳ� �����̴�
   �׸��� ���ÿ� �ٸ� �� �ʿ����� �������̽��� �����ϴ� Ŭ������ �ۼ��ϰ� �ϸ�, �������̽��� �����ϴ� Ŭ������ �ۼ��ɶ����� ��ٸ��� �ʰ� ���ʿ��� ���ÿ� ������ ������ �� �ִ�
   
   2.ǥ��ȭ�� �����ϴ�
   ������Ʈ�� ���Ǵ� �⺻Ʋ�� �������̽��� �ۼ��� ����, �����ڵ鿡�� �������̽��� �����Ͽ� ���α׷��� �ۼ��ϵ��� �����ν� ���� �ϰ��ǰ� ����ȭ�� ���α׷��� ������ �����ϴ�
   
   3. ���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�
   ���� ��Ӱ��迡������ �ʰ�, ���� ����Ŭ������ ������ ���� ���� ���� �ƹ��� ��赵 ���� Ŭ�����鿡�� �ϳ��� �������̽��� ���������� �����ϵ��� �����ν� ���踦 �ξ� �� �� �ִ�
   
   4. �������� ���α׷����� �����ϴ�
   
   �������̽��� �̿��ϸ� Ŭ������ ����� ������ �и���ų �� �ֱ� ������
   ���������� �������� ���α׷��� �ۼ��ϴ� ���� �����ϴ�
   Ŭ������ Ŭ�������� �������� ���踦 �������̽��� �̿��ؼ� �������� ����� �����ϸ�, �� Ŭ������ ������ ���õ� �ٸ� Ŭ������ ������ ��ġ�� �ʴ� �������� ���α׷����� �����ϴ�
   
   ���ӿ� ������ ��� ���ֵ��� �ְ������� UnitŬ�����̰� ������ ������ ��������(GroundUnit)�� ��������(AirUnit)���� ����������
   �׸��� �������ֿ��� Marine, SCV, Tank�� �ְ�
   �����������δ� Dropship�� �ִ�
   
   SCV���� Tank�� Dropship�� ���� ���ȭ ������ ������ �� �ִ� ����� �����ϱ� ���� repair�޼��带 �����Ѵٸ� ������ ���� ���̴�
   
   void repair(Tank t) {
  //Tank�� �����Ѵ�
	}
	void repair(Dropship d) {
		//Dropship�� �����Ѵ�.
	}
	�̷������� ������ ������ ������ ������ŭ �ٸ� ������ �����ε��� �޼��带 �����ؾ� �� ���̴�
	�̰��� ���ϱ� ���� �Ű������� Ÿ���� �� ���� ���� �������� �ϸ� �������� Dropship�� ���������� �ٸ��� ������ ���������� Ÿ������ �޼��带 �����Ѵٰ� �ص� �ּ��� 2���� �޼��尡 �ʿ��� ���̴�
	void repair(GroundUnit gu) {
		//�Ű������� �Ѱ��� ���������� �����Ѵ�
	}
	void repair(AirUnit au) {
		
		//�Ű������� �Ѱ��� ���������� �����Ѵ�
	}
	
	�׸��� GroundUnit�� �ڼ��߿��� Marine�� ���� ���ȭ ������ �ƴ� Ŭ������ ���Եɼ� �ֱ� ������ repair�޼����� �Ű����� Ÿ������ GroundUnit�� �������ϴ�
	������ ��Ӱ��迡���� �̵��� �������� ����. �� �� �������̽��� �̿��ϸ� ������ ���ü�踦 �����ϸ鼭 �̵� ���ȭ ���ֿ� �������� �ο� �� �� �ִ�
	
	������ ���� Repairable�̶�� �������̽��� �����ϰ� ������ ������ ���ȭ ���ֿ��� �� �������̽��� �����ϵ��� �ϸ� �ȴ�
	
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

	���� �� 3���� Ŭ�������� ���� �������̽��� �����ߴٴ� �������� �����
	�׸��� repair�޼����� �Ű������� Ÿ���� Repairalbe�� �����ϸ�, �� �޼����� �Ű������� Repairable�������̽��� ������ Ŭ������ �ν��Ͻ��� �޾Ƶ鿩�� ���̴�. 
	
	void repair(Repairable r) {
		//�Ű������� �Ѱܹ��� ������ �����Ѵ�. 
	}
*/
package interface1;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
	
		scv.repair(tank); // SCV�� Tank�� �����ϵ��� �Ѵ�
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
		hitPoint = MAX_HP; // �ʱ�ȭ
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
	
	void repair(Repairable r) {  //repair�޼����� �Ű����� r�� RepairableŸ���̱� ������ �������̽� Repairable�� ���ǵ� ����� ����� �� �ִ�
		//�׷��� Repairable���� ���ǵ� ����� �����Ƿ� �� Ÿ���� ���������δ� �� �� �ִ� ���� �ƹ� �͵� ����. 
		
		if(r instanceof Unit) { //�׷��� instanceof�����ڷ� Ÿ���� üũ�ѵ� ĳ�����Ͽ� UnitŬ������ ���ǵ� hitPoint�� MAX_HP�� ����� �� �ֵ��� �Ͽ���. 
			Unit u = (Unit)r;
			while(u.hitPoint !=u.MAX_HP) {   //�״����� ������ ����ü��(hitPoint)�� ������ ���� �� �ִ� �ְ� ü��(MAX_HP)�� �ɶ����� ü���� ������Ű�� �۾��� �����Ѵ�.
				u.hitPoint++;
			}
			System.out.println(u.toString()+"�� ������ �������ϴ�.");
		}
	}
}
