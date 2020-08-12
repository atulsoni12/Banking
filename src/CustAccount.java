import java.util.Scanner;

public class CustAccount {

    //details about transaction
    public static void main(String[] args) {
        System.out.println(" please enter 1 for deposit and 2 for withdrawal");
        Scanner sc = new Scanner(System.in);
        int tran = sc.nextInt();
        switch (tran)
        {
            case 1:
                System.out.println("deposit");
                break;
            case 2:
                System.out.println("withdrawal");
                break;
        }

    }





}
