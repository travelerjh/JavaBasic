package ch15Collection.book.b10;

import java.util.HashSet;
import java.util.Set;

public class Ex {
    public static void main(String[] args) {

    }
}

class  sol{
    public  int cate(int[]nums){
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }

        return  0;
    }

}