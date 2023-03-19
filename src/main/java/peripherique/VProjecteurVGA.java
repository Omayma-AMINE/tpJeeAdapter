package peripherique;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("vp")
public class VProjecteurVGA implements IVGA {
    @Override
    public void print(String message) {
        System.out.println("Video Projecteur bien connecté sur le port VGA");
        System.out.println(message);
    }
}
