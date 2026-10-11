package busRev;
import java.util.Scanner;
import java.util.ArrayList;


public class BusDemo {
	public static void main (String[] args) {
//		Bus buses[] =new Bus[50];
		
		ArrayList<Bus> buses= new ArrayList<Bus>();
		ArrayList<Booking> booking =new ArrauList<Booking>();
		
		
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,false,55));
		buses.add(new Bus(3,true,35));
		
		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
		
		for(Bus b: buses) {
			b.displayBudInfo();
		}
		while(userOpt==1) {
			System.out.println("Enter 1 to 2 exit ");
			userOpt =scanner.nextInt();
			if(userOpt==1) {
				Booking booking = new Booking();
		}
	}
	}

}

//https://youtu.be/EYc5oBLYi24?si=yZbkag-xUQv-g6Jp
