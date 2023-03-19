package peripherique;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service("clavier")
public class ClavierUSB implements IUSB {
    @Override
    public int read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Veuillez choisir le port usb : " );
        int a = scanner.nextInt();
        System.out.println("Clavier connecté sur le port USB "+a);
        return a;
    }
}
