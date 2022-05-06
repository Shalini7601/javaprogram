public class SwappingEx 
{
  public static void main(String[] args) 
  {
    int temp;
    int x = 100;
    int y = 200;
     
    //Swapping in steps
    temp = x;
    x = y;
    y = temp;
     
    //Verify swapped values
    System.out.println("x = " + x + " and y = " + y);
  }
}