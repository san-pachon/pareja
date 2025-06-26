import javax.swing.*;

public class VentanaPrincipal {
    private JTextField textField1;
    private JTextField textField2;
    private JPanel PanelPrincipal;
    private JButton button1;
    private JButton validarButton;

    public VentanaPrincipal() {
        $$$setupUI$$$();
        button1.addActionListener( e ->{
            String texto = textField1.getText();
            try {
                int numero = Integer.parseInt(texto);
                if (perfecto(numero)) {
                    JOptionPane.showMessageDialog(null, "Es un numero perfecto");
                } else {
                    JOptionPane.showMessageDialog(null, "No es un numero perfecto");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa un numero valido");
            }
        });
    }

    private boolean perfecto(int numero) {
        if (numero <=  1) {
            return false;
        }
        int suma = 1;
        for(int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }

    private void $$$setupUI$$$() {
    }


    public JPanel getRootPanel() {
        return PanelPrincipal;
    }

}
