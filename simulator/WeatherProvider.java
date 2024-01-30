package simulator;

// singleton
public class WeatherProvider
{

  public static WeatherProvider GetInstance()
  {
    return mInstance;
  }

  private WeatherProvider() {};

  public String getCurrentWeather(Coordinates p_coordinates)
  {
    // ...
  }

  // data members
  private static WeatherProvider mInstance = new WeatherProvider();
  private String[] mWeather;
}
