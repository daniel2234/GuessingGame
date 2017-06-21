public class GuessingGame {
    public static void main(String[] args) {
      
      int guessInput = 0;
      int count = 0;
      
      Prompter prompter = new Prompter();
      
      String userInput = prompter.promptForItemInput();
      int numberInput = prompter.promptForNumberInput(userInput);
      
      Jar jar = new Jar(userInput, numberInput);
      
      jar.fill();
      
      prompter.showLine();
      prompter.showTitle();
      
      while (guessInput != jar.randomNumber) {
        guessInput = prompter.promptForGameInput(userInput, numberInput);
        if (guessInput > numberInput){
          System.out.printf("You must guess less than %s\n", numberInput);
        }
        
        if (guessInput > jar.randomNumber){
          System.out.println("Your guess is too high");
          count++;
        } else if (guessInput < jar.randomNumber) {
          System.out.println("Your guess is too low");
          count++;
        }
      }
      System.out.printf("You got it in %s tries\n", count);
      
    }
}
