package peripherique;

import org.springframework.stereotype.Service;


@Service("adapter")
public class AdapterVgaHdmi implements IVGA {

    TvHDMI tvHDMI = new TvHDMI();

    byte hdmi = 11 ;
    byte vga = 23 ;
    byte portHdmiVga [] = {hdmi,vga};
    @Override
    public void print(String message) {

        tvHDMI.print(portHdmiVga);
        System.out.println(message);
    }
}
