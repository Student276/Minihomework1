/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomework1;

import java.util.Scanner;

/**
 *
 * @author hrfre
 */
public class Minihomework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("LET`S CREATE A USERNAME FOR YOU !! ");
        
        Scanner myKB = new Scanner(System.in);
    String name = "";//user name
    String secondName;
    int age;
    
        System.out.println("Please enter your First and Second name.");//for the user tapy theirs names
    
        name = myKB.nextLine();
    
        System.out.println("Please enter your age.");
    
        age = myKB.nextInt();
        
         int space = name.indexOf(" "); // to located the "space" betwen then
     
        try {

            String myPiece = name.substring(0, 1); // this is for the firts character to be Capital
            myPiece = myPiece.toUpperCase(); //first character to be Capital
            secondName = name.substring(space + 1,space +2); // to take the first character of second name 
            secondName = secondName.toUpperCase();//second character to be Capital

            if (name.matches("[A-Za-z ]+")) {  // if it is a letter show up for the user next line 
                System.out.println("The Mr " + myPiece + secondName + " blogger." + age);
            } else { // if it is not a letter show up the next line 

                System.out.println("Dont type a number");
            }

        } catch (Exception e) {
            System.out.println("error");
        }

    }
        
    }
    

