public class Funcion {
    public static void main(String[] args) {
        int gatos = 2;
        int perros = 23;

        int jirafas = 2;
        int coyotes = 23;

        sumar(gatos, perros);
        sumar(jirafas, coyotes);
    }
    
    public static void sumar(int numero1, int numero2) {
        numero1 += numero2;
        System.out.println(numero1);
    }
}
