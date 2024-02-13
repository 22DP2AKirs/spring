package rvt.Training_Code;

public class Teacher extends Person {

  private int salary;
  public Teacher(String nameSurename, String address, int salary) {
      super(nameSurename, address);
      this.salary = salary;
  }

  public String getSalary() {
    return "salary " + salary + " euro/month<br>";
  }

  public String toString() {
    return super.toString() + getSalary();
  }

}
