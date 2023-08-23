import java.util.Scanner;

public class Ordenar {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] numeros = new int [4];
        int acum;

        System.out.println("Ingrese cuatro números:");

        for (int i = 0; i<=3 ; i++){
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i<=3 ; i++){

            for (int j = 0 ; j<=3 ; j++){

                if(numeros[i] > numeros[j]){
                    acum = numeros[j];
                    numeros[j]=numeros[i];
                    numeros[i]=acum;
                }
            }
        }

        System.out.println("Los numeros de mayor a menor son: ");

        for (int i = 0;i<=3;i++){
            System.out.println(numeros[i]);
        }
    }
}
