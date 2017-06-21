import java.util.Scanner;

public  class Prompter {
  
  public void showLine(){
    System.out.println("-------------------");
  }
  
  public void showTitle(){
    System.out.println("Welcome to the Guessing Game!");
  }
  
  public String promptForItemInput(){
    System.out.println("ADMINISTRATOR SETUP");
    showLine();
    Scanner scanner = new Scanner(System.in);
    System.out.print("What type of item should go in that jar:  ");
    String itemInput = scanner.nextLine();
    return itemInput;
  }

  public int promptForNumberInput(String itemName){
    Scanner scanner = new Scanner(System.in);
    showLine();
    System.out.printf("What is the maximum amount of %s that should go in the jar:  ", itemName);
    int numberInput = scanner.nextInt();
    return numberInput;
  }
  
  public int promptForGameInput(String itemName, int maxItems){
    Scanner scanner = new Scanner(System.in);
    showLine();
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d: ", itemName, maxItems);
    int numberInput = scanner.nextInt();
    return numberInput;
  }
 
}