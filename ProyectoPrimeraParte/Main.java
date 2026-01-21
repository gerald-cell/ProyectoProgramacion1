
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 5) {

            String menu = " MENU \n"
                        + "1. Incluir un partido\n"
                        + "2. Incluir un candidato\n"
                        + "3. Incluir un votante\n"
                        + "4. Registrar un voto\n"
                        + "5. Salir\n"
                        + "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"En construcción");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null,"En construcción");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,"En construcción");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,"En construcción");
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,"Saliendo del sistema");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }
    }
}

