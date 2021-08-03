import inimigo.CriarEnemy;
import player.CriarPlayer;
import player.PlayerInterface;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CriarEnemy.CriarEnemy();
        CriarPlayer.CriarP();
        System.out.println("Tudo ok!");
    }
}
