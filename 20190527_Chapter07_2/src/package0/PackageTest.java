/*패키지란 클래스의 묶음이다. 패키지에는 클래스 또는 인터페이스를 포함시킬 수 있으며, 서로 관련된 클래스들끼리 그룹 단위로 묶어 놓음으로써 클래스를 효율적으로 관리할 수 있다
같은 이름의 클래스일지라도 서로 다른 패키지에 존재하는 것이 가능하므로, 자신만의 패키지 체계를 유지함으로써 다른 개발자가 개발한 클래스 라이브러리의 클래스와 이름이 충돌하는 것을 피할 수 있다

String클래스의 패키지명을 포함한 이름은 java.lang.String이다. 즉, java.lang패키지에 속한 String패키지라는 의미이다.abstract
클래스가 물리적으로 하나의 클래스파일(.class)인 것과 같이 패키지는 물리적으로 하나의 디렉토리이다. 
 예를들어 java.lang.String클래스는 물리적으로 디렉토리 java의 서브디렉토리인 lang에 속한 String.class파일이다.class
 그리고 우리가 자주 사용하는 System클래스 역시 java.lang패키지에 속하므로 lange디렉토리에 포함되어 있다
 디렉토리가 하위 디렉토리를 가질 수 있는 것처럼, 패키지도 다른 패키지를 포함할 수 있으며 점으로 구분한다. 예를들어 java.lang패키지에서 lang패키지는 java패키지의 하위패키지이다.
 
 3.2 패키지의 선언
 
패키지를 선언하는 것은 아주 간단하다
package 패캐지명;

모든 클래스는 반드시 하나의 패키지에 포함되어야 한다고 했다. 그럼에도 불구하고 지금까지 소스파일을 작성할 때 패키지를 선언하지않고도 아무런 문제가 없었던 이유는 자바에서 기본적으로 제공하는
이름없는 패키지(unnamed package)때문이다. 소스파일에 자신이 속할 패키지를 지정하지 않은 클래스는 자동적으로 이름없는패키지에 속하게 된다
*/



package package0;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
