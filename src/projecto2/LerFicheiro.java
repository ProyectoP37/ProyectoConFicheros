package projecto2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class LerFicheiro {
                
    
    
    public void lerFich(){
        Scanner sc=null;
        String res = null;
        try {
            sc=new Scanner(new File("descript.txt"));//creamos el flujo entre programa y fichero.
            while(sc.hasNextLine()){
                res=res+sc.nextLine()+"\n";
                
            }System.out.println(res);
            JOptionPane.showMessageDialog(null, res);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro na lectura"+ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    
    
    
    
}
