package peripherique;

public class TvHDMI implements IHDMI {
    @Override
    public void print(byte[] data) {
        System.out.println("connection TV établie via un adaptateur VGA - HDMI  sur les ports : ");
        for (byte d:data) {
            System.out.print(d+"\t\t");
        }
        System.out.println("\n");
    }
}
