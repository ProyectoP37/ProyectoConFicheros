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
               // Pokemon pokmio = null;
		
		nombre=JOptionPane.showInputDialog("¿Cual es tu nombre?");
		JOptionPane.showMessageDialog(null,"Hola "+ nombre+"\n¿Que tal?\nSoy el profesor Oak.\nAhora te entregare un Pokemon al nivel 5.\nSuerte en el torneo");
		
		Entrenador yo = new Entrenador(nombre);
		Batalla bat = new Batalla(yo);
		
			//pokmio.setNivel(5);
			yo.mostrarMochila();
		do{	
                        opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:\n1) Empezar una batalla\n2) Salir"));
			
			
			if(opcion == 1){
				bat.comienza();
			}
			
		}while(opcion != 2);
	}
    }
    

