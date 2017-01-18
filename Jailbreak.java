import java.util.Scanner;

public class Jailbreak {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("You are in jail! You have been here a very long time. It seems like they have forgotten you. The cage has rusted through and you can probably squeeze through the bars. Of course, the only way you can go is North");
		System.out.println("What do you want to do?");
		String userInput = in.nextLine();
		System.out.println("You entered " + userInput);
		
		if(userInput == "North"){
			System.out.println("You have escaped the jail, congratulations");
			System.out.println("What do you want to do?");
			userInput = in.nextLine();
			System.out.println("You entered " + userInput);
		}
	}
}