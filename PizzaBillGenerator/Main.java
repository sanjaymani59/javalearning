package PizzaBillGenerator;

public class Main {
	public static void main(String[] args) {
//		Pizza basePizza = new Pizza(true);
//		basePizza.getPizzaPrice();
//		basePizza.addExtraCheese();
//		basePizza.addExtraTopping();
//		basePizza.takeAway();
//		basePizza.getBill();
		
		DulexPizza dp=new DulexPizza(true);
		dp.takeAway();
		dp.getBill();
		
	}

}

