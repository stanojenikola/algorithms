import java.util.Scanner;

public class AirLineReservationSystem {
	public static void main(String[] args) {
		makeReservation();
	}
private static boolean []  array = new boolean[71];
private static boolean [] reservatedPlace = new boolean[71];
	static Scanner scanner = new Scanner(System.in);


static void makeReservation() {
	System.out.println("if you want economy class add 1, else add 2 for business");
	
	int section  = scanner.nextInt();
	if(section==1) {
		economyClass();
	} else {
		businessClass();	
	}
}

static void economyClass()	{
	for(int i=1; i <=10;i++) {
		if(array[i] == false) {
			System.out.println("Free seat: " + i);
		} else {
			System.out.println("resevet" + i);
		}
	}
	System.out.println();
	System.out.println("Which place you want in economy, you can choose from 1 to 10");
	int num = scanner.nextInt();
	
	if(num > 0 && num<= 10) {
		for(int i = 1; i < array.length; i++) {
			if(i == num) {
				if(array[i] == false) {
					reservatedPlace[i] = true;
					System.out.println("Successful reservation!");
				} else {
					System.out.println("Seat is reservated");

				}
			}
 		}
	} else {
		System.out.println("Sorry you add the wrong number");
		makeReservation();
	}	
}

static void businessClass()	{
	for(int i=11; i <=70; i++) {
		if(array[i] == false) {
			System.out.println("Free seat: " + i);
		}else
			System.out.println("reserved" + i);
	}
	System.out.println();
	System.out.println("Which place you want in business, you can choose from 10 to 70");
	int num = scanner.nextInt();
	
	
	if(num > 10 && num<=70) {
		for(int i = 1; i < array.length; i++) {
			if(i == num) {
				if(array[i] == false) {
					array[i] = true;
					System.out.println("Successful reservation!");
				} else {
					System.out.println("Seat is reservated");

				}
			}
 		}
	} else {
		System.out.println("Sorry you add the wrong number, reservate again");
		makeReservation();
	}	
}

}
