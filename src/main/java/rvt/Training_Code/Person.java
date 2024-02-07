package rvt.Training_Code;

public class Person {
    private String nameSurename;
    private String address;

    public Person(String nameSurename, String address) {
        this.nameSurename = nameSurename;
        this.address = address;
    }

    public String toString() {
        return nameSurename + "<br>: :  " + address + "<br>";
    }

}
