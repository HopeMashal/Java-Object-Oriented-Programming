package ArrayListWithSorting;

public class Bottle implements Comparable<Bottle> {
  private int Capacity;

  public Bottle(int capacity) {
    Capacity = capacity;
  }

  public int getCapacity() {
    return Capacity;
  }

  public void setCapacity(int capacity) {
    Capacity = capacity;
  }

  @Override
  public String toString() {
    return "This bottle with capacity: "+this.Capacity;
  }

  @Override
  public int compareTo(Bottle o) {
    if(this.Capacity > o.Capacity) return 1;
    else if(this.Capacity < o.Capacity) return -1;
    else return 0;
  }
  
}
