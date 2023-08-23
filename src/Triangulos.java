import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float a, b, c, suma, suma2, suma3;

        System.out.println("Ingrese los tres lados del triangulo: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        suma = a + b;
        suma2 = b + c;
        suma3 = a + c;

        if(c>suma || a>suma2 || b>suma3 ){
            System.out.println("El triangulo es invalido");
        }
        else{
            if (a == b ){
                if(a == c){
                    System.out.println("Es un triangulo equilatero.");
                }else{
                    System.out.println("Es un triangulo isósceles.");
                }
            }
            else{
                if (a == c){
                    System.out.println("Es un triangulo isósceles.");
                }
                else{
                    if(b == c){
                        System.out.println("Es un triangulo isósceles.");
                    }
                    else{
                        System.out.println("Es un triangulo escaleno.");
                    }
                }
            }
        }
    }
}
