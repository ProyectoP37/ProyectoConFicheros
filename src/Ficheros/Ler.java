
package Ficheros;
import com.mario.Ficheros;

/**
 *
 * @author mario
 */
public class Ler {

    public static void main(String args[]) {
        
    }
        public void ficheros(int res){
            int resu=res;
        Ficheros fich = new Ficheros();
        
        switch (resu) {
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
        while (res > 11||res<1);

    }}

