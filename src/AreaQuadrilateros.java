public class AreaQuadrilateros {
    public static void area (double lado) {
        System.out.println("Área do quadrado: "+lado*lado);
    }
    
    public static void area (double base, double altura) {
        System.out.println("Área do retângulo: "+base*altura);
    }

    public static void area (double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio: "+((baseMaior+baseMenor)*altura)/2);
    }
}