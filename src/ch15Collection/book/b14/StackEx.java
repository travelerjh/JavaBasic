package ch15Collection.book.b14;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<coin> coinBox = new Stack<coin>();
        coinBox.push(new coin(100));
        coinBox.push(new coin(150));
        coinBox.push(new coin(200));
        coinBox.push(new coin(250));

//        while(!coinBox.isEmpty()){
//            coin coin =coinBox.pop();
//            System.out.println(coin.getValue());
//        }


     for( coin i:coinBox){
         System.out.println(i.getValue());
     }


    }
}

