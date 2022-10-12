/**
 * 
 */
package sambungkata;

/**
 * @author MuhamadArifAdiputra
 *
 */

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
    Scanner sc = new Scanner(System.in);

    int scorep1 = 0;
    int scorep2 = 0;
    int turn = 1;
    public Main(){
        menu();
    }

    public void menu(){
        while(true){
            cls();
            System.out.print("Play [y/n]? ");
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("y")){
                game();
            }
            else if(ans.equalsIgnoreCase("n")){
                exit();
            }
        }
    }

    public String wordToUse(String str){
        if(str.equalsIgnoreCase("")){
            return "";
        }

        String ans = "";
        int idx = 0;
        for(int i = str.length()-1 ; i >= 0 ; i--){
            if((str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'e' || str.charAt(i) == 'o') &&
                    str.charAt(i-1) != 'a' && str.charAt(i-1) != 'i' && str.charAt(i-1) != 'u' && str.charAt(i-1) != 'e' && str.charAt(i-1) != 'o'){
                idx = i;
                break;
            }
        }

        for(int i = idx-1 ; i < str.length() ; i++){
            ans+=str.charAt(i);
        }

        return ans;
    }

    public void addPoint(int point){
        if(turn == 1){
            scorep2+=point;
        }
        else{
            scorep1+=point;
        }
    }

    public int check(String str, String str2){
        if(str2.equalsIgnoreCase("")){
            addPoint(str.length());
            return 1;
        }

        int flag = 0;
        for(int i = 0 ; i < str2.length() ; i++){
            if(str.charAt(i) != str2.charAt(i)){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            addPoint(str.length());
        }
        else if(flag == 1){
            return 0;
        }
        return 1;
    }

    public void game(){
        String prevWord = "";
        while(true){
            cls();
            String wordToUse2 = wordToUse(prevWord);
            System.out.println("Player 1 score: " + scorep1);
            System.out.println("Player 2 score: " + scorep2);
            System.out.println("Previous word: " + prevWord);
            System.out.println("Word to use: " + wordToUse2);
            if(turn == 1){
                System.out.print("Player 1 turn: ");
                turn = 2;
            }
            else{
                System.out.print("Player 2 turn: ");
                turn = 1;
            }

            String ans = sc.nextLine();

            prevWord = ans;
            int flag = check(ans, wordToUse2);
            if(flag == 0){
                winner();
            }
        }
    }

    public void winner(){
        if(scorep1 > scorep2){
            System.out.println("Player 1 win!");
        }
        else if(scorep2 > scorep1){
            System.out.println("Player 2 win!");
        }
        else{
            System.out.println("Draw!");
        }

        String hold = sc.nextLine();
        scorep1 = 0;
        scorep2 = 0;
        menu();
    }

    public void exit(){
        System.out.println("Thanks for playing!");
        System.exit(0);
    }

    public void cls(){
        for(int i = 0 ; i < 60 ; i++){
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}