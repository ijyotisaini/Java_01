import java.util.Scanner;

public class reciprocal {
    public static void main(String[] args) {
        int n;
        double sum= 0.0;

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        for(int i=1; i<=n; i++){
            sum= sum+(1.0/i);
        }

        System.out.println("Sum of reciprocal:"+sum);
        sc.close();
    }
}
