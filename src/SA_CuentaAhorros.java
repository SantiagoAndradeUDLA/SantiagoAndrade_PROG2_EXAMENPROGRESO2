class SA_CuentaAhorros extends SA_Cuenta{

    public boolean activa = false ;

    @Override
    void depositar() {
        super.depositar();
    }

    @Override
    void retirar() {
        super.retirar();
    }

    void imprimir(){

        transac = numeroRetiros + numeroDepositos;

        System.out.println("El saldo es de" + saldo +"."+ "\nSu tasa es de" + tasa+"."+"\nHan habido" + transac + "transacciones");


    }

}