package rvt.Training_Code;

public class Student extends Person {
  private int credits;
  public Student(String nameSurename, String address) {
    super(nameSurename, address);
    credits = 0;
  }

  public void study() {
    credits++;
  }

  public String credits() {
    return "Strudy credits: " + credits;
  }

  public String toString() {
    return super.toString() + credits();
  }

}
