/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

/**
 *
 * @author DELL
 */
public class Eliza {
    private String entrada;
    private String respuesta;
    
    public Boolean interactuar(String entrada){
        entrada=entrada.toLowerCase();
        if(!entrada.equalsIgnoreCase("Adios")){
            if(entrada.contains("mi")==true){
                int f= entrada.split(" ").length;
                String n = entrada.split(" ")[f-1];
                System.out.println("Tell me more about your "+n);
            }else if(entrada.contains("hola")){
                System.out.println("Hola, Dime tu nombre");
            }else if(entrada.contains("amor")||entrada.contains("odio")){
                System.out.println("Parece que tiene fuertes sentimientos al respecto");
            }else if(entrada.contains("miedo")){
                System.out.println("Enfrenta tus miedos");
            }else{
                System.out.println("Continua, Please go on");
            }          
            
            return false;
        }else{
            System.out.println("Vuelva pronto\nSon $500");
            return true;
        }
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    
}
