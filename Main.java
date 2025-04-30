public class Main {
    public static void main(String[] args) {
        // Número hasta donde sumar
        int n = 10;
        
        // Variable para almacenar la suma
        int suma = 0;
        
        // Bucle para sumar los primeros n números
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        
        // Mostrar el resultado
        System.out.println("La suma de los primeros " + n + " números es: " + suma);
    }
}