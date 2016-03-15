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
        
      int casos = Integer.parseInt(JOptionPane.showInputDialog("Elige tu pokemon preferido\n1.Squirtle\n2.Charmander\n3.Bulbasur"));
      switch (casos) {
          case 1:
                
                mochila.add(new Squirtle());//.setNivel(5));
                for (int i = 0; i < mochila.size(); i++) {
                    if("Squirtle".equals(mochila.get(i).getNombrePoke())){
                    mochila.get(i).setNivel(5);
                    mochila.get(i).setHp(5*10);
                    mochila.get(i).setAtaque(5+20);}
              }
                break;
            case 2:
                mochila.add(new Charmander());
                for (int i = 0; i < mochila.size(); i++) {
                    if("Charmander".equals(mochila.get(i).getNombrePoke())){
                    mochila.get(i).setNivel(5);
                    mochila.get(i).setHp(5*10);
                    mochila.get(i).setAtaque(5+20);}
              }
                break;
            case 3:
                mochila.add(new Bulbasur());
                for (int i = 0; i < mochila.size(); i++) {
                    if("Bulbasur".equals(mochila.get(i).getNombrePoke())){
                    mochila.get(i).setNivel(5);
                    mochila.get(i).setHp(5*10);
                    mochila.get(i).setAtaque(5+20);}
              }
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
        int res;
        do{
             res = Integer.parseInt(JOptionPane.showInputDialog("Quieres hacerte con un " + enemigo.getNombrePoke() + "\n"
                    + "1.Si\n2.No"));}while(res>2||res<1);
            switch (res) {
                case 1:
                    mochila.add(enemigo);
                    capturado = true;
                    JOptionPane.showMessageDialog(null,"¡¡¡Has conseguido un nuevo Pokemon!!!");
                    break;
                case 2:
                    return false;

            }
        
        return false;
    }

    public void mostrarMochila() {
        String acumulador="";
        JOptionPane.showMessageDialog(null,"Tienes: " + mochila.size() + " Pokemon");
        
        for (int i = 0; i < mochila.size(); i++) {
            acumulador=acumulador+"Nº: " + (i+1)+" " +mochila.get(i).toString()+"\n";
           
        } JOptionPane.showMessageDialog(null,acumulador);
    }

}

