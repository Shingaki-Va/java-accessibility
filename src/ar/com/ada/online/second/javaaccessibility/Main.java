package ar.com.ada.online.second.javaaccessibility;


import ar.com.ada.online.second.javaaccessibility.acces.modifiers.Person;
import ar.com.ada.online.second.javaaccessibility.acces.modifiers.User;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name ="Valen";
        p1.lastName="Shingaki";
        p1.age = 24;

        p1.showAttributesValues();

        User u1 = new User();




    }
}
