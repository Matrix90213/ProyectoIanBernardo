import java.util.Scanner;
public class Account_main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op,num1;
        float newbalance;
        double balance;
        Account_logic dueño = new Account_logic(
                "Carlos",
                456215878,
                15.02,
                "Ahorrar dinero",
                "abono",
                2000.00);
        do {
            System.out.println("¿Que desea hacer en su cuenta?");
            System.out.println("1)Saldo");
            System.out.println("2)Retirar");
            System.out.println("3)Depositar");
            System.out.println("4)Salir");
            op = entrada.nextInt();
            if (op == 1) {
                System.out.println("Su saldo actual es:"+   dueño.getBalance());
            }else if (op == 2) {
                System.out.println("Ingrese la cantidad");
                num1 = entrada.nextInt();
                System.out.println("Usted hizo un retiro");
                newbalance = (float) dueño.getBalance() - num1;
                dueño.setBalance(newbalance);
            } else if (op == 3) {
                System.out.println("Ingrese la cantidad");
                num1 = entrada.nextInt();
                System.out.println("Usted hizo un abono");
                newbalance = (float) dueño.getBalance() + num1;
                dueño.setBalance(newbalance);
            } else {
                System.out.println("Adios");
            }
        } while(op>=1 && op<=3);
        dueño.toString();

    }
}
