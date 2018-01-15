package jp.ac.uryukyu.ie.e175723;
import java.util.*;
//手札を配るメソッド
public class Distribute{

    ArrayList<String> handCard1;
    ArrayList<String> handCard2;

    public void card(){
        String[] card={"1","1","2","2","3","3","4","4","5","5","6","6","7","7",
                "8","8","9","9","10","10","J","J","Q","Q","K","K",
                "1","1","2","2","3","3","4","4","5","5","6","6","7","7",
                "8","8","9","9","10","10","J","J","Q","Q","K","K","Joker"};
        List<String> list = Arrays.asList(card);
        Collections.shuffle(list);
        String[] allCard= (String[])list.toArray(new String[0]);
        ArrayList<String> player1=new ArrayList<String>();
        ArrayList<String> player2=new ArrayList<String>();

        for (int i=0; i<allCard.length; i++){
            if (i%2==0){
                if(player1.lastIndexOf(allCard[i])== -1) {
                    player1.add(allCard[i]);
                }else{
                    player1.remove(allCard[i]);
                }
            }else if(i%2==1){
                if(player2.indexOf(allCard[i])== -1 ) {
                    player2.add(allCard[i]);
                }else{
                    player2.remove(allCard[i]);
                }

        }
        this.handCard1=player1; this.handCard2=player2;

}
    }
}