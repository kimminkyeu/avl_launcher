package simulator;

public class Coordinates
{
  public Coordinates(int p_longitude, int p_latitude, int p_height)
  {
    mLongitude = p_longitude;
    mLatitude = p_latitude;
    mHeight = p_height;
  }

  public int getLongitude()
  {
    return mLongitude;
  }

  public int getLatitude()
  {
    return mLatitude;
  }

  public int getHeight()
  {
    return mHeight;
  }

  private int mLongitude;
  private int mLatitude;
  private int mHeight;

}
