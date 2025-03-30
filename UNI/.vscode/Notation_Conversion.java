import java.util.*;

public class Notation_Conversion {

    static boolean isOperator(char c) {
        return (!(c >= 'a' && c <= 'z') &&
                !(c >= '0' && c <= '9') &&
                !(c >= 'A' && c <= 'Z'));
    }

    static int getPriority(char C) {
        if (C == '-' || C == '+')
            return 1;
        else if (C == '*' || C == '/')
            return 2;
        else if (C == '^')
            return 3;
        return 0;
    }

    static String infixToPrefix(String infix) {

        Stack<Character> operators = new Stack<Character>();

        Stack<String> operands = new Stack<String>();

        for (int i = 0; i < infix.length(); i++) {

            if (infix.charAt(i) == '(') {
                operators.push(infix.charAt(i));
            }

            else if (infix.charAt(i) == ')') {
                while (!operators.empty() &&
                        operators.peek() != '(') {

                    String op1 = operands.peek();
                    operands.pop();

                    String op2 = operands.peek();
                    operands.pop();

                    char op = operators.peek();
                    operators.pop();

                    String tmp = op + op2 + op1;
                    operands.push(tmp);
                }

                operators.pop();
            }

            else if (!isOperator(infix.charAt(i))) {
                operands.push(infix.charAt(i) + "");
            }

            else {
                while (!operators.empty() &&
                        getPriority(infix.charAt(i)) <= getPriority(operators.peek())) {

                    String op1 = operands.peek();
                    operands.pop();

                    String op2 = operands.peek();
                    operands.pop();

                    char op = operators.peek();
                    operators.pop();

                    String tmp = op + op2 + op1;
                    operands.push(tmp);
                }

                operators.push(infix.charAt(i));
            }
        }

        while (!operators.empty()) {
            String op1 = operands.peek();
            operands.pop();

            String op2 = operands.peek();
            operands.pop();

            char op = operators.peek();
            operators.pop();

            String tmp = op + op2 + op1;
            operands.push(tmp);
        }

        return operands.peek();
    }

    public static void main(String args[]) {
        String s = "(A-B/C)*(A/K-L)";
        System.out.println(infixToPrefix(s));
    }
}
