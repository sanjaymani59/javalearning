package PizzaBillGenerator;

// package Pizza_pack_01;

public class DulexPizza extends Pizza{
	public DulexPizza(boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraTopping();
		
	}
	
	@Override
	public void addExtraCheese() {}
	
	@Override
	public void addExtraTopping() {}
}
	



