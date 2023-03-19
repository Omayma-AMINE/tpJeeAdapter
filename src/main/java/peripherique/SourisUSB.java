package peripherique;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service("souris")
public class SourisUSB implements IUSB {
    @Override
    public int read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Veuillez choisir le port usb: " );
        int a = scanner.nextInt();
        System.out.println("souris connectée sur le port USB "+a);
        return a;
    }
}
