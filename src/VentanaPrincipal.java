import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class VentanaPrincipal{
    private JTextField textField1;
    private JTextField textField2;
    private JPanel PanelPrincipal;
    private JButton button1;
    private JButton validarButton;
    public VentanaPrincipal(){
        $$$setupUI$$$();
        button1.addActionListener( e ->{
            String texto = textField1.getText();
            try{
                int numero = Integer.parseInt(texto);
                if (perfecto(numero)){
                    JOptionPane.showMessageDialog(null, "Es un numero perfecto");
                }
                else{
                    JOptionPane.showMessageDialog(null, "No es un numero perfecto");
                }
            }
            catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Por favor ingresa un numero valido");
            }
        });
        validarButton.addActionListener(e -> {
            String textoFecha = textField2.getText();  // formato esperado: dd/MM/yyyy
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaNacimiento = LocalDate.parse(textoFecha, formatter);
                LocalDate fechaActual = LocalDate.now();

                Period edad = Period.between(fechaNacimiento, fechaActual);

                if (edad.getYears() >= 18){
                    JOptionPane.showMessageDialog(null, "Es mayor de edad (" + edad.getYears() + " años)");
                }
                else if (edad.getYears() >= 0){
                    JOptionPane.showMessageDialog(null, "Es menor de edad (" + edad.getYears() + " años)");
                }
                else{
                    JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida");
                }
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Ingresa la fecha en formato válido: dd/MM/yyyy (por ejemplo, 15/08/2006)");
            }
        });
    }
    private boolean perfecto(int numero){
        if (numero <=  1){
            return false;
        }
        int suma = 1;
        for(int i = 2; i <= numero / 2; i++){
            if (numero % i == 0){
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