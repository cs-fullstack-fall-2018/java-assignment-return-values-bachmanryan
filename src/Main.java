//public class Main {
//
//    public static void main(String[] args) {
//        int number1 = 3;
//        int number2 = 5;
//
//        System.out.println("The largest number is:" + sumNum(number1, number2));
//    }
//
//    public static int sumNum( int n1, int n2){
//        if (n2 > n1){
//            return n2;
//        }
//        else{
//            return n1;
//        }
//    }
//}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        String password1, password2 = "";

        System.out.print("Enter your new password: ");
        password1 = scanInput.nextLine();

        System.out.print("Enter new password again: ");
        password2 = scanInput.nextLine();

        System.out.println("Does passwords match? " + checkPass(password1, password2));

    }

    public static String checkPass(String pass1, String pass2) {
        if (! (pass2.equals( pass1))) {
            return ("Passwords do not match");
        }

        else{
            return ("Passwords match");
        }
    }
}