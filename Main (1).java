/* Escreva um programa que leia dois pontos num espaço bidimensional e
calcule a distância entre esses pontos */

import java.util.Scanner;


public class Main {
     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira 1 valor do 1 par: ");
        int X1 = teclado.nextInt();
        
        System.out.println("Insira 2 valor do 1 par: ");
        int X2 = teclado.nextInt();
        
        System.out.println("Insira 1 valor do 2 par: ");
        int Y1 = teclado.nextInt();
        
        System.out.println("Insira 2 valor do 2 par: ");
        int Y2 = teclado.nextInt();
        
        double D = Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2));
        
        System.out.println("A distancia entre o ponto 1 e o ponto 2 eh: "+D);
    }
}