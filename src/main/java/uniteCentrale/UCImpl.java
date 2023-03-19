package uniteCentrale;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import peripherique.ClavierUSB;
import peripherique.IUSB;
import peripherique.IVGA;
@Component
public class UCImpl implements IUC {
    private IUSB usb ;
    private IVGA vga ;

    public UCImpl(@Qualifier(value = "souris") IUSB usb,@Qualifier(value ="adapter") IVGA vga) {
        this.usb = usb;
        this.vga = vga;
    }

    @Override
    public int readData() {
        return usb.read();
    }

    @Override
    public void printData(String data) {
        vga.print(data);
    }
}
