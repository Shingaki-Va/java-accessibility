package ar.com.ada.online.second.javaaccessibility.acces.modifiers;

public class Person {

    public String name;
    public String lastName;
    public Integer age;

    public void showAttributesValues(){
        System.out.println("name = " + this.name);
        System.out.println("lastName = " + this.lastName);
        System.out.println("age = " + this.age);
    }




}
