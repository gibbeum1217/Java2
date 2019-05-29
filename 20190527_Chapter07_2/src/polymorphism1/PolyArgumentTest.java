/*���������� �������� Ư¡�� �� �޼����� �Ű��������� ����ȴ�
 * �Ʒ��� ����Product, Tv, Computer, Audio, Buyer Ŭ������ ���ǵǾ� �ִٰ� ��������.
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
 * ProductŬ������ Tv, Audio, ComputerŬ������ �����̸�
 * BuyerŬ������ ��ǰ�� �����ϴ� ����� Ŭ������ ǥ���� ���̴�
 *  BuyerŬ������ ������ �����ϴ� ����� �޼��带 �߰��غ���
 *  ������ ����� �ʿ��ϹǷ� �Ű������� ������ ��ǰ�� �Ѱܹ޾ƾ� �Ѵ�
 *  Tv�� ��� �ֵ��� �Ű������� TvŸ������ �Ͽ���
 *  
 *  void buy(Tv t){
 *    money = money - t.price; //Buyer�� ���������� ��ǰ�� ������ ����
 *    
 *    bonusPoint = bonusPoint+t.bonusPoint; // Buyer�� ���ʽ������� ��ǰ�� ���ʽ������� ���Ѵ�
 * }
 * 
 * buy(Tv t)�� ��ǰ�� �����ϸ� ��ǰ�� ������ ����� ���� ������ ��ǰ�� ������ ����, ���ʽ������� �߰��ϴ� �۾��� �ϵ��� �ۼ��Ǿ���
 * �׷��� buy(Tv t)�δ� Tv�ۿ� ��� ���� ������ �Ʒ��� ���� �ٸ� ��ǰ�鵵 ������ �� �ִ� �޼��尡 �߰��� �ʿ��ϴ�
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
 *  �̷��� �Ǹ� ��ǰ�� ������ �þ ������ BuyerŬ�������� ���ο� buy�޼��带 �߰��� �־�� �� ���̴�
 *    �׷��� �޼����� �Ű������� �������� �����ϸ� �Ʒ��� ���� �ϳ��� �޼���� ������ ó���� �� �ִ�
 *    
 *       void buy(Product p){
 *         money = money - p.price;
 *         bonusPoint = bonusPoint + p.bonusPoint;
 *       }
 *       
 *       �Ű������� ProductŸ���� ����������� ����, �ڸ޼����� �Ű������� ProductŬ������ �ڼ�Ÿ���� ���������� ������̳� �Ű������� �޾Ƶ��� �� �ִٴ� ���̴�.
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
		bonusPoint = (int)(price/10.0); //���ʽ� ������ ��ǰ������ 10% 
	}
}


class Tv extends Product{
	
	Tv(){
		super(100);
		
	}
	
	public String toString() {return "Tv";}
	//ObjectŬ������ toString()�� �������̵��Ѵ�    int toStrng():�츮�� ������ �޼���. 
}

class Computer extends Product{
	Computer() {super(200);}
	
	public String toString() {return "Computer";}
	
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) { //��(Buyer)�� buy(Product p)�޼��带 �̿��ؼ� Tv�� Computer�� �����ϰ� ���� �ܰ�� ���ʽ� ������ ����ϴ� �����̴�.
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money-=p.price; //���� ������ ������ ��ǰ�� ������ ����
		bonusPoint += p.bonusPoint; //��ǰ�� ���ʽ� ������ �߰��Ѵ�
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
}

public class PolyArgumentTest {

	public static void main(String[] args) {

		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("���� ���� ����" + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ� ������" + b.bonusPoint + "���Դϴ�.");
		
		
	}

}
