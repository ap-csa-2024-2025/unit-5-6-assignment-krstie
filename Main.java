import java.util.Scanner;

public class Main
{
  public statis void ceateDog(Dog inDog, String breed, String name, String color, double weight)
  {
    inDog.setBreed(breed);
    inDog.setName(name);
    inDog.setColor(color);
    inDog.setWeight(weight);
  }

  public static void main(String[] args)
  {
    Dog d = new Dog("weiner dog", "schnitsel", "red", 1000);
    myDog = new Dog();


    Dog dog1 = new Dog();
    Dog dog2 = new Dog("terrier", "max", "white", 5)
    Dog dog3 = new Dog("morkie", "mochi", "brown", 10)





    // Uncomment and complete the code below to test your Plane class
    /* Delete this line to uncomment code **************************
    Scanner sc = new Scanner(System.in);
    String input = "";
    Plane p = new Plane(1000);
    while (!input.equals("q"))
    {
      System.out.println(p);
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      // System.out.println(print the plane's location and uncomment);
      input = sc.nextLine();

      if (input.equals("u"))
      {
        // move the plane upwards
      }
      else if (input.equals("d"))
      {
        // move the plane downwards
      }
      else if (input.equals("n"))
      {
        System.out.println("Starting location for a new plane?");
        int location = sc.nextInt();
        sc.nextLine(); // consume the ENTER key left behind by nextInt()
        p = // create new plane at proper location
      }
      else if (input.equals("q"))
      {
        System.out.println("Thank you for using plane simulator");
      }
      else
      {
        System.out.println("Invalid input");
      }
    }
    Delete this line to uncomment ************************************/
  }
}
