
import java.util.Scanner;

class Calcular{

    private double num1, num2, resultado;

    public static void main(String[] args) {
        
    }

    Calcular(int op, double n1, double n2){
        this.num1 = n1; this.num2 = n2;
        switch (op) {
            case 1: this.resultado = n1 + n2; break;
            case 2: this.resultado = n1 - n2; break;
            case 3: this.resultado = n1 * n2; break;
            case 4: this.resultado = n1 / n2; break;
            case 5: this.resultado = Math.pow(n1, n2); break;
            case 6: this.resultado = Math.sqrt(n1); break;
            case 7: this.resultado = Math.log(n1); break;
            case 8: this.resultado = Math.log1p(n1); break;
            default:
                System.out.println("La opcion ingresada no existe.\n\n");
                break;
       }
    }
    public double retornarResultado(){
        return this.resultado;
    }
}

public class calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = 'a';
        int op;
        double num1, num2, resultado;
        while(x == 'a'){
            System.out.println("Que desea realizar?");
            System.out.println("1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Potenciacion\n6.Radicacion\n7.Logaritmo Natural\n8.Logaritmo\n9.Salir");
            System.out.println("Ingrese la operacion a realizar:"); op = scanner.nextInt();
            if(op == 9){
                x = 'b';
                continue;
            }
            System.out.println("Ingrese el primer numero:"); num1 = scanner.nextDouble(); 
            System.out.println("Ingrese el segundo numero:"); num2 = scanner.nextDouble();

            Calcular obj1 = new Calcular(op, num1, num2);
            resultado = obj1.retornarResultado();
            System.out.println("El resultado de su operacion es:"+resultado);
            }
        }
    }


