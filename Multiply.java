package com.company.Model;

import lib.ConsoleIO;

public class Multiply {
    ConsoleIO cons = new ConsoleIO();
    public void multiply() {

        int num1 = cons.promptForInt("what is your number", 0, 9999);
        int num2 = cons.promptForInt("what is your next number ", 0, 9999);

        int sum = num1 * num2;

        System.out.println("your answer is : " + sum);
    }
}
