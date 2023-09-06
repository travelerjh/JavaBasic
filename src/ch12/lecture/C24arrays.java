package ch12.lecture;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        // Arrays  : 배열을 다루는 메소드
        //equal =  두 배열 이 같은지
        //fill : 배열을 특정 값으로 채우기
        //sort : 배열 정렬
        //binarySearch :  특정 원소의 위치 찾기
        // toString : 문자열로 변환

        //obj obj
        int[] arr1 =new int[5];
        System.out.println(arr1);
        // 안에 원소의 내용을 보고 싶다.
        System.out.println(Arrays.toString(arr1));

        //세련된 방벙
        Arrays.fill(arr1,5);
        System.out.println(Arrays.toString(arr1));


        //sort
        int[]arr2 ={3,-2,10,0,-2};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //equals
        int[] arr3 ={3,4,5};
        int[] arr4 ={3,4,5};
        int[] arr5 ={3,4,5};
        System.out.println(Arrays.equals(arr3,arr4));
        System.out.println(Arrays.equals(arr3,arr5));
        System.out.println(Arrays.equals(arr4,arr5));


        //binarySearch  :  이진 선택   ---> !!" 반드시 sort 정렬"!!! 이 되서 중간에 어떤 값을 뽑아서 크냐작냐 해서 찾는거
                                           // 못찾으면 음수로 출려된다.
        int[]  arr6 ={5,3,6,2,1,6,5,8,3,24,24,3,123,1,44,524,213,52};
        Arrays.sort(arr6);
            int kk= Arrays.binarySearch(arr6, 5);
        System.out.println(kk);
        int i2 = Arrays.binarySearch(arr6, 8);
        System.out.println(i2);


    }
}
