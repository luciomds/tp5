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
public class Arreglo {

    public static void sumarLista(int arr[]) {
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
        promedio = (suma / arr.length);
        System.out.println("La suma de los numeros ingresados es: " + suma + "\n" + "El promedio de los numeros ingresados es: " + promedio);
    }

    public static int buscarMayor(int x[][]) {
        int mayor = 0;
        for (int[] fila : x) {
            System.out.println("");
            for (int i = 0; i < fila.length; i++) {
                if (fila[i] > mayor) {
                    mayor = fila[i];
                }
            }
        }        
        return mayor;
    }
    
    public static int cuentaVocales (String cadena){
        int vocales=0;
        for (int i = 0; i < cadena.length(); i++) {
            if((cadena.charAt(i)=='a')||(cadena.charAt(i)=='A')||(cadena.charAt(i)=='e')||(cadena.charAt(i)=='E')||(cadena.charAt(i)=='i')||(cadena.charAt(i)=='I')||(cadena.charAt(i)=='o')||(cadena.charAt(i)=='O')||(cadena.charAt(i)=='u')||(cadena.charAt(i)=='U')){
                vocales++;
            }
        }
        System.out.println("La frase: "+cadena+" tiene: "+vocales+" vocales");
        return vocales;
    }
    
    public static int cuentaCaracter (String frase, char c){
        int cant=0;
        for (int i = 0; i <frase.length(); i++) {
            if(frase.charAt(i)==c){
                cant++;
            }
        }
        System.out.println("El caracter se repite "+cant+" veces, en la frase "+frase);
        return cant;
    }

}
