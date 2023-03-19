package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uniteCentrale.IUC;
import uniteCentrale.UCImpl;

public class application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("peripherique","uniteCentrale");
        IUC uc = context.getBean(IUC.class);
        uc.readData();
        uc.printData("Mon afficheur marche parfaitement");
    }
}
