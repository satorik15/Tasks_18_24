package Work22;
import java.util.Scanner;
import java.util.Stack;
public class RPN_calculator
{
    private static Stack<Integer> stack = new Stack<Integer>();
    private static Scanner input = new Scanner(System.in);

    private static void takeInput() {
        String numOrOperand = " ";
        while (!numOrOperand.equals("x")) {
            System.out.println("Enter next input: ");
            numOrOperand = input.next();
            try {
                int intNumOrOperand = Integer.valueOf(numOrOperand);
                stack.push(intNumOrOperand);
            } catch (Exception e) {
                if (numOrOperand.equals("*")) {
                    stack.push(stack.pop() * stack.pop());

                } else if (numOrOperand.equals("/")) {
                    stack.push((int) stack.pop() / stack.pop());

                } else if (numOrOperand.equals("+")) {
                    stack.push(stack.pop() + stack.pop());

                } else if (numOrOperand.equals("-")) {
                    stack.push(-(stack.pop() - stack.pop()));

                } else if (numOrOperand.equals("=")) {
                    System.out.println(stack.pop());

                }
            }

        }
    }



    public static void main(String[] args)
    {
        try {
            takeInput();
        } catch (Exception e) {
            System.out.println("Oops, that doesn't work... ");
        }

    }
}
