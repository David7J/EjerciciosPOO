import java.util.Scanner;

public class App {
    public static void main(String [] args){

        Scanner lector = new Scanner(System.in);

        System.out.println("********************************************************");
        CuentaBancaria banco = new CuentaBancaria();


        System.out.println("Digite su numero de cuenta: ");
        int numCuenta = lector.nextInt();
        banco.modificarNumCuenta(numCuenta);

        while(numCuenta < 0){
        System.out.println("No se permiten valores negativos");
        System.out.println("Digite su numero de cuenta: ");
        numCuenta = lector.nextInt();
        banco.modificarNumCuenta(numCuenta);
        }
        

        System.out.println("Digite su saldo: ");
        int saldo = lector.nextInt();
        banco.modificarSaldo(saldo);

        while(saldo < 0){
        System.out.println("No se permiten valores negativos");
        System.out.println("Digite su saldo: ");
        saldo = lector.nextInt();
        banco.modificarNumCuenta(saldo);
        }

        System.out.println("Digite su nombre: ");
        String clientNom = lector.next();
        banco.modificarClientNom(clientNom);


        System.out.println("Digite su email: ");
        String email = lector.next();
        banco.modificarEmail(email);


        System.out.println("Digite su numero de telefono: ");
        int numTel = lector.nextInt();
        banco.modificarNumTel(numTel);

        while(numTel < 0){
        System.out.println("No se permiten valores negativos");
        System.out.println("Digite su numero de telefono: ");
        numTel = lector.nextInt();
        banco.modificarNumTel(numTel);
        }

        System.out.println("Que transaccion desea realizar:");
        System.out.println("1) Depositar fondos.");
        System.out.println("2) Retirar fondos.");

        int opc = lector.nextInt();
        switch (opc) {
            case 1:
            System.out.println("Cuanto quiere depositar: ");
            double depositar = lector.nextDouble();
            banco.Depositar(depositar);

            while(depositar < 0){
            System.out.println("No se permiten valores negativos.");
            System.out.println("Cuanto quiere depositar: ");
            depositar = lector.nextDouble();
            banco.Depositar(depositar);  
            }
            double calculo = saldo + depositar;
            System.out.println("Usted ha depositado: " + depositar);
            System.out.println("Tiene: " + calculo + " en su cuenta");
                
            break;

            case 2:
            System.out.println("Cuanto desea retirar: ");
            double retirar = lector.nextDouble();
            banco.Retirar(retirar);

            while(retirar > saldo ){
            System.out.println("No puede retirar mas de lo que hay en su cuenta");
            }

            while(retirar < 0){
            System.out.println("No se permiten valores negativos.");
            System.out.println("Cuanto desea retirar: ");
            retirar = lector.nextDouble();
            banco.Retirar(retirar);  
            }

            double restar = saldo - retirar;
            System.out.println("Usted ha depositado: " + retirar);
            System.out.println("Tiene: " + restar + " en su cuenta");


            break;
        


            default:
            System.out.println("Opcion invalida.");
                break;
        }



        lector.close();
    }

}
