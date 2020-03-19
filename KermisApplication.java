import java.util.Scanner;

public class KermisApplication {
	
	static final Attraction[] kermisAttractions = {new BumperCars(), new Spin(), new MirrorPalace(), new HauntedMansion(), new Hawaii(), new LadderClimbing()};
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		new KermisApplication().cashRegisterInterface();
	}
	
	void cashRegisterInterface() {
		System.out.println("What attraction options would you want to see? Enter the corrisponding number.\n" +
							"1. Bumper Cars\n" +
							"2. Spin\n" +
							"3. Mirror Palace\n" +
							"4. Haunted Mansion\n" +
							"5. Hawaii\n" +
							"6. Ladder Climbing");
							
		int input = 0;
		while (true){
			input = integerInput();
			if (input>6 || input<1) {
				System.out.println("Enter a valid number");
			} else {
				break;
			}
		}
		attractionOptions(kermisAttractions[input-1]);
		
	}
	
	void attractionOptions(Attraction attraction){
		System.out.println("Welcome in the options of....");
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
