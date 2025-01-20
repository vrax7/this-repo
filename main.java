import java.util.Scanner;

class main{
    public static void main(String[] args) {
        
        Addition addition = new Addition();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 2 Integers: ");

        System.out.println("Choose an operator [+, -, *, /]: ");
        String operator = in.nextLine();

        System.out.print("Num 1: ");
        int num1 = in.nextInt();

        System.out.print("Num 2: ");
        int num2 = in.nextInt();

        int answer;

        if (operator.equalsIgnoreCase("+")){
            answer = addition.add(num1, num2);
        }
        
    }
}