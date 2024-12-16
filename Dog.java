public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;
  

  public Dog(String iBreed. String iName, Stirng iColor, double iWeight)
  {
    breed = iBreed;
    name = iName
    color = iColor
    weight = iWeight
  }

  // Make setters
  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }

  public void setWeight(double iWeight)
  {
    weight = iWeight;
    if (iWeight < 0)
    {
      weight = 0;
    }
    else
    {
      weight = iWeight;
    }
  }

  public void setName(String iName)
  {
    name = iName
  }

  public void setColor(String iColor)
  {
    color = icolor
  }

  // Make getters
  public String getBreed()
  {
    return breed;
  }

   public double getWeight()
  {
    return weight;
  }

   public String getName()
  {
    return name;
  }

   public String getcolor()
  {
    return color;
  }
}
