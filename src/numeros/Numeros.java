/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        Scanner teclado = new Scanner(System.in);
        String resp;
        do{
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Deseja continuar? [S/N]: ");
            resp = (teclado.next());
            resp = resp.toUpperCase();
            
        }while (resp.equals("S"));
        System.out.println("A soma dos numeros é " + s);
    }
    
}
