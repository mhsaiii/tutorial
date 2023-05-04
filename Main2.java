public class Main2 { public static void main(String[] args) {

    char operator;
    Double number1, result;


    Scanner input = new Scanner(System.in);


    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    Double number2 = input.nextDouble();

    result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;


    result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;


    result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;



    result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

};

    input.close();
            }
            }