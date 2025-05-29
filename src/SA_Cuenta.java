import java.util.Scanner;

public class SA_Cuenta {

    public float saldo;
    public int numeroDepositos = 0;
    public int numeroRetiros = 0;
    public float tasa;
    public float depo;
    public float ret;
    public int transac;

    public void SA_Cuenta(float saldo, float tasa){// constructor
        this.saldo = saldo;
        this.tasa = tasa;
    }

    public float Cuenta(float saldo, float tasa){


        System.out.println("Escriba su saldo actual");

       // Scanner saldo = scanner.nextline();

        System.out.println("Escriba su tasa");

        // Scanner tasa = scanner.nextline();


        return 0;
    }

   // System.out.print("\nIngrese el saldo");
   // Scanner scanner = saldo;

    void depositar(){

        saldo = saldo + depo;

        numeroDepositos++;
    }
    void retirar(){

        saldo = saldo - ret;
        numeroRetiros++;

        /*
        if (ret > saldo){
            return saldo = saldo;
        }else {
            saldo = saldo - ret;
        }
   */

    }

}
/*
class SA_CuentaAhorros extends SA_Cuenta{

    public boolean activa = false ;

    void imprimir(){

        transac = numeroRetiros + numeroDepositos;

        System.out.println("El saldo es de" + saldo +"."+ "\nSu tasa es de" + tasa+"."+"\nHan habido" + transac + "transacciones");


    }
}

 */