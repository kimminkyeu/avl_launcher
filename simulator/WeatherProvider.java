package simulator;

// singleton
public class WeatherProvider
{

  public static WeatherProvider GetInstance()
  {
    return mInstance;
  }

  private WeatherProvider() {};

  // get Current Weather by my own algorithm
  public String getCurrentWeather(Coordinates p_coordinates)
  {
    // 3차원 좌표계 정보를 이용해서 4개의 날씨중 하나를 골라야 한다.
    // 그냥 랜덤 돌려서 하나의 해시값을 가져오고, 그 범위안에 있는 경우 특정 날씨를 반환하도록 하자.
    // 그리고 싱글톤이기 때문에, 이 인스턴스의 생명 주기가 simulation loop안에 들어 있어야 한다.
  }

  // data members
  private static WeatherProvider mInstance = new WeatherProvider();
  private String[] mWeather;
}
