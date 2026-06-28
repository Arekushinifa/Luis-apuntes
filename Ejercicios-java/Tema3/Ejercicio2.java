public class Ejercicio2 {
    public static void main(String[] args) {
        
        int n = 6, factorial = 1, temporal = n;
        
        while (temporal > 0) {
            factorial *= n;
            temporal--;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
    
}