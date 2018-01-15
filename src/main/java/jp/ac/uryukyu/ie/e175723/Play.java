package jp.ac.uryukyu.ie.e175723;
import java.util.*;
//ゲーム開始。
//プレイヤー間で手札の移動をします。
public class Play {
    public void startGame(Distribute game1,Player user1,Player user2){

        ArrayList<String>player1=game1.handCard1;
        ArrayList<String>player2=game1.handCard2;
        System.out.println(user1.getName()+" vs "+user2.getName());
        String card;
        while (true) {
            if (player1.size() == 0) {
                System.out.println("Winner:"+user1.getName());
                System.out.println("Loser:"+user2.getName());
                break;}
            if (player2.size() == 0) {
                System.out.println("Winner:"+user2.getName());
                System.out.println("Loser:"+user1.getName());
                break;}


            if (player1.size() != 0) {
                card = player1.get((int)(Math.random() * player1.size()));
                player1.remove(card);
                if (player2.lastIndexOf(card) == -1) {
                    player2.add(card);
                } else {
                    player2.remove(card);
                }
            }
            if (player1.size() == 0) {
                System.out.println("Winner:"+user1.getName());
                System.out.println("Loser:"+user2.getName());
                break;}
            if (player2.size() == 0) {
                System.out.println("Winner:"+user2.getName());
                System.out.println("Loser:"+user1.getName());
                break;}

            if (player2.size() != 0) {
                card = player2.get((int)(Math.random() * player2.size()));
                player2.remove(card);
                if (player1.lastIndexOf(card) == -1) {
                    player1.add(card);
                } else {
                    player1.remove(card);
                }
            }
        }

    }
}
