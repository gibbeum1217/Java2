package trycatch1;

public class ExceptionEx13 {

	public static void main(String[] args) {
		method1(); //���� Ŭ������ static����̹Ƿ� ��ü�������� ȣ�� ����
	}
	
	static void method1() {
		
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}

}

//���ܴ� ó�� �Ǿ����� printStackTrace()�� ���� ���ܿ� ���� ������ ȭ�鿡 ����Ͽ���
//���ܰ� method1()���� �߻������� main�޼��尡 method1()�� ȣ�������� �� �� �ִ� 

/* 1.Ŭ������ ������ ��, ������� �� ��� �ν��Ͻ��� ���������� ����ؾ��ϴ� �Ϳ� static�� ���δ�.

- �ν��Ͻ��� �����ϸ�, �� �ν��Ͻ����� ���� �������� ������ ���� �ٸ� ���� �����Ѵ�. ��쿡 ���󼭴� �� �ν��Ͻ����� ���������� ���� ���� �����Ǿ�� �ϴ� ��� static�� ���δ�.







2. static�� ���� ��������� �ν��Ͻ��� �������� �ʾƵ� ����� �� �ִ�.

- static�� ���� �������(Ŭ��������)�� Ŭ������ �޸𸮿� �ö󰥶� �̹� �ڵ������� �����Ǳ� �����̴�.


*/
	
	