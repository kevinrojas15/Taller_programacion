import java.util.Scanner;

public class bisiesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int ano, op, po, pp;

        System.out.println("Ingrese el año:");
        ano = sc.nextInt();

        op = ano % 400;
        po = ano % 4;
        pp = ano % 100;

        if(pp == 0){
            if(op == 0){
                System.out.println("El año "+ano+" es bisiesto.");
            }else{
                System.out.println("El año "+ano+" no es bisiesto.");
            }
        }else{
            if(po == 0){
                System.out.println("El año "+ano+" es bisiesto.");
            }else{
                System.out.println("El año "+ano+" no es bisiesto.");
            }
        }
    }

}

