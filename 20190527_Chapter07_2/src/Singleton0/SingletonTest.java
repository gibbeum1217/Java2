
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
 * private static Singleton s = new Singleton(); -- getInstance()���� ���ɼ� �ֵ���
 * �ν��Ͻ��� �̸� �����Ǿ�� �ϹǷ� static�̾�� �Ѵ�
 * 
 * private Singleton() {
 * 
 * ... }�� //�ν��Ͻ��� ���������ʰ� ȣ���Ҽ� �־�� �ϹǷ� static�̾�� �Ѵ�. 
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
 * MathŬ������ �� ���� ����� static�޼��常���� �����Ǿ� �ֱ� ������ �ν��Ͻ��� ������ �ʿ䰡 ���� �׷��� �ܺηκ����� ���ʿ���
 * ������ �������� ������ ���� �������� ���������ڸ� private���� �����Ͽ��� 
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

	private Singleton() { //�̱��� ������ ����
		
}


public static Singleton getInstance() {
	if(s==null) 
		s = new Singleton();      //s�� null�̸� Singleton��ü�� �����ϰڴ�. 
	
	return s;            //�ٷ������� ��ü���������� s�� ��ȯ�ϰڴ�!!
	}
}
class SingletonTest{
	public static void main(String args[]) {
//		Singleton s = new Singleton(); -- ����!Singleton() has private access in Singleton
		
		Singleton s = Singleton.getInstance();
		//Singleton s1 = Singleton.getInstance();  --static�̴ϱ� s�� s1���� �ּҰ��� �ٶ󺸰� �ִ�.
	}
}


	
