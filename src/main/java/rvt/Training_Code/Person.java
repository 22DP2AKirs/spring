package rvt.Training_Code;

import java.util.ArrayList;

public class Person {
    private String nameSurename;
    private String address;

    public Person(String nameSurename, String address) {
        this.nameSurename = nameSurename;
        this.address = address;
    }

    public String toString() {
        return nameSurename + "<br>: :  " + address + "<br>:  :  ";
    }

    public static String printPersons(ArrayList<Person> list) {
      String personas = "";

      for (int i = 0; i < list.size(); i++) {
        personas += list.get(i).toString();
      }
      
      return personas;
    }

}
