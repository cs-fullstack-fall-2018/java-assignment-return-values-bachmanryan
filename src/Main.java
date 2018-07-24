public class Main {

    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 5;

        System.out.println("The largest number is:" + sumNum(number1, number2));
    }

    public static int sumNum( int n1, int n2){
        if (n2 > n1){
            return n2;
        }
        else{
            return n1;
        }
    }
}
