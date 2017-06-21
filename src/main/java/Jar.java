import java.util.Random;

public class Jar {
  public static int maxItems;
  public String itemName;
  private int jarCount;
  public int randomNumber;
  
  public Jar(String itemName, int maxItems){
    this.itemName = itemName;
    this.maxItems = maxItems;
    jarCount = 0;
  }

  public void fill(){
    Random random = new Random();
    randomNumber = random.nextInt(maxItems) + 1;
    jarCount = randomNumber;
  }
}