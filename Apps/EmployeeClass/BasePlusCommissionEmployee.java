/*_______________________________*/
//! Base Plus Commission Employee Class!!

package EmployeeClass;

public class BasePlusCommissionEmployee extends CommissionEmployee{
  private double Base;

  public BasePlusCommissionEmployee() {
  }

  public BasePlusCommissionEmployee(String name, String address, int sSN, GENDER gender, double grossSales,
      double commissionRate, double base) {
    super(name, address, sSN, gender, grossSales, commissionRate);
    Base = base;
  }

  public double getBase() {
    return Base;
  }

  public void setBase(double base) {
    Base = base;
  }

  @Override
  public double Earning() {
    // TODO Auto-generated method stub
    return super.Earning()+Base;
  }

  @Override
  public void DisplayAllDetails() {
    // TODO Auto-generated method stub
    System.out.println("<<<<<<<<<<<<<<<Base Plus Commission Employee Details>>>>>>>>>>>>>>>");
    super.CEToString();
    System.out.println(toString());
    DisplayEarning();
  }

  @Override
  public void DisplayEarning() {
    // TODO Auto-generated method stub
    System.out.println("Earning = "+Earning());;
  }

  @Override
  public String toString() {
    return "BasePlusCommissionEmployee [Base=" + Base + "]";
  }

}

/*_______________________________*/