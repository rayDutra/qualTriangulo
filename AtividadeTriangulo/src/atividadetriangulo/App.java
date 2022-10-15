package atividadetriangulo;
import java.util.Scanner;

public class App {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Quais as medidas do triângulo?");
        int a = ler();
        int b = ler();
        int c = ler();
        
        Triangulo t = new Triangulo(a, b, c);
        
        if (ValidaTriangulo.validar(a, b, c)){
            System.out.println(t.tipoTriangulo(a, b, c));
        }
        else {
        System.out.println("As medidas não conferem com um triângulo");
        }
    }
    public static int ler(){
        int a = s.nextInt();
        return a;
    }
}
