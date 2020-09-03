package ar.com.ada.online.second.javaaccessibility.acces.modifiers;

public class User {
    protected String nickName;
    protected String password;

    protected void ShowAttributesValues(){
        System.out.println("nickName = " + this.nickName);
        System.out.println("password = " + this.password);

    }


}
