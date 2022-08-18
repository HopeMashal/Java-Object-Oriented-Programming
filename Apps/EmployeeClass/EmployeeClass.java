/*_______________________________*/
//! Employee Class App!!

package EmployeeClass;

public class EmployeeClass {
  public static void main(String[] args) {
    Department d1 = new Department(1,"Information Systems");

    SalariedEmployee se = new SalariedEmployee("Hope", "Jerusalem", 3, GENDER.Female, 3000, 200, 100);

    d1.addEmployee(se);

    HourlyEmployee he = new HourlyEmployee("Yuki", "Yafo", 2, GENDER.Female, 100, 20);

    d1.addEmployee(he);

    CommissionEmployee ce = new CommissionEmployee("Amal", "Hebron", 1, GENDER.Female, 120, 10);

    d1.addEmployee(ce);

    BasePlusCommissionEmployee be = new BasePlusCommissionEmployee("Akira", "Tokyo", 2, GENDER.Male, 230, 10, 5);

    d1.addEmployee(be);

    System.out.println(d1.getEmployeeCount());

    d1.PrintBasicData();
    d1.PrintAllDetails();

  }
}

/*_______________________________*/