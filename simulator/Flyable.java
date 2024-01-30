package simulator;

// abstract = 객체 생성 불가.
public abstract class Flyable
{
  private WeatherTower mWeatherTower;

  public abstract void updateConditions();
  public void registerTower(WeatherTower p_tower)
  {
    mWeatherTower = p_tower;
  }
}
