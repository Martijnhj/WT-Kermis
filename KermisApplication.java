import java.util.Scanner;
import java.text.DecimalFormat;

public class KermisApplication {
	
	static final Attraction[] kermisAttractions = {new BumperCars(), new Spin(), new MirrorPalace(), new HauntedMansion(), new Hawaii(), new LadderClimbing()};
	static Scanner reader = new Scanner(System.in);
	static Kermis kermis = new Kermis();

	
	public static void main(String[] args) {
		new KermisApplication().cashRegisterInterface();
	}
	
	void cashRegisterInterface() {
		//add some random function that checks if inspecteur is there. Thread looping every 10 seconds, once set to active in the inspecteur class it pauses for a moment.
		//might need to use volitile options.
		while (true) {
			System.out.println("What attraction options would you want to see? Enter the corrisponding number.\n" +
					"1. Bumper Cars\n" +
					"2. Spin\n" +
					"3. Mirror Palace\n" +
					"4. Haunted Mansion\n" +
					"5. Hawaii\n" +
					"6. Ladder Climbing");

			int input = 0;
			while (true) {
				input = integerInput();
				if (input > 6 || input < 1) {
					System.out.println("Enter a valid number");
				} else {
					break;
				}
			}
			attractionOptions(kermisAttractions[input - 1], input);
		}
		
	}
	
	void attractionOptions(Attraction attraction, int index){
		System.out.println("What options do you want to use?:\n" +
							"ticket: to buy a ticket\n" +
							"omzet: to check the revenue of a specific attraction\n" +
							"times ridden: to check how many times tickets have been bought\n" +
							"back: to return to the attraction selection screen.");
		while (true) {
			System.out.print("Enter your selected option: ");
			String input = reader.nextLine().toLowerCase();
			switch(input) {
				case "ticket":
					attraction.ride();
					kermis.deposit(index, attraction.getPrice());
					break;
				case "omzet":
					System.out.println("Omzet van " + attraction.getClass().getName() + ": " + String.format("%.2f", kermis.getBankSaldo(index)));
					break;
				case "tickets bought":
					System.out.println(attraction.getTimesRidden());
					break;
			}
			if(input.equals("back")) {
				break;
			}



		}
		//amount of times visited question
		//checkup options
		//ride
		//sell ticket etc
	}

	
	int integerInput() {
		int input = 0;
		while (true) {
            try {
				System.out.print("Enter your choice: ");
                input = Integer.parseInt(reader.next());
				break;
            }catch(NumberFormatException e){
                System.out.println("Enter a valid number");
            }
        }
		return input;
	}
}
