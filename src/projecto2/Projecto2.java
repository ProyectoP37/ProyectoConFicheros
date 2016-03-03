package projecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Projecto2 {

    public static void main(String[] args) {
        
		String nombre;
		int opcion;
		
		nombre=JOptionPane.showInputDialog("Cual es tu nombre?");
		
		
		Entrenador yo = new Entrenador(nombre);
		Batalla bat = new Batalla(yo);
		
		do{			
			yo.mostrarMochila();
			
                        opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:\n1) Empezar una batalla\n2) Salir"));
			
			
			if(opcion == 1){
				bat.comienza();
			}
			
		}while(opcion != 2);
	}
    }
    

