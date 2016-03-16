/**
 * Created by zgw25 on 2016/3/8.
 */
import java.util.Scanner;
public class math_method {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print(num1 + "-" + num2 + "=");
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        if (result == num1 - num2) {
            System.out.print("ok ,you are right");
        } else {
            System.out.print("no,you are wrong"+"the right answer is"+(num1-num2));
        }


        }
    }
