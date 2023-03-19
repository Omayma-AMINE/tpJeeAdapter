package peripherique;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("ecran")
public class EcranVGA implements IVGA {
    @Override
    public void print(String message) {
        System.out.println("écran bien connectée sur le port VGA");
        System.out.println(message);
    }
}
