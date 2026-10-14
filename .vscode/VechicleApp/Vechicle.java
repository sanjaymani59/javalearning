package VechicalApp;

public class Vechicle {
	
	private String name ;
	private int currentSpeed;
	private int currentDirection;
	
	public Vechicle(String name) {
		super();
		this.name = name;
		this.currentSpeed = 0;
		this.currentDirection = 0;
	}
	
	public void stear(int direction ) {
		this.currentDirection+=direction;
		System.out.println("Stear method called : Stearing at "+ currentDirection+"Degree");
		
	}
		
	public void move(int speed,int direction) {
		currentSpeed=speed;
		currentDirection =direction;
		System.out.println("Move method called : Moveing at" + currentSpeed+"in Direction " + currentDirection);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	public void stop() {
		this.currentSpeed=0;
		System.out.println("Vechical is stoped");
	}

}

