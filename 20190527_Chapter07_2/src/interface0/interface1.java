/*���� ��� ������ ���� TvŬ������ VCRŬ������ ���� ��, TVCRŬ������ �ۼ��ϱ����� �� Ŭ�����κ��� ����� ���� ���� �ִٸ� �������� ���߻���� ������� �����Ƿ�
���ʸ� �����Ͽ� ��ӹް� ������ �� ���� Ŭ���� ���� ���Խ��Ѽ� ���������� �ν��Ͻ��� �����ؼ� ����ϵ��� �Ѵ�

public class Tv{
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() { power =! power; }
	public void channelUp() {channel++;}
	public void channelDown() {channel--;}
	public void volumeUp() {volume++:}
	public void volumeDown() {volume--;}
	
	
}

public class VCR_
	protected int counter;
	public void play() {
		
	}
	
	public void stop() {
		
	}
	
	puclic void reset() {
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int c) {
		counter = c;
	}
}

VCRŬ������ ���ǵ� �޼���� ��ġ�ϴ� �߻�޼��带 ���� �������̽��� �ۼ��Ѵ�.

public inteface IVCR{
		public void play();
		public void stop();
		public void reset();
		public int getCounter();
		public void setCounter(int c);
	
}

���� IVCR�������̽��� �����ϰ� TvŬ�����κ��� ��ӹ޴� TVCRŬ������ �ۼ��Ѵ�
���� VCRŬ����Ÿ���� ���������� ��������� �����Ͽ� IVCR�������̽��� �߻�޼��带 �����ϴµ� ����Ѵ�

public class TVCR extends Tv implements IVCR{
	VCR vcr = new VCR();
	
	public void play() {
		vcr.play(); //�ڵ带 �ۼ��ϴ� ��� VCR�ν��Ͻ��� �޼��带 ȣ���Ѵ�
	}
	public void stop() {
		vcr.stop();
	}
	public void reset() {
		vcr.reset();
	}
	public int getCounter() {
		return vcr.getCounter();
	}
	public int setCounter(int c) {
		vcr.setCounter(c);
	}
}
IVCR�������̽��� �����ϱ� ���ؼ��� ���� �޼��带 �ۼ��ؾ��ϴ� �δ��� ������
��ó�� VCRŬ������ �ν��Ͻ��� ����ϸ� �ս��� ���߻���� ������ �� �ִ�


7.6 �������̽��� �̿��� ������
�������� ���� �н��Ҷ� �ڼ�Ŭ������ �ν��Ͻ��� ����Ÿ���� ���������� �����ϴ°��� �����ϴٴ� ���� �����
�������̽� ���� �̸� ������ Ŭ������ �����̶� �� �� �����Ƿ�
�ش� �������̽� Ÿ���� ���������� �̸� ������ Ŭ������ �ν��Ͻ��� �����Ҽ� ������, �������̽� Ÿ�������� ����ȯ�� �����ϴ�

�������̽� Fightable�� Ŭ���� Fighter�� ����������
������ ���� Fighter�ν��ʹ��� FightableŸ���� ���������� �����ϴ� ���� �����ϴ�.


���� �������̽��� ������ ���� �޼����� �Ű������� Ÿ������ ���� �� �ִ� ��
void attack(Fightable f) {
	//...
}

�������̽�Ÿ���� �Ű������� ���� �̤ѹ̴�
�޼��� ȣ��� �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� �Ű������� �����ؾ��Ѵٴ� ���̴�

�׷��� attack�޼��带 ȣ���Ҷ��� �Ű������� Fightable�������̽��� ������ Ŭ������ �ν��Ͻ��� �Ѱ��־�� �Ѵ�


class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {}
	public void attack(Fightable f) {}
	
	���� ���� Fightable�������̽��� ������ FighterŬ������ ���� ��
	attack�޼����� �Ű������� Fighter�Κ��ʽ��� �Ѱ��ټ� �ִ� ��, attack(new Fighter())�� ���� �� �� �ִٴ� ���̴�
	
	�׸��� ������ ���� �޼����� ����Ÿ������ �������̽��� Ÿ���� �����ϴ� �� ���� �����ϴ�
	
	Fightable method() {
		
		Fighter f = new Fighter();
		return f;
	}
	����Ÿ���� �������̽���� ���� �޼��尡 �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ� ���� �ǹ��Ѵ� �ڡ�
	
	���� �ڵ忡���� method()�� ����Ÿ���� Fightable�������̽��̱� ������ 
	�޼����� return������ Fightable�������̽��� ������ FighterŬ������ �ν��Ͻ��� ��ȯ�Ѵ�. 
	*/
}


package interface0;

public class interface1 {

}
