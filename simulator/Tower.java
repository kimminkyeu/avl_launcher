package simulator;

import java.util.List;

public class Tower
{
  public Tower()
  {

  }

  public void register(Flyable p_flyable)
  {
    mObservers.add(p_flyable);
  }

  public void unregister(Flyable p_flyable)
  {
    // List에서 어떻게 해당 객체를 찾아서 지워주지? vector와 동일한건가?
    mObservers.remove(p_flyable);
  }

  // ?
  protected void conditionChanged()
  {

  }

  private List<Flyable> mObservers;
}
