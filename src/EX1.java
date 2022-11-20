import java.text.NumberFormat;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" To solve quadratic equations, you have to enter the variables : ");
        System.out.println(" a= ");
        double a = scanner.nextDouble();
        System.out.println(" b= ");
        double b = scanner.nextDouble();
        System.out.println(" c= ");
        double c = scanner.nextDouble();
        if ((Math.pow(b, 2) - (4 * a * c)) < 0 || a == 0) {
            System.out.println(" There is no solution ");
        } else {
            double x1 = ((-b) + (Math.sqrt((b*b) - (4 * a * c)) / (2 * a)));
            double x2 = ((-b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a)));
            if (x1 != x2) {
                System.out.println( "there is two solutions \n  x1= "+x1 +"\t x2="+x2);

            }else {
                System.out.println(" there is one solution \n x1= "+x1 );


            }
        }


    }
    }

