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
		
		super(x, y); //조상클래스의 생성자 Point(int x, int y)를 호출한다.   조상클래스의 멤버변수는 이처럼 조상의 생성자에 의해 초기화되도록 해야 하는 것이다.  
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		
		return "x:" + x+ ", y:"+y+ " , z :"+z;
	}
}

/*
 * 이 예제를 컴파일하면 Point3D클래스의 생성자에서 조상 클래스 생성자인 Point()를 찾을 수 없다는 내용이다 Point3D클래스의
 * 생성자의 첫줄이 생성자를 호출하는 문장이 아니기 때문에 컴파일러는 다음과 같이 자동적으로 super();를 Point3D클래스의 생성자의
 * 첫줄에 넣어 준다 그래서 Point3D클래스의 인스턴스를 생성하면, 생성자Point3D(int x, int y, int z)가 호출되면서
 * 첫 문장인 super();를 수행하게 된다 ★super()는 Point3D클래스의 조상인 Point클래스의 기본생성자인 Point()를
 * 뜻하므로 Point()가 호출된다
 * 
 * 그러나 Point클래스에 생성자 Point()가 정의되어 있기 때문에 위와 같은 컴파일에러가 발생한 것이다.
 * 이 에러는 수정하려면 Point클래스에 생성자 Point()를 추가해주던가
 * 생성자 Point3D(int x, int y, int z)의 첫줄에서 Point(int x, int y)를 호출하도록 변경하면 된다.
 * 
 * 
 */