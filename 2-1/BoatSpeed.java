import java.util.Scanner;

public class BoatSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Введіть відстань (S) в км: ");
float S = scanner.nextFloat();

System.out.print("Введіть швидкість човна (V) в км/год: ");
float V = scanner.nextFloat();

System.out.print("Введіть швидкість течії (U) в км/год: ");
float U = scanner.nextFloat();

        if (V <= U) {
            System.out.println("Швидкість човна повинна бути більшою за швидкість течії!");
            return;
        }
        
        Float timeDownstream = S / (V + U);
        
        Float timeUpstream = S / (V - U);
        
        Float totalTime = timeDownstream + timeUpstream;
        
        Float averageSpeed = (2 * S) / totalTime;
        
        System.out.println("Час, витрачений на подорож: " + totalTime + " годин.");
        System.out.println("Середня швидкість човна: " + averageSpeed + " км/год.");
    }
}