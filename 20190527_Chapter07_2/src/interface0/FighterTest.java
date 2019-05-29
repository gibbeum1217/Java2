/* �������̽���?
		�������̽��� ������ �߻�Ŭ�����̴�. �������̽��� �߻�Ŭ����ó�� �߻�޼��带 ������ �߻�Ŭ�������� �߻�ȭ ������ ���Ƽ�
		�߻�Ŭ������ �޸� ������ ���� �Ϲ� �޼��� �Ǵ� ��������� ���������� ���� �� ����. ���� �߻�޼���� ������� ����� ���� �� ������ ��
		�� ���� �ٸ� ��� ��ҵ� ������� �ʴ´�
		�߻�Ŭ������ �κ������θ� �ϼ��� �̿ϼ� ���赵��� �Ѵٸ�, �������̽��� ������ ���� �ƹ��͵� ���� �ر׸��� �׷��� �ִ� '�⺻���赵'�� �� �� �ִ�
		
		�������̽��� �߻�Ŭ����ó�� �ϼ����� ���� �ҿ����� ���̱� ������ �� ��ü������ ���Ǳ� ���ٴ� �ٸ� Ŭ������ ���� �� �������� �ۼ��ȴ� ��

7.2 �������̽��� �ۼ�
�������̽��� �ۼ��ϴ� ���� Ŭ������ �ۼ��ϴ� �Ͱ� ����
�ٸ� Ű����� class ��� interface�� ����Ѵٴ°͸� �ٸ���
�׸��� interface���� Ŭ������ ���� ���������ڷ� public�Ǵ� default�� ����� �� �ִ�

interface �������̽� �̸�{
	public static final Ÿ�� ����̸� = ��;
	public abstract �޼����̸�(�Ű��������);
}
		

�Ϲ� Ŭ������ ������ �޸� �������̽��� ������� ������ ���� ��������� �ִ�.
-��� ��������� public static final�̾�� �ϸ�, �̸� ���� �� �� �ִ�
-��� �޼���� public abstract �̾���ϸ�, �̸� ������ �� �ִ�
�������̽��� ���ǵ� ��� ����� ���ܾ��� ����Ǵ� �����̱� ������ �����ڸ� �����Ҽ� �ִ� ���̸�, ���ǻ� �����ϴ� ��찡 ����
������ �����ڴ� ������ �ÿ� �����Ϸ��� �ڵ������� �߰����ش�.


7.3 �������̽��� ���
�������̽��� �������̽��κ��͸� ��ӹ��� �� ������, Ŭ�����ʹ� �޸� ���߻��, �� �������� �������̽��κ��� ����� �޴� ���� �����ϴ�

�������̽��� Ŭ������ �޸� ObjectŬ������ ���� �ְ� ������ ����


interface Moveable{
	
	void move(int x, int y);
}
interface Attackable{
	void attack(Unit u);
}
interface Fightable extends Movable, Attackable{}

�ڼ� �������̽�(Fightable)�� ���� �������̽�(Moveable, Attakcable)�� ���ǵ� ����� ��� ��ӹ޴´�

�׷��� Fightable��ü���� ���ǵ� ����� �ϳ��� ������ ���� �������̽��κ��� ��ӹ��� �ΰ��� �߻�޼��� move(int x, int y)�� attack(Unit u)�� ����� ���� �ȴ�


7.4�������̽��� ����
�������̽��� �߻�Ŭ����ó�� �� ��ü�δ� �ν��Ͻ��� ������ �� ������, �߻�Ŭ������ ����� ���� �߻�޼��带 �ϼ��ϴ� ��ó��, �������̽��� �ڽſ� ���ǵ� �߻�޼����� ������ ������ִ� Ŭ������ �ۼ��ؾ��ϴµ�
�� ����� �߻�Ŭ������ �ڽ��� ��ӹ޴� Ŭ������ �����ϴ� �Ͱ� �ٸ��� �ʴ�
�ٸ� Ŭ������ Ȯ���Ѵٴ� �ǹ��� Ű���� extends�� ��������� �������̽��� �����Ѵٴ� �ǹ��� Ű���� implements�� ����� ���̴�

class Ŭ�����̸� implemetns �������̽��̸�{
	
	
}

*/
		
package interface0;

import interface1.Unit;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		
		if(f instanceof Fightable) 
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
			
		if(f instanceof Movable) 
			
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
			
		if(f instanceof Attackble) 
			System.out.println("f�� Attakable�������̽��� �����߽��ϴ�.");
			
		if(f instanceof Object) 
			
			System.out.println("f�� ObjextŬ������ �ڼ��Դϴ�.");
		
		
	}
}
		
class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {}
	public void attack(Unit u) {}
	
}

class Unit{
	int currentHP;
	int x;
	int y;
}
		
interface Fightable extends Movable, Attackble{}
interface Movable{ void move(int x, int y); }
interface Attackble{ void attack(Unit u);}

