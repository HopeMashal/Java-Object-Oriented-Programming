/*_______________________________*/
//! Commission Employee Class!!

package EmployeeClass;

public class CommissionEmployee extends Employee implements Displayable {
  private double GrossSales, CommissionRate;

  public CommissionEmployee() {
  }

  public CommissionEmployee(String name, String address, int sSN, GENDER gender, double grossSales,
      double commissionRate) {
    super(name, address, sSN, gender);
    GrossSales = grossSales;
    CommissionRate = commissionRate;
  }

  public double getGrossSales() {
    return GrossSales;
  }

  public void setGrossSales(double grossSales) {
    GrossSales = grossSales;
  }

  public double getCommissionRate() {
    return CommissionRate;
  }

  public void setCommissionRate(double commissionRate) {
    CommissionRate = commissionRate;
  }

  @Override
  public double Earning() {
    // TODO Auto-generated method stub
    return GrossSales*CommissionRate;
  }

  @Override
  public void DisplayAllDetails() {
    // TODO Auto-generated method stub
    System.out.println("<<<<<<<<<<<<<<<Commission Employee Details>>>>>>>>>>>>>>>");
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
    return "CommissionEmployee [CommissionRate=" + CommissionRate + ", GrossSales=" + GrossSales + "]";
  }

  public void CEToString(){
    System.out.println(super.toString());
    System.out.println("CommissionEmployee [CommissionRate=" + CommissionRate + ", GrossSales=" + GrossSales + "]");
  }
}

/*_______________________________*/