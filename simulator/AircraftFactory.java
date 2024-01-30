package simulator;

public class AircraftFactory
{
  public static AircraftFactory getInstance()
  {
    return mInstance;
  }

  public Flyable NewAircraft(String p_type, String p_name, Coordinates p_coordinate)
  {
    //...
  }

  public void updateConditions()
  {
    //...
  }


  private static AircraftFactory mInstance = new AircraftFactory();
  private AircraftFactory() {};
}
