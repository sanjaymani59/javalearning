// package busRev;
import java.util.Scanner;
import java.util.ArrayList;



public class BusDemo {
	public static void main (String[] args) {
//		Bus buses[] =new Bus[50];
		
		ArrayList<Bus> buses= new ArrayList<Bus>();
		ArrayList<Booking> bookings =new ArrayList<Booking>();
		
		
		buses.add(new Bus(1,true,1));
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
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("sorry. Bus is full . Try another bus or date. ");
		}
		}
	}

}

//https://youtu.be/EYc5oBLYi24?si=yZbkag-xUQv-g6Jp
