//ババ抜きするプログラム
package jp.ac.uryukyu.ie.e175723;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Distribute game1 = new Distribute();

        Player user1=new Player("Hana");
        Player user2=new Player("Taro");
        game1.card();
        Play play=new Play();
        play.startGame(game1,user1,user2);


    }
}
