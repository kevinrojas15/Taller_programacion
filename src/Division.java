import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dividiendo, divisor, cociente, residuo;

        System.out.println("Ingresa dividiendo - Divisor");

        dividiendo = sc.nextInt();
        divisor = sc.nextInt();

        if(divisor == 0){
            System.out.println("¡No se puede dividir entre cero!");
        }else{
            cociente = dividiendo/divisor;
            residuo = dividiendo % divisor;

            if (residuo == 0){
                System.out.println("Division exacta.\nCociente: "+cociente);
            }else {
                System.out.println("Division inexacta.\nCociente: "+cociente+".\nResiduo: "+residuo);
            }
        }
    }
}

