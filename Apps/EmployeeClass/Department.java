package EmployeeClass;

import java.util.ArrayList;

public class Department {
  int DepartmentNo;
  String DepartmentName;
  ArrayList<Employee> EmployeeList;
  
  public Department() {
  }

  public Department(int departmentNo, String departmentName) {
    DepartmentNo = departmentNo;
    DepartmentName = departmentName;
    EmployeeList = new ArrayList<Employee>();
  }

  public int getDepartmentNo() {
    return DepartmentNo;
  }

  public void setDepartmentNo(int departmentNo) {
    DepartmentNo = departmentNo;
  }

  public String getDepartmentName() {
    return DepartmentName;
  }

  public void setDepartmentName(String departmentName) {
    DepartmentName = departmentName;
  }

  public void addEmployee(Employee employee){
    EmployeeList.add(employee);
  }

  public void removeEmployee(int index){
    EmployeeList.remove(index);
  }

  public int getEmployeeCount(){
    return EmployeeList.size();
  }

  public void PrintBasicData(){
    for(int i=0;i<EmployeeList.size();i++){
      System.out.println(EmployeeList.get(i).getSSN()+" "+EmployeeList.get(i).getName()+" "+EmployeeList.get(i).getGender());
    }
  }

  public void PrintAllDetails(){
    for(int i=0;i<EmployeeList.size();i++){
      // Convert element from Employee to SalariedEmployee/HourlyEmployee/CommissionEmployee
      if (EmployeeList.get(i) instanceof SalariedEmployee){
        ((SalariedEmployee)EmployeeList.get(i)).DisplayAllDetails();
      }
      if (EmployeeList.get(i) instanceof HourlyEmployee){
        ((HourlyEmployee)EmployeeList.get(i)).DisplayAllDetails();
      }
      if (EmployeeList.get(i) instanceof CommissionEmployee){
        ((CommissionEmployee)EmployeeList.get(i)).DisplayAllDetails();
      }
    }
  }
}
