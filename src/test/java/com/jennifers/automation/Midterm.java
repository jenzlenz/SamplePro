package com.jennifers.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.*;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Midterm {

        //Question 1
        public static void main(String args[]) {

                System.out.println("Please enter a string.");
                Scanner sc = new Scanner(System.in);
                String input = sc.next();
                reverseEverything(input);
        }

        public static void reverseEverything(String s) {
                System.out.print("The reverse of what you entered is: ");
                StringBuilder stringValue = new StringBuilder();
                // append a string into StringBuilder s
                stringValue.append(s);
                // reverse StringBuilder input1
                stringValue = stringValue.reverse();
                // print reversed String
                for (int i = 0; i < stringValue.length(); i++)
                        System.out.print(stringValue.charAt(i));
        }
}

        //Question 2
//      Since the html given is not a real webpage, not sure how to execute this code, but this is my algorithm

        //create an array list of the page items with className equal to title ng-binding
//                List<WebElement> listOfLinks = getDriver().findElements(By.className("title ng-binding"));

        //print the 3rd and 5th items in the list, these are referenced by the 2 and 4 index positions
//                System.out.println("Third item in the list of links is: " + listOfLinks.food.name(2));
//                System.out.println("Third item in the list of links is: " + listOfLinks.food.name(4));

        //iterate through each food item in the list and put it into a hashmap
//                int key = 0; //initialize the key for the hash
//                for (WebElement element : listOfLinks) {
//                        HashMap<int, String> food = new HashMap();
//                        food.put(key, food.name);
//                        key = key + 1;
//                        break;
//                }

//       //navigate through the HashMap and print each item
//                for (HashMap.Entry<int, String> entry : food.entrySet()) {
//                        System.out.println("Key = " + entry.getKey() + ": Value = " + entry.getValue());
//                }
//        }
//}
