
public class ExceptionEx17 {

	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		
	}

} //main�޼����� ��


static void method1() throws Exception{
	
	try {
		throw new Exception();
		
	}catch(Exception e) {
		System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
		throw e; // �ٽ� ���ܸ� �߻���Ų��
		}
	} //method1�޼����� �� 
}


/* ���ܸ� ó���� �Ŀ� ���������� �ٽ� �߻���Ű�� ����� ���ؼ� �����ѵ�, �̰��� ���ܵǴ����� ��� �Ѵ�

���� ���ܰ� �߻��� ���ɼ��� �ִ� �޼��忡�� try-catch���� ����ؼ� ���ܸ� ó�����ְ� catch������ �ʿ��� �۾��� ���� �Ŀ� throw���� ����ؼ� ���ܸ� �ٽ� �߻���Ų��

�ٽ� �߻��� ���ܴ� �� �޼��带 ȣ���� �޼��忡�� ���޵ǰ� ȣ���� �޼����� try-catch������ ���ܸ� �Ǵٽ� ó���Ѵ�.abstract
 
��������� �� �ֵ��� method1()�� main�޼��� �����̤� catch���� ��� ����Ǿ����� �˼��ִ�
method1()�� catch������ ���ܸ� ó���ϰ� throw���� 
���� �ٽ� ���ܸ� �߻� ���״�. 
�׸��� �� ���ܸ� main�޼��� �ѹ� �� ó���Ͽ���. 

   ��ȯ���� �ִ� return���� ���, catch������ return���� �־���Ѵ�. ���ܰ� �߻����� ��쿡�� ���� ��ȯ�ϱ� �����̴�.abstract

static int method1(){
	try{
		System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
		return  0; //���� ���� ���� �޼��带 �����Ѵ�
		}catch(Exception e){
		e.printStackTrace();
		return 1; // catch�������� return���� �ʿ��ϴ�
		}finally{
		System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}
		}
		
		�Ǵ� catch������ ���� �Ǵ����⸦ �ؼ� ȣ���� �޼���� ���ܸ� �����ϸ� return���� ��� �ȴ�
		
		static int method1() throws Exception{ //���ܸ� �����ؾ���
			try{
				System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
				return 0;
			}catch(Exception e){
				e.printStackTrace();
				
				return1;
				throw new Exception();
				
				}finally{
				System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
				}
			}
			
			*/
		
		
}