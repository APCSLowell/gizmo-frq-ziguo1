import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    /* to be implemented in part (a) */
    int cnt = 0;
    for (Gizmo g : purchases) {
      if (g.getMaker().equals(maker) && g.isElectronic()) {
        cnt++;
      }
    }
    return cnt;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    /* to be implemented in part (b) */
    if (purchases.size() < 2) return false;
    Gizmo previous = null;
    for (Gizmo g : purchases) {
      if (previous != null) {
        if (previous.equals(g)) return true;
      }
      previous = g;
    }
    return false;
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
