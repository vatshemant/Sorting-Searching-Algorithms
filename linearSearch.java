import java.util.Scanner;
 
class LinearSearch 
{
  public static void main(String args[])
  {
    int c, size, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    size = in.nextInt(); 
    array = new int[size];
 
    System.out.println("Enter " + size + " integers");
 
    for (c = 0; c < size; c++)
      array[c] = in.nextInt();
 
    System.out.println("Enter value to find");
    search = in.nextInt();
 
    for (c = 0; c < size; c++)
    {
      if (array[c] == search)     
      {
         System.out.println(search + " is present at location " + (c + 1) + ".");
          break;
      }
   }
   if (c == size)  
      System.out.println(search + " isn't present in array.");
  }
}