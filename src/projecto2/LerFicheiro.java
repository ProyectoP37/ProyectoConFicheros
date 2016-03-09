package projecto2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class LerFicheiro {
    ArrayList <Pokedex> pokedex= new ArrayList();
    public void crearArray(){
        Pokedex bulbasur=new Pokedex("Bulbasaur ","Pokemon de tipo planta. Cuando este Pokemon nace, tiene una semilla en su lomo. Esta semilla crece y se desarrolla a lo largo del ciclo de vida de Bulbasaur a medida que se producen sus evoluciones.");
        Pokedex Charmander =new Pokedex("Charmander","Pokemon de tipo fuego. Charmander es un pequeño lagarto bípedo.Tiene una pequeña llama en la punta de su cola que indica el estado físico y emocional del Pokemon.Si la llama desaparece o se apaga, moriría."); 
        Pokedex Squirtle =new Pokedex("Squirtle","Pokemon de tipo agua. Squirtle es una de las especies más difíciles de encontrar. Son pequeñas tortugas color celeste con caparazones color café o rojas, con una cola enrollada que los distingue. Cuando se siente atacado, Squirtle esconde completamente su cuerpo en el interior de su caparazón.");
        Pokedex Drowzee =new Pokedex("Drowzee","Pokemon de tipo psíquico\n" +
        "Este Pokemon es de gran utilidad para las personas que padecen insomnio. Es capaz de dormir a una ciudad entera con su poder mental. Le gusta vivir en mesetas de gran extensión con lagos donde poder refrescarse en los días más calurosos.");
        Pokedex Ekans =new Pokedex("Ekans ","Pokemon de tipo veneno. Este Pokemon reside en las praderas, le gustan los lugares abiertos y cerca del agua para poder tener terreno a su gusto. Suele comer huevos o crías de otros Pokémon más pequeños.");
        Pokedex Gastly =new Pokedex("Gastly ","Pokemon de tipo fantasma\n" +
        "Está hecho de una masa negra gaseosa con un aura de gas violeta a su alrededor la cual es venenosa y asfixiaría a la mayoría de los mortales. Presenta dos grandes ojos y una boca, pero se desconoce si Gastly bebe o se alimenta de alguna cosa. No se suele ver al aire libre, ya que alguna fuerte corriente de viento podría arrastrar su cuerpo de gas.");
        Pokedex Machop =new Pokedex("Machop ","Pokemon de tipo lucha\n" +
        "Su hábitat natural se encuentra principalmente en las montañas y en las cuevas, donde dispone de lo necesario para su fortalecimiento. A pesar de estar en su etapa primaria, Machop es frecuentemente usado para tareas donde es necesario usar la fuerza física.");
        Pokedex Onix =new Pokedex("Onix ","Pokemon de tipo roca. \n" +
        "Onix es uno de los Pokemon más curiosos por su aspecto físico, teniendo forma similar a la de una lombriz hecha de roca. A pesar de su gran tamaño , pesa muy poco. Puede vivir cientos de años, siendo uno de los Pokemon más longevos, y puede crecer hasta 10 metros en promedio al llegar a adulto.");
        Pokedex Pikachu =new Pokedex("Pikachu  ","Pokemon de tipo eléctrico\n" +
        "Pikachu es un pequeño roedor con una cola en forma de rayo en los machos; en las hembras la punta de la cola tiene forma de corazón. Pikachu crece en aŕeas con altas cantidades de actividad eléctrica natural.");
        Pokedex Sandshrew =new Pokedex("Sandshrew  ","Pokemon de tipo tierra\n" +
        "Este Pokemon reside en los lugares abiertos donde le gusta cavar y hacer sus madrigueras, por esto mismo habita en lugares como el campo, los desiertos y algunas cuevas. Pese a tener aversión por el agua, Sandshrew la necesita para sobrevivir.");
        pokedex.add(bulbasur);
        pokedex.add(Charmander);
        pokedex.add(Squirtle);
        pokedex.add(Drowzee);
        pokedex.add(Ekans);
        pokedex.add(Gastly);
        pokedex.add(Machop);
        pokedex.add(Pikachu);
        pokedex.add(Sandshrew);
        pokedex.add(Onix);
               
    }
    
    public void lerFich(String nomeFich){
        Scanner sc=null;
        try {
            sc=new Scanner(new File(nomeFich));//creamos el flujo entre programa y fichero.
            while(sc.hasNextLine()){
                
                System.out.println(sc.nextLine());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Erro na lectura"+ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    public void escribir(String nomeFich){
        File f = new File(nomeFich);
        PrintWriter escribir=null;
        try {
            // Abrimos ficheiro para escribir.
             escribir= new PrintWriter(f);
             for(int i=0;i<pokedex.size();i++){
                 escribir.println(pokedex.get(i));
             }
        } catch (FileNotFoundException ex) {
            System.out.println("erro escritura"+ex.getMessage());
        }finally{
            escribir.close();
        }
    }
    
    
    
}
