import java.util.Scanner;

public class SetBits {

    static int setBits(int A, int B){
        int X= ~(1<<(A-1));
        int Y = ~(1<<(B-1));
        int result= X & Y;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();
        int B = sc.nextInt();
        System.out.println(setBits(A, B));
    }
}
