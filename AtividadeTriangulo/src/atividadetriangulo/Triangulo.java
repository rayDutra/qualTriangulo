package atividadetriangulo;
public class Triangulo {
    public int a;
    public int b;
    public int c;
    
    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String tipoTriangulo(int a, int b, int c){
        String tipo;
        if (a == b && b == c){
            tipo = "O triângulo é equilátero.";
            return tipo;
        }
        else if (a == b || b == c || c == a){
            tipo = "O triângulo é isósceles.";
            return tipo;
        }
        else {
            tipo = "O triângulo é escaleno.";
            return tipo;
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}
