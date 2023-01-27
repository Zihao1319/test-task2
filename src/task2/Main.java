package task2;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console cons = System.console();
        System.out.println("Welcome.");
        boolean exit = false;

        double result = 0;

        while (!exit) {
            String input = cons.readLine(">");

            if (input.equals("exit")) {
                System.out.println("Bye bye");
                break;
            }

            String[] inputStr = input.split(" ");

            String operator = inputStr[1].trim();

            double operand1 = 0;
            double operand2 = 0;

            if (inputStr[0].equals("$last") && inputStr[2].equals("$last")) {
                operand1 = result;
                operand2 = result;

            } else if (inputStr[0].equals("$last")) {
                operand1 = result;
                operand2 = Double.parseDouble(inputStr[2]);

            } else if (inputStr[2].equals("$last")) {
                operand2 = result;
                operand1 = Double.parseDouble(inputStr[0]);
            }

            else {
                operand1 = Double.parseDouble(inputStr[0]);
                operand2 = Double.parseDouble(inputStr[2]);
            }

            if (operator.equals("+")) {
                result = operand1 + operand2;

            } else if (operator.equals("-")) {
                result = operand1 - operand2;

            } else if (operator.equals("*")) {
                result = operand1 * operand2;

            } else if (operator.equals("/")) {
                result = operand1 / operand2;
            }
            System.out.println(result);

        }

    }
}