/*참조변수의 다형적인 특징은 ★ 메서드의 매개변수에도 적용된다
 * 아래와 같이Product, Tv, Computer, Audio, Buyer 클래스가 정의되어 있다고 가정하자.
 * class Product{
 *    int price;
 *    int bonusPoint;
 *}
 *class Tv extends Product{}
 *class Computer extends Product{}
 *
 *class Buyer{
 *   int money = 1000;
 *   int bonusPoint = 0;
 *   
 * }
 * 
 * Product클래스는 Tv, Audio, Computer클래스의 조상이며
 * Buyer클래스는 제품을 구입하는 사람을 클래스로 표현한 것이다
 *  Buyer클래스에 물건을 구입하는 기능의 메서드를 추가해보자
 *  구입할 대상이 필요하므로 매개변수로 구입할 제품을 넘겨받아야 한다
 *  Tv를 살수 있도록 매개변수를 Tv타입으로 하였다
 *  
 *  void buy(Tv t){
 *    money = money - t.price; //Buyer가 가진돈에서 제품의 가격을 뺀다
 *    
 *    bonusPoint = bonusPoint+t.bonusPoint; // Buyer의 보너스점수에 제품의 보너스점수를 더한다
 * }
 * 
 * buy(Tv t)는 제품을 구입하면 제품을 구입한 사람이 가진 돈에서 제품의 가격을 빼고, 보너스점수는 추가하는 작업을 하도록 작성되었다
 * 그런데 buy(Tv t)로는 Tv밖에 살수 없기 떄문에 아래와 같이 다른 제품들도 구입할 수 있는 메서드가 추가로 필요하다
 * 
 * void buy(Computer c){
 *     money = money -c.price;
 *     bonusPoint = bonusPoint + c.bonusPoint;
 *     
 * }
 * 
 * void buy(Audio a){
 *     money = money - a.price;
 *     bonusPoint = bonusPoint + a.bonusPoint;
 *  }
 *  이렇게 되면 제품의 종류가 늘어날 때마다 Buyer클래스에는 새로운 buy메서드를 추가해 주어야 할 것이다
 *    그러나 메서드의 매개변수에 다형성을 적용하면 아래와 같이 하나의 메서드로 간단히 처리할 수 있다
 *    
 *       void buy(Product p){
 *         money = money - p.price;
 *         bonusPoint = bonusPoint + p.bonusPoint;
 *       }
 *       
 *       매개변수가 Product타입의 참조변수라는 것은, ★메서드의 매개변수로 Product클래스의 자손타입의 참조변수면 어느것이나 매개변수로 받아들일 수 있다는 뜻이다.
 *       
 *         
 *     
 */

package polymorphism1;

import polymorphism3.Buyer;
import polymorphism3.Computer;
import polymorphism3.Product;
import polymorphism3.Tv;

class Product{
	
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10% 
	}
}


class Tv extends Product{
	
	Tv(){
		super(100);
		
	}
	
	public String toString() {return "Tv";}
	//Object클래스의 toString()을 오버라이딩한다    int toStrng():우리가 정의한 메서드. 
}

class Computer extends Product{
	Computer() {super(200);}
	
	public String toString() {return "Computer";}
	
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) { //고객(Buyer)이 buy(Product p)메서드를 이용해서 Tv와 Computer를 구입하고 고객의 잔고와 보너스 점수를 출력하는 예제이다.
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money-=p.price; //가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가한다
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
}

public class PolyArgumentTest {

	public static void main(String[] args) {

		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은" + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는" + b.bonusPoint + "점입니다.");
		
		
	}

}
