package PizzaBillGenerator;


public class Pizza {
	private int price;
	private boolean veg;
	private int addExtraCheesePrice=100;
	private int addExtraToppingPrice=150;
	private int backPackPrice=20;
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded =false;
	private boolean isExtraToppingAdded=false;
	private boolean isOptedForTakeAway=false;
	
	
	
	
	public Pizza(Boolean veg) {
	this.veg=veg;
	
	if(this.veg) {
		this.price=300;
	}
	else {
		this.price=400;
	}
	basePizzaPrice=this.price;
}
	
	public void addExtraCheese() {
		isExtraCheeseAdded=true;
//		System.out.println("Extra cheese added");
		this.price+=addExtraCheesePrice;
	}
	
	public void addExtraTopping() {
		isExtraToppingAdded=true;
		
//		System.out.println("Extra Topping added ");
		this.price+=addExtraToppingPrice;
	}
	public void takeAway() {
		isOptedForTakeAway=true;
//		System.out.println("Take Away opted");
		this.price+=backPackPrice;
	}
	
	public void getBill() {
//		System.out.println(this.price);
		String bill="";
		System.out.println("Pizza : " + basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill+="Extra cheese added:"+ addExtraCheesePrice +"\n";
			
		}
		if(isExtraToppingAdded) {
			bill+="Extra Toppings added:"+ addExtraToppingPrice +"\n";
		}
		if(isOptedForTakeAway) {
			bill+="Take Away added:"+ backPackPrice +"\n";
			
		
		}
		
		bill+="Bill :" +this.price+"\n";
		System.out.println(bill);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//public void getPizzaPrice() {
//	System.out.println(this.price);
//	
//	}
//https://youtu.be/m-_ytU_B4so?si=aG18k2cxRSKB8ZUY

