/*���� ������ ��ü�� �迭�� �ٷ��
 * 
 * ����Ÿ���� ���������� �ڼ�Ÿ���� ��ü�� �����ϴ� ���� �����ϹǷ�,
 * ProductŬ������ Tv, Computer, AudioŬ������ ������ �� ������ ���� �� �� �ִ� ���� �̹� �����
 * 
 * Product p1 = new Tv();
 * Product p2 = new Computer();
 * Product p3 = new Audio();
 * 
 *���� �ڵ带 ProductŸ���� �������� �迭�� ó���ϸ� �Ʒ��� ����
 *
 *Product p [] = new Product[3];
 *p[0] = new Tv();
 *p[1] = new Computer();
 *p[2] = new Audio();
 *
 *��ó�� ����Ÿ���� �������� �迭�� ����ϸ�, ������ ������ ���� ���� �ٸ� ������ ��ü�� �迭�� ��� �ٷ�� �ִ�
 *�̷��� Ư¡�� �̿��ؼ� ���� 7-21�� BuyerŬ������ ������ ��ǰ�� �����ϱ� ���� Product�迭�� �߰��غ����� ����
 *
 *  class Buyer{
 *  
 *  	int money = 1000;
 *  	int bonusPoint = 0;
 *  	Product[] item = new Product[10]; //������ ��ǰ�� �����ϱ� ���� �迭
 *  	int i = 0; 
 *  
 *  	void buy(Product p){
 *  		if(money<p.price){
 *  			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
 *  			return;
 *   		}
 *   		money -=p.price; //���� ������ ��ǰ������ ����
 *   		bounusPoint += p.bonusPoint; //��ǰ�� ���ʽ�����Ʈ�� ���Ѵ�
 *   		item[i++] = p; //��ǰ�� Product[] item�� �����Ѵ�
 *   		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
 *   
 *   ������ ��ǰ�� ��� ���� BuyerŬ������ Product�迭�� item�� �߰����־���
 *   �׸��� buy�޼��忡 item[i++] =p; ������ �߰������ν� ������ �����ϸ�, �迭 item�� ����ǵ��� �ߴ�
 *   �̷��� �����ν�, ��� ��ǰŬ������ ������ ProductŬ���� Ÿ���� �迭�� ��������ν� ������ ��ǰ�� �ϳ��� �迭�� �����ϰ� �ٷ� �� �ְ� �ȴ�.
 *   
 * 
 */


package polymorphism3;

class Product{
	int price;
	int bonusPoint; //��ǰ���Ž� �����ϴ� ���ʽ�����
	
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
	Audio() {super(50);} //����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�
	public String toString() {return "Audio";} 
			
	}

class Buyer{
	
	int money = 1000; //�����ݾ�
	int bonusPoint = 0;
	
	Product[] item = new Product[10];
	int i = 0; // Product�迭�� ���� ī����
	
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	void summary() { //������ ��ǰ�� ���� ������ ����ؼ� �����ش�
		int sum = 0;
		String itemList =""; //������ ��ǰ���
		
		for(int i=0; i<item.length; i++) { //�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����
			if(item[i]==null) 
				
				break;
			sum+= item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ��" + itemList + "�Դϴ�.");
		
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
