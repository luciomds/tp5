/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico5;

/**
 *
 * @author Usuario
 */
public class PruebaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arreglo a = new Arreglo();
        int mayor=0;
        int [] arr = {1,2,3,4,5};
        Arreglo.sumarLista(arr);
        
        int [][] matriz = {{21,6,7},{2,8,1},{3,11},{55}};
        mayor=Arreglo.buscarMayor(matriz);
        System.out.println("El numero mas grande fue: "+mayor);
        
        String frase = "Hola juan carlos, como estas?";
        Arreglo.cuentaVocales(frase);
        
        Arreglo.cuentaCaracter(frase, 's');
        
    }
    
}
