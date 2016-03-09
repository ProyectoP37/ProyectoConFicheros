package projecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Projecto2 {

    public static void main(String[] args) {
       /* LerFicheiro ler= new LerFicheiro();
        ler.lerFich("Pokemon.txt");*/
		String nombre;
		int opcion;
                
		
		nombre=JOptionPane.showInputDialog("Hola soy el profesor Oak.\nBienvenido a este juego.\nEl objetivo de este juego es llegar\nal nivel 15 con algun Pokemon.\n¿Cual es tu nombre?");
		JOptionPane.showMessageDialog(null,"Hola "+ nombre+"\nAhora te entregare un Pokemon al nivel 5.\nSuerte en el el mundo Pokemon");
		
		Entrenador yo = new Entrenador(nombre);
		Batalla bat = new Batalla(yo);
		
			
			yo.mostrarMochila();
		do{	
                        opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:\n1) Empezar una batalla\n2) Salir"));
			
			
			if(opcion == 1){
				bat.comienza();
			}
			
		}while(opcion != 2);
                
	}
    }
    

