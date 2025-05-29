
import java.util.Scanner;

public class SA_Cuenta {

    public float saldo;
    public int numeroDepositos;
    public int numeroRetiros;
    public float tasa;
    public float depo;
    public float ret;
    public int transac;

    public void Cuenta(float saldo, float tasa){
        this.saldo = saldo;
        this.tasa = tasa;


    }

   // System.out.print("\nIngrese el saldo");
   // Scanner scanner = saldo;

    void depositar(){

        saldo = saldo + depo;

        numeroDepositos++;
        transac++;
    }
    void retirar(){

        saldo = saldo - ret;
        numeroRetiros++;
        transac++;

        /*
        if (ret > saldo){
            return saldo = saldo;
        }else {
            saldo = saldo - ret;
        }
   */

    }

}

class SA_CuentaAhorros extends SA_Cuenta{

    void imprimir(){

        System.out.println("El saldo es de ");


    }


}
