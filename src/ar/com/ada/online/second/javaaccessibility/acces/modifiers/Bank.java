package ar.com.ada.online.second.javaaccessibility.acces.modifiers;

public class Bank {
    private Integer numberAccount;
    private String amount;

    private void showAttributeValues() {
        System.out.println("numberAccount = " + numberAccount);
        System.out.println("amount = " + amount);


    }
}

