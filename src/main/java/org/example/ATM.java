package org.example;
import java.util.Scanner;
public class ATM {
    Bank bank = new Bank();
    Scanner s = new Scanner(System.in);
    public void Start(){
        System.out.println("введите номер карты ");
        int cardNum = s.nextInt();
        for(int i = 0;i<bank.getCards().size();i++){
            if (cardNum==bank.getCards().get(i).cardNum)
            {
                CheckPinCode();
            }
        }
    }
    public void CheckPinCode(){
        int pinCode = s.nextInt();
        for(int i = 0;i>=bank.getCards().size();i++){
            if (pinCode==bank.getCards().get(i).getPinCode());
            {
                System.out.println("верно");
                break;
            }
        }
    }

}
