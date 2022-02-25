package com.company.View;
import lib.ConsoleIO;

import java.io.IOException;

public class menu  {


    public void mainMenuOptions()throws IOException {
        String[] baseMenu = new String[4];

        baseMenu[0] = "0. Exit";
        baseMenu[1] = "1. Specialized Menu";
        baseMenu[2] = "2. Basic ";
        baseMenu[3] = "3. Factors";

     ConsoleIO.promptForMenuSelection(baseMenu,true);

    }
    public void specializedMenuOptions()throws IOException {
        String[] spMen = new String[6];

        spMen[0] = "0. Back to Main";
        spMen[1] = "1. Arithmetic Sequence";
        spMen[2] = "2. Combination";
        spMen[3] = "3. Geometric Sequences";
        spMen[4] = "4. Permutations";
        spMen[5] = "5. Probability";

        ConsoleIO.promptForMenuSelection(spMen,true);
    }
    public void basicMenuOptions()throws IOException {
        String[] basicMenu = new String[7];

        basicMenu[0] = "0. Back to Main";
        //return
        basicMenu[1] = "1. Addition";
        //add addition method
        basicMenu[2] = "2. Subtraction";
        // add subtraction method
        basicMenu[3] = "3. Multiplication";
        //add multiplication method
        basicMenu[4] = "4. Division";
        //add division method
        basicMenu[5] = "5. Modulus";
        //add modulus method
        basicMenu[6] = "6. run PEMDAS";
        //run method line

        ConsoleIO.promptForMenuSelection(basicMenu,true);
    }


    public void factorMenuOptions()throws IOException {
        String[] fMenu = new String[3];

        fMenu[0] = "0. Return to Main Menu";
        fMenu[1] = "1. Find Factors ";
        fMenu[2] = "2. Find Multiples";


        ConsoleIO.promptForMenuSelection(fMenu,true);
    }


}

//Menu
//
//1. Specialized Menu - Probability// Geometric/ Permutations/ Combination
//
//2. Basic Math - Addition/Subtraction/Multiplication/division/modules
//
//3. Find out factor ! and factors and Multiples
//
