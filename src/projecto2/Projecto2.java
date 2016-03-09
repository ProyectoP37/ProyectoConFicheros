package projecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class Projecto2 {

    public static void main(String[] args) {
        LerFicheiro ler= new LerFicheiro();
        
		String nombre;
		int opcion;
               // String res="";
		
		nombre=JOptionPane.showInputDialog("Hola soy el profesor Oak.\nBienvenido a este juego.\nEl objetivo de este juego es llegar\nal nivel 15 con algun Pokemon.\n¿Cual es tu nombre?");
		JOptionPane.showMessageDialog(null,"Hola "+ nombre+"\nAhora te entregare un Pokemon al nivel 5.\nSuerte en el el mundo Pokemon");
		
		Entrenador yo = new Entrenador(nombre);
		Batalla bat = new Batalla(yo);
		
			
			yo.mostrarMochila();
		do{	
                        opcion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:\n1) Empezar una batalla\n2)Abrir la Pokedex\n3) Salir"));
			
			
			if(opcion == 1){
				bat.comienza();
			}
                        if(opcion==2){
                            ler.crearArray();
                            String res=JOptionPane.showInputDialog("¿Que Pokemon quieres ver?\nIntroduce el nombre del Pokemon: ");
                            String fichero=res+".txt";
                            
                            ler.escribir(fichero);
                            ler.lerFich(fichero);
                        }
			
		}while(opcion != 3);
                
	}
    }
    

