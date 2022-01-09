package IntermediatePractice.StringFunctions;

import java.util.Scanner;

public class StringFunctionsApp {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter a text : ");
        String inputText = keyboardInput.nextLine();

        if (inputText.equals("Paris")) {
            System.out.println("Paris was typed in.");
        } else {
            System.out.println("the text typed in is : " + inputText);
        }
        System.out.println("---------------------------------------");;

        if (inputText.equalsIgnoreCase("Paris")) {
            System.out.println("Paris was typed in.");
        } else {
            System.out.println("the text typed in is : " + inputText);
        }
        if (inputText.contains("Par"))
            System.out.println("The input text contains Par");


        if (inputText.isEmpty())
            System.out.println("The input text is empty");

        System.out.println("The input text length is : " + inputText.length());
        System.out.println("The input text with upper case : " + inputText.toUpperCase());
        System.out.println("The input text with lower case : " + inputText.toLowerCase());

        if (inputText.startsWith("P") || inputText.endsWith("P"))
            System.out.println("The input text starts or ends with P ");

        System.out.println("The replaced text : " + inputText.replace("N", "D" ));

    }
}
