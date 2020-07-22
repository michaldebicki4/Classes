package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*	PERSON CHECK
	    Person person = new Person();
		person.setFirstName("");   // firstName is set to empty string
		person.setLastName("");    // lastName is set to empty string
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");    // firstName is set to John
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith");    // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());
		*/
	/* VIP CHECK
	VipCustomer kontoOli = new VipCustomer();
        System.out.println(kontoOli.getName());
        VipCustomer kontoMamy = new VipCustomer("Basia", 90, "mailmama");
        System.out.println(kontoMamy.getName() + kontoMamy.getEmailAdress() + kontoMamy.getLimitCredit());
        VipCustomer kontoTaty = new VipCustomer("Adasio",90);
        System.out.println(kontoTaty.getName());
        */
        /* BANK ACCOUNT
        BankAccount kontoMichala = new BankAccount();

        while (true) {

            System.out.print("Czy chcesz oddac kase? ");
            Scanner scanner = new Scanner(System.in);
            String pytanie = scanner.next();
            if (pytanie.equals("y")) {
                kontoMichala.balanceField();
                continue;
            } else System.out.println("Nie to nie");
            System.out.print("Czy chcesz wyjac kase? ");
            String pytanie2 = scanner.next();
            if (pytanie2.equals("y")) {
                kontoMichala.withdrawField();
                continue;
            } else System.out.println("Nie to nie");
            break;
        }
        */
 /*
 wall


         Wall wall = new Wall(5,4);
         System.out.println("area= " + wall.getArea());

         wall.setHeight(-1.5);
         System.out.println("width= " + wall.getWidth());
         System.out.println("height= " + wall.getHeight());
         System.out.println("area= " + wall.getArea());

  */
/* POINT
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

*/

/* CALCULATOR + CARPET + FLOOR
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
*/



        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }


}


