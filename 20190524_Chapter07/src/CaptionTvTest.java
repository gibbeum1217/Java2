/*����̶� �ڱ����� Ŭ������ �����Ͽ� ���ο� Ŭ������ �ۼ��ϴ� ���̴�.
����� ���ؼ� Ŭ������ �ۼ��ϸ� ���� ���� ���� �ڵ�� ���ο� Ŭ������ �ۼ��� �� �ְ� �ڵ带 ���������� ���� �� �� �ֱ� ������
�ڵ��� �߰� �� ������ �ſ� �����ϴ�.

class Child extends Parent{

}

�� �� Ŭ������ ���� ��Ӱ��迡�ִٰ� �ϸ�, ������ִ� Ŭ������ '����Ŭ����'�� �ϰ� ��� �޴� Ŭ������ '�ڼ� Ŭ����'�� �Ѵ�.
�ڼ�Ŭ������ ���� Ŭ������ ��� ����� ��ӹޱ� ������, ChildŬ������ ParentŬ������ ������� �����Ѵٰ� �� �� �ִ�. 

���� ParentŬ������ age��� ������ ������ ��������� �߰��ϸ�, �ڼ� Ŭ������ ������ ����� ��� ��ӹޱ� ������
ChildŬ������ �ڵ������� age��� ��������� �߰��ȰͰ� ���� ȿ���� ��´�


�̹��� �ݴ�� �ڼ��� ChildŬ������ ���ο� ����� play()�޼��带 �߰��غ���.

class Parent{
	int age;
}
class Child extends Parent{
	
	void play() {
		System.out.println("����~");
	}
}

���� Ŭ������ ����Ǹ� �ڼ� Ŭ������ �ڵ������� ������ �ް� ������, �ڼ� Ŭ������ ����Ǵ� ���� ���� Ŭ������ �ƹ��� ������ ���� ���Ѵ�.��
�ڼ� Ŭ������ ���� Ŭ������ ��� ����� ��� �����Ƿ� �׻� ���� Ŭ�������� ���ų� ���� ����� ���´�. 

class Parent{}
class Child extends Parent{}
class Child2 extends Parent{}

Ŭ���� Child�� Child2�� ��� ParentŬ������ ��ӹް� �����Ƿ� ParentŬ������ ChildŬ����, �׸��� ParentŬ������ Child2Ŭ������ ���� ��Ӱ��迡 ������
Ŭ���� Child�� Child2������ ���� �ƹ��� ���赵 �������� �ʴ´�. Ŭ���� ���� ���迡�� ��������� ���� ���� ����.
�θ�� �ڽ��� ����(��Ӱ���)���� ������ ���̴�.

*/




class Tv{
	boolean power;
	int channel;
	
	void power() { power =! power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}


/*
 * TvŬ�����κ��� ��ӹް� ����� �߰��Ͽ� CaptionTvŬ������ �ۼ��Ͽ���. ������� caption�� ĸ�Ǳ���� ���¸� �����ϱ� ����
 * boolean�� �����̰� displayCaption(String text)�� �Ű������� �Ѱܹ��� ���ڿ�(text)�� ĸ���� �����ִ�
 * ���(caption�� ���� true�� ���)���� ȭ�鿡 ����Ѵ�.
 * 
 * �ڼ� Ŭ������ �ν��Ͻ��� �����ϸ� ����Ŭ������ ����� �Բ� �����Ǳ� ������ ���� ����Ŭ������ �ν��Ͻ��� �������� �ʰ� ���� Ŭ������
 * ������� ����� �� �ִ�.
 * 
 * Caption Tv: caption displayCaption() Tv(power, channel, power(), channelUp(),
 * channelDown() ���δ� ����)
 */
class CaptionTv extends Tv{
	
	boolean caption;
	void displayCaption(String text) {
		if(caption) { //ĸ�� ���°� on(true)�϶��� text�� �����ش�.
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption=true;
		ctv.displayCaption("Hello, World");
	}

}
