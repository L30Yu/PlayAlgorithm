package leo.algo;

import java.util.*;

public class InsertionSort{

    // 我们的算法类不允许产生任何实例
    private InsertionSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // 寻找元素arr[i]合适的插入位置

            // 写法1
//            for( int j = i ; j > 0 ; j -- )
//                if( arr[j].compareTo( arr[j-1] ) < 0 )
//                    swap( arr, j , j-1 );
//                else
//                    break;

            // 写法2
            for( int j = i; j > 0 && arr[j].compareTo(arr[j-1]) < 0 ; j--)
                swap(arr, j, j-1);

        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // 测试InsertionSort
    public static void main(String[] args) {

        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomeArray(N, 0, 100000);
        SortTestHelper.testSort("leo.algo.InsertionSort", arr);

        return;
    }
}

//
///**
// * Created by dyu on 6/20/2017.
// */
//public class InsertionSort {
//    public InsertionSort(){};
//
//    public static void sort(Comparable[] arr){
//
//        for(int i = 1; i < arr.length; i++){
//
//            for(int j = i; j>0; j--){
//                if(arr[j].compareTo(arr[j-1]) < 0){
//                    swap(arr, j, j-1);
//                }
//                else
//                    break;
//            }
//
//        }
//
//    }
//    private static void swap(Object[] arr, int i, int j){
//        Object temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void main(String[] args){
//        int N = 20000;
//        Integer[] arr = SortTestHelper.generateRandomeArray(N, 0, 100);
//        InsertionSort.sort(arr);
//        SortTestHelper.printArray(arr);
//        SortTestHelper.testSort("leo.algo.InsertionSort", arr);
//    }
//
//}


