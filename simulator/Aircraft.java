package simulator;

public class Aircraft
{
  protected Aircraft(long p_id, String p_name, Coordinates p_coordinates)
  {
    mId = p_id;
    mName = p_name;
    mCoordinates = p_coordinates;
  }

  protected long mId;
  protected String mName;
  protected Coordinates mCoordinates;
}
