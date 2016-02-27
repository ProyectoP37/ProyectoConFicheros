package projecto2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Entrenador {

    private String nombre;
    ArrayList<Pokemon> mochila = new ArrayList();
    /*Contructor
     se genera aleatoriamente un pokemon con la variable casos dentro del constructor
     */

    public Entrenador(String nombre) {
        int casos = (int) (Math.random() * 10);
        switch (casos) {
            case 0:
                mochila.add(new Pikachu());
                break;
            case 1:
                mochila.add(new Charmander());
                break;
            case 2:
                mochila.add(new Bulbasur());
                break;
            case 3:
                mochila.add(new Squirtle());
                break;
            case 4:
                mochila.add(new Drowzee());
                break;
            case 5:
                mochila.add(new Ekans());
                break;
            case 6:
                mochila.add(new Machop());
                break;
            case 7:
                mochila.add(new Onix());
                break;
            case 8:
                mochila.add(new Sandshrew());
                break;
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    /*En este metodo podremos elegir entre los pokemons que tengamos en la mochila
     si el numero introducido no se encuetra en la mochila retornara null.
     */

    public Pokemon elegirPokemon(int pos) {
        if (pos < mochila.size()) {
            return mochila.get(pos);
        } else {
            return null;
        }
    }

    public boolean capturarPokemon(Pokemon enemigo) {
        boolean capturado = false;
        if (enemigo.getHp() == 0) {
            int res = Integer.parseInt(JOptionPane.showInputDialog("Quieres hacere con " + enemigo.getNombrePoke() + "\n"
                    + "1.Si\n2.No"));
            switch (res) {
                case 1:
                    mochila.add(enemigo);
                    capturado = true;
                    System.out.println("¡¡¡Has conseguido un nuevo Pokemon!!!");
                    break;
                case 2:
                    return false;

            }
        }
        return false;
    }

    public void mostrarMochila() {
        System.out.println("Tienes: " + mochila.size() + " Pokemon");
        for (int i = 0; i < mochila.size(); i++) {
            System.out.println("Nº: " + i + " Pokemon: " + mochila.get(i).toString());
        }
    }

}

