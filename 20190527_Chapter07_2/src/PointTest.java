import PointTest2.Point;
import PointTest2.Point3D;

public class PointTest {

	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
		
	}

}

class Point{
	int x, y;
	
	Point(int x, int y){
		
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x:" + x+ ", y:"+y;
	}
}


class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		
		super(x, y); //����Ŭ������ ������ Point(int x, int y)�� ȣ���Ѵ�.   ����Ŭ������ ��������� ��ó�� ������ �����ڿ� ���� �ʱ�ȭ�ǵ��� �ؾ� �ϴ� ���̴�.  
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		
		return "x:" + x+ ", y:"+y+ " , z :"+z;
	}
}

/*
 * �� ������ �������ϸ� Point3DŬ������ �����ڿ��� ���� Ŭ���� �������� Point()�� ã�� �� ���ٴ� �����̴� Point3DŬ������
 * �������� ù���� �����ڸ� ȣ���ϴ� ������ �ƴϱ� ������ �����Ϸ��� ������ ���� �ڵ������� super();�� Point3DŬ������ ��������
 * ù�ٿ� �־� �ش� �׷��� Point3DŬ������ �ν��Ͻ��� �����ϸ�, ������Point3D(int x, int y, int z)�� ȣ��Ǹ鼭
 * ù ������ super();�� �����ϰ� �ȴ� ��super()�� Point3DŬ������ ������ PointŬ������ �⺻�������� Point()��
 * ���ϹǷ� Point()�� ȣ��ȴ�
 * 
 * �׷��� PointŬ������ ������ Point()�� ���ǵǾ� �ֱ� ������ ���� ���� �����Ͽ����� �߻��� ���̴�.
 * �� ������ �����Ϸ��� PointŬ������ ������ Point()�� �߰����ִ���
 * ������ Point3D(int x, int y, int z)�� ù�ٿ��� Point(int x, int y)�� ȣ���ϵ��� �����ϸ� �ȴ�.
 * 
 * 
 */