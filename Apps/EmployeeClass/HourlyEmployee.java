/*_______________________________*/
//! Hourly Employee Class!!

package Apps.EmployeeClass;

public class HourlyEmployee extends Employee implements Displayable {
  private double HourRate;
  private int NoOfHours;

  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, String address, int sSN, GENDER gender, double hourRate, int noOfHours) {
    super(name, address, sSN, gender);
    HourRate = hourRate;
    NoOfHours = noOfHours;
  }

  public double getHourRate() {
    return HourRate;
  }

  public void setHourRate(double hourRate) {
    HourRate = hourRate;
  }

  public int getNoOfHours() {
    return NoOfHours;
  }

  public void setNoOfHours(int noOfHours) {
    NoOfHours = noOfHours;
  }

  @Override
  public double Earning() {
    // TODO Auto-generated method stub
    return HourRate*NoOfHours;
  }

  @Override
  public void DisplayAllDetails() {
    // TODO Auto-generated method stub
    System.out.println("<<<<<<<<<<<<<<<Hourly Employee Details>>>>>>>>>>>>>>>");
    System.out.println(super.toString());
    System.out.println(toString());
    DisplayEarning();
  }

  @Override
  public void DisplayEarning() {
    // TODO Auto-generated method stub
    System.out.println("Earning = "+Earning());
  }

  @Override
  public String toString() {
    return "HourlyEmployee [HourRate=" + HourRate + ", NoOfHours=" + NoOfHours + "]";
  }
  
}

/*_______________________________*/