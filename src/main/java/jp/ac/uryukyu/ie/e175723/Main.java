package jp.ac.uryukyu.ie.e175723;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args){


        String[] allCard={"1","1","2","2","3","3","4","4","5","5","6","6","7","7",
                "8","8","9","9","10","10","J","J","Q","Q","K","K","Joker"};
        List<String> list = Arrays.asList(allCard);
        Collections.shuffle(list);
        allCard= (String[])list.toArray(new String[0]);
        List<String> player1=new ArrayList<String>();
        List<String> player2=new ArrayList<String>();
        List<String> player3=new ArrayList<String>();
        List<String> player4=new ArrayList<String>();
        for (String str : allCard) {
            System.out.print(str + ", ");
        }
        System.getProperty("line.separator");
        for (int i=0; i<allCard.length; i++){
            if (i%4==0){
                player1.add(allCard[i]);
            }else if(i%4==1){
                player2.add(allCard[i]);
            }else if(i%4==2){
                player3.add(allCard[i]);
            }else{
                player4.add(allCard[i]);
            }
        }
        System.out.println();
        for (String str : player1) {
            System.out.print(str + ", ");
        }
        Player user1=new Player("Taro",player1);
        Player user2=new Player("Hanako",player2);
        Player user3=new Player("Akio",player3);
        Player user4=new Player("Moe",player4);




    }

}
