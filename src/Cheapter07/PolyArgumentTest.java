package Cheapter07;

class Product{
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price /10.0);
	}
}

class Tv2 extends Product{
	Tv2(){
		super(100);
	}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer() {super(200);}
	public String toString() {return "Computer";}
}

class Buyer{
	int money = 1000;
	int bonusPoint= 0;
	
	void buy(Product p){
		if (money < p.price){
			System.out.println("잔액이부족하여 물건을 살 수 없습니다.");
		    return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 "+p.price +"만원에 구입하셧습니다");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.buy(new Tv2());
		b.buy(new Computer());
		
		System.out.println("현제 남은 돈은"+b.money+"만원 입니다");
		System.out.println("현제 남은 보너스점수는"+b.bonusPoint*1000+"Point입니다");
	}
}
