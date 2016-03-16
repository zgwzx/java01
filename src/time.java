/**
 * Created by zgw25 on 2016/3/8.
 */
import java.util.Scanner;
public class time {
    public static void main(String[] args){
        System.out.print("please input the seconds:");
        Scanner input = new Scanner(System.in);
        int totalseconds = input.nextInt();
        int currentsecond = totalseconds % 60;
        int totalminute = totalseconds /60;
        int currentminute = totalminute % 60;
        int totalhour = totalminute /60;
        int currenthour = totalhour %24;
        System.out.print("the totalseconds of" + totalseconds+"is equal "+currenthour+":"
        +currentminute+":"+ currentsecond);
    }
}
