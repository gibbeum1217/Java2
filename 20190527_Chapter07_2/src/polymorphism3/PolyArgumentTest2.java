/*여러 종류의 객체를 배열로 다루기
 * 
 * 조상타입의 참조변수로 자손타입의 객체를 참조하는 것이 가능하므로,
 * Product클래스가 Tv, Computer, Audio클래스의 조상일 때 다음과 같이 할 수 있는 것을 이미 배웠다
 * 
 * Product p1 = new Tv();
 * Product p2 = new Computer();
 * Product p3 = new Audio();
 * 
 *위의 코드를 Product타입의 참조변수 배열로 처리하면 아래와 같다
 *
 *Product p [] = new Product[3];
 *p[0] = new Tv();
 *p[1] = new Computer();
 *p[2] = new Audio();
 *
 *이처럼 조상타입의 참조변수 배열을 사용하면, 공통의 조상을 가진 서로 다른 종류의 객체를 배열로 묶어서 다룰수 있다
 *이러한 특징을 이용해서 예제 7-21의 Buyer클래스에 구입한 제품을 저장하기 위한 Product배열을 추가해보도록 하자
 *
 *  class Buyer{
 *  
 *  	int money = 1000;
 *  	int bonusPoint = 0;
 *  	Product[] item = new Product[10]; //구입한 제품을 저장하기 위한 배열
 *  	int i = 0; 
 *  
 *  	void buy(Product p){
 *  		if(money<p.price){
 *  			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
 *  			return;
 *   		}
 *   		money -=p.price; //가진 돈에서 제품가격을 뺀다
 *   		bounusPoint += p.bonusPoint; //제품의 보너스포인트를 더한다
 *   		item[i++] = p; //제품을 Product[] item에 저장한다
 *   		System.out.println(p+"을/를 구입하셨습니다.");
 *   
 *   구입한 제품을 담기 위해 Buyer클래스인 Product배열인 item을 추가해주었다
 *   그리고 buy메서드에 item[i++] =p; 문장을 추가함으로써 물건을 구입하면, 배열 item에 저장되도록 했다
 *   이렇게 함으로써, 모든 제품클래스의 조상인 Product클래스 타입의 배열을 사용함으로써 구입한 제품을 하나의 배열로 간단하게 다룰 수 있게 된다.
 *   
 * 
 */


package polymorphism3;

class Product{
	int price;
	int bonusPoint; //제품구매시 제공하는 보너스점수
	
	Product(int price){
		this.price =price;
		bonusPoint=(int)(price/10.0);
	}
	Product(){}
}

class Tv extends Product{
	
	Tv() {super(100);}
	
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer() {super(200); }
	public String toString() { return "Computer";}
	
	}

class Audio extends Product{
	Audio() {super(50);} //조상클래스의 생성자 Product(int price)를 호출한다
	public String toString() {return "Audio";} 
			
	}

class Buyer{
	
	int money = 1000; //소유금액
	int bonusPoint = 0;
	
	Product[] item = new Product[10];
	int i = 0; // Product배열에 사용될 카운터
	
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	void summary() { //구입한 물품에 대한 정보를 요약해서 보여준다
		int sum = 0;
		String itemList =""; //구입한 물품목록
		
		for(int i=0; i<item.length; i++) { //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다
			if(item[i]==null) 
				
				break;
			sum+= item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은" + itemList + "입니다.");
		
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
			Buyer b = new Buyer();
			
			b.buy(new Tv());
			b.buy(new Computer());
			b.buy(new Audio());
			b.summary();
	
			
	}

}
