
package atividadetriangulo;

public class ValidaTriangulo {
    public static boolean validar(int a, int b, int c){
        if (!((a + b)>c && (a+c)>b && (c+b)>a)){
            return false;
            
        }
        return true;
    }
}
