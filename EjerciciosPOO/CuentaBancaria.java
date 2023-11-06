public class CuentaBancaria{

    private int numCuenta;
    private double saldo;
    private String clientNom;
    private String email;
    private int numTel;
    private double depositar;
    private double retirar;

    public int mostrarNumCuenta() {
        return numCuenta;
    }

    public void modificarNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
        
    }



    public double mostrarSaldo() {
        return saldo;
    }

    public void modificarSaldo(double saldo) {
        this.saldo = saldo;
    }



    public String mostrarClientNom() {
        return clientNom;
    }

    public void modificarClientNom(String clientNom) {
        this.clientNom = clientNom;
    }



    public String mostrarEmail() {
        return email;
    }

    public void modificarEmail(String email) {
        this.email = email;
    }



    public int mostrarNumTel() {
        return numTel;
    }

    public void modificarNumTel(int numTel) {
        this.numTel = numTel;
    }

    


    public void Depositar(double depositar){
        this.depositar = depositar;
    }

    public void Retirar(double retirar){
        this.retirar = retirar;
    }

}