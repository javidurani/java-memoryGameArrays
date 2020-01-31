/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memory.game;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mlarrubia
 */
public class MemoryGame {
public static Scanner kb = new Scanner(System.in);
public static Random random = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] deck={'A','A','B','B','C','C','D','D','E','E','F','F','G','G','H','H'};
        boolean[] cardDrawn = new boolean[16];
        int gridsize = 4;
        char[][] grid = new char[4][4];
        for(int i = 0; i < 16; i++){
        cardDrawn[i] = false;
        }
        int randCard;
        for(int j = 0; j < gridsize; j++){
            for(int k = 0; k < gridsize; k++){
                randCard = random.nextInt(16);
                while(cardDrawn[randCard] == false){
                    deck[randCard] = ' ';
                }
                
            }
        }        
    }
    
}
