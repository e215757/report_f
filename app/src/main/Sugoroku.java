//import java.util.Scanner;
import java.util.Random;

public class Sugoroku {
    public static void main(String[] args){
        //Scanner scanner = new Scanner(System. in);
        Random random = new Random();
        int diceNumber = 0;
        int location = 0;

        System.out.println("すごろくはじめ！");

        while (location < 10){
            //System.out.println("press enter");
            //scanner.nextLine();
            diceNumber = random.nextInt(6) + 1;
            System.out.println(diceNumber + "が出ました");
            location += diceNumber;
            System.out.println(location + "マス目に進みました");
            showSugorokuBan(location);

            switch(location){
                case 2:
                    System.out.println("\n橋に止まりました");
                    System.out.println("１マス進みます");
                    location += 1;
                    System.out.println(location + "マス目に進みました");
                    showSugorokuBan(location);
                    break;                
            

                case 5:
                    System.out.println("\n穴に落ちました");
                    System.out.println("スタートに戻りました");
                    location = 0;
                    showSugorokuBan(location);
                    break;
                

                case 8:
                    System.out.println("\nヘビが出ました");
                    System.out.println("2マス戻ります");
                    location -= 2;
                    System.out.println(location + "マス目に進みました");
                    showSugorokuBan(location);
                    break;
            
            }
            if(location == 10){
                System.out.println("ゴールしました！");
            }else{
                System.out.println("ゴールできませんでした");
            }
            System.out.println("すごろく終了");
            //scanner.close();
        }
        
    }

        private static void showSugorokuBan(int location){
            for (int i = 0; i<= 10; i++){
                if (i == location){
                    System.out.println("|　　⭐︎　　|");
                }else if(i == 0){
                    System.out.println("|　スタート|");
                }else if(i == 2){
                    System.out.println("|　　橋　　|");
                }else if(i == 5){
                    System.out.println("|　　🟡　　|");
                }else if(i == 8){
                    System.out.println("|　　蛇　　|");
                }else if(i == 10){
                    System.out.println("|　ゴール　|");
                }else {
                    System.out.println("|　　　　　|");
                }
            }
        
    }
}