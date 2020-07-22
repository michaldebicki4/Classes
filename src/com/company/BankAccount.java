package com.company;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(12345, 0 , "Default Name", "Defaultemail", 123456);
        System.out.println("Empty Constructor called");
        //można wrzucić jakiś podstawowy konstruktor do konstruktora tak żeby przy wpisaniu zainicjalizowaniu
        //samego BankAccount dostać jakieś przykłady
    }
    public BankAccount( int accountNumber, double balance, String customerName, String email, int phoneNumber ){
        this.accountNumber= accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        //można użyć tego zamiast setterów, może być overloaded, nie ustawiamy pojedyńczo czegoś tylko przy
        //inicjalizacji ustawiamy wszystkie parametry
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void balanceField(){
        System.out.print("Wpisz ile chcesz zdeponować: ");
        Scanner scanner = new Scanner(System.in);
        int zdeponowanePieniadze = scanner.nextInt();
        scanner.nextLine();
        this.balance += zdeponowanePieniadze;
        System.out.println("Suma twojej kasy to: " + this.balance);
    }
    public void withdrawField(){
        System.out.print("Wpisz ile chcesz wyjac: ");
        Scanner scanner = new Scanner(System.in);
        int wyjetePieniadze = scanner.nextInt();
        scanner.nextLine();
        if(wyjetePieniadze >= this.balance){
            System.out.println("Nie masz tyle kasy");
        }
        else {
            this.balance -= wyjetePieniadze;
            System.out.println("Suma twojej kasy to: " + this.balance);
        }
    }
}
