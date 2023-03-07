import java.util.Scanner;
public class Account_logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op,num1=0;
        float newbalance=0;
        double balance;
        Account_main dueño = new Account_main(

                "Carlos",
                456215878,
                15.02,
                "Ahorrar dinero",
                "abono",
                2000.00);
            System.out.println("¿Que accion desea realizar en su cuenta?");
            System.out.println("1)Deposito o 2)Retirar");
            op =sc.nextInt();
            System.out.println("Dame la cantidad");
            num1 =sc.nextInt();
            if(op==1)
            {
                System.out.println("Usted hara un deposito");
                newbalance = (float) dueño.getBalance()+num1;
                dueño.setBalance(newbalance);
            } else{
                System.out.println("Usted hara un retiro");
                newbalance = (float) dueño.getBalance()-num1;
                dueño.setBalance(newbalance);

            }

            dueño.toString();
    }
}
