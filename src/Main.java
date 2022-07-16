public class Main {
    public static void main(String[] args) {
        double areaQuadrado = Quadrilatero.area(3);
        double areaRetangulo = Quadrilatero.area(4d,6d);
        double areaTrapezio = Quadrilatero.area(5,7,2);
        double areaLosango = Quadrilatero.area(4f,6f);

        System.out.println("Área do quadrado é: "+areaQuadrado);
        System.out.println("Área do retangulo é: "+areaRetangulo);
        System.out.println("Área do trapezio é: "+areaTrapezio);
        System.out.println("Área do losango é: "+areaLosango);
    }
}
