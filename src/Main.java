import javax.swing.*;
public class Main{
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Proyecto pareja");
            VentanaPrincipal ventana = new VentanaPrincipal();
            frame.setContentPane(ventana.getRootPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
