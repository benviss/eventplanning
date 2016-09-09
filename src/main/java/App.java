import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("****** We Do All The Work ******\n");
    System.out.println("Welcome to our Event Planning Service!\n");
    System.out.println("Would you like to have a party? Y or N\n");
    String userAnswer = console.readLine().toLowerCase();
    Character userAnswerCharacter = userAnswer.charAt(0);
    while(userAnswerCharacter != 'y'){
      System.out.println("Wrong Answer, try again");
      userAnswer = console.readLine().toLowerCase();
      userAnswerCharacter = userAnswer.charAt(0);
    }
    startEventPlanner();
  }


  public static void startEventPlanner() {
      System.out.println("Simply select your options and we will provide you a total cost report!\n");
      System.out.println("___________________________________________________________________\n");
      Event newEvent = takeUserInputs();
      printCosts(newEvent);
    }

  public static Event takeUserInputs() {
    Console console = System.console();
    System.out.println("How many people will be attending this party?");
    Integer userGuests = Integer.parseInt(console.readLine());
    System.out.println("Which venue would you like to be at?\n");
    System.out.println("Choose between Patio, Ballroom, or Castle");
    String userVenue = console.readLine();
    System.out.println("Would you like us to provide alcohol? Y or N");
    String userAlcoholAnswerString = console.readLine();
    Character userAlcoholAnswer = userAlcoholAnswerString.charAt(0);
    boolean userAlcohol = false;
    if (userAlcoholAnswer == 'y') {
      userAlcohol = true;
    }
    System.out.println("Would you like one of these amazing bands to play at your event? Enter N if you would prefer a silent event.\n");
    System.out.println("Enter 1 for The Raging Alcoholics, 2 for Never Stoppers, or 3 for The Slow Jazz/Metal/Classical Trio of Cool Music");
    String userBand = "";
    Integer userBandChoice = Integer.parseInt(console.readLine());
    if (userBandChoice == 1) {
      userBand = "The Raging Alcoholics";
      System.out.println("You choose The Raging Alcoholics");
    } else if (userBandChoice == 2){
      userBand = "Never Stoppers";
      System.out.println("You choose Never Stoppers");
    }else if (userBandChoice == 3){
      userBand = "The Slow Jazz/Metal/Classical Trio of Cool Music";
      System.out.println("You choose The Slow Jazz/Metal/Classical Trio of Cool Music");
    }
    System.out.println("What food selection would you like us to provide? Enter N if you and your guests don't eat.\n");
    System.out.println("Enter 1 for Snacks, 2 for Sandwhiches, or 3 for the Full Spread");
    String userFood = "";
    Integer userFoodChoice = Integer.parseInt(console.readLine());
    if (userFoodChoice == 1) {
      userFood = "Snacks";
      System.out.println("You choose snacks");
    } else if (userFoodChoice == 2){
      userFood = "Sandwhiches";
      System.out.println("You choose sandwhiches");
    }else if (userFoodChoice == 3){
      userFood = "The Full Spread";
      System.out.println("You choose the full spread");
    } else {
      System.out.println("You chose nothing");
    }
    System.out.println("How long will the event be lasting? Enter time in minutes.");
    Integer userDuration = Integer.parseInt(console.readLine());
    Event newEvent = new Event(userGuests, userVenue, userAlcohol, userBand, userFood, userDuration);
    return newEvent;
  }
  public static void printCosts(Event _event) {
    System.out.println("Your final cost will be $" + _event.tallyEventCost() + ":\n" +
    "Your cost for Guests was $" + _event.tallyGuestCost() + "\n" +
    "Your cost for the Venue was $" + _event.tallyVenueCost() + "\n" +
    "Your cost for Alcohol was $" + _event.tallyAlcoholCost() + "\n" +
    "Your cost for the Band was $" + _event.tallyBandCost() + "\n" +
    "Your cost for Food was $" + _event.tallyFoodCost() + "\n" +
    "Your cost for the Duration was $" + _event.tallyDurationCost() + "\n" +
    "___________________________________________________________________"

    );
  }


}
