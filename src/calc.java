public class calc {

    static void calcswitch(double numA, int numB, char operation) {
    double result = 0;
    switch(operation){
        case '+':
            result = numA + numB;
        break;
        case '-':
            result = numA - numB;
        break;
        case '*':
            result = numA * numB;
        break;
        case '/':
            result = numA / numB;
        break;
        default:
            System.out.println("Oops, it's unknown operation");
    }
        System.out.println("Result of operation" + operation + "is=" + result);
    }

    public static void main(String[] args) {
    calcswitch(7,8, '+');
    calcswitch(7,8, '-');
    calcswitch(7,8, '*');
    calcswitch(7,8, '/');
    calcswitch(7,8, '=');
    }
}
