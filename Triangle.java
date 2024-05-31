import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.print("Enter the number n: ");
        int n = input.nextInt();
        int rule = (2 * n) - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < rule; j++) {
                System.out.print("*");
            }
            rule-=2;
            System.out.println();
        System.out.println();
    }
 }
}
