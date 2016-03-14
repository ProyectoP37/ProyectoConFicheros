
package Ficheros;
import com.mario.Ficheros;
import javax.swing.JOptionPane;
/**
 *
 * @author mario
 */
public class Ler {

    public static void main(String args[]) {
        Ficheros fich = new Ficheros();
        int res = Integer.parseInt(JOptionPane.showInputDialog("Que Pokemon quiere ver?\n1.Charmander\n2.Bulbasur\n3.Drowzee\n4.Ekans\n5.Gastly\n6.Machop\n7.Onix\n8.Pikachu\n9.Squirtle\n10.Sandshrew"));
        switch (res) {
            case 1:
                fich.lerFich("Charmander.txt");
                break;
            case 2:
                fich.lerFich("Bulbasur.txt");
                break;
            case 3:
                fich.lerFich("Drowzee.txt");
                break;
            case 4:
                fich.lerFich("Ekans.txt");
                break;
            case 5:
                fich.lerFich("Gastly.txt");
                break;
            case 6:
                fich.lerFich("Machop.txt");
                break;
            case 7:
                fich.lerFich("Onix.txt");
                break;
            case 8:
                fich.lerFich("Pikachu.txt");
                break;
            case 9:
                fich.lerFich("Squirtle.txt");
                break;
            case 10:
                fich.lerFich("Sandshrew.txt");
                break;

        }
        while (res < 11);

    }
}
