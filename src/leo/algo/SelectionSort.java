package leo.algo;

/**
 * Created by dyu on 6/19/2017.
 */
public class SelectionSort {

    private SelectionSort(){}

    public static <T extends Comparable<T>> void sort(T[] arr){

        int n = arr.length;
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(arr[j].compareTo( arr[minIndex] ) < 0)
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j){
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args){

        int N = 200000;
        Integer[] arr = SortTestHelper.generateRandomeArray(N, 0, N);
        SelectionSort.sort(arr);
        SortTestHelper.printArray(arr);
        SortTestHelper.testSort("leo.algo.SelectionSort", arr);


        Integer[] arr2 = {10, 8, 5 , 9, 3, 1};
        SelectionSort.sort(arr2);

        for( int i = 0 ; i < arr2.length ; i ++ ){
            System.out.print(arr2[i]);
            System.out.print(' ');
        }
        System.out.println();
        // 测试Double
        Double[] b = {4.4, 3.3, 2.2, 1.1};
        SelectionSort.sort(b);
        for( int i = 0 ; i < b.length ; i ++ ){
            System.out.print(b[i]);
            System.out.print(' ');
        }
        System.out.println();

        // 测试String
        String[] c = {"D", "C", "B", "A"};
        SelectionSort.sort(c);
        for( int i = 0 ; i < c.length ; i ++ ){
            System.out.print(c[i]);
            System.out.print(' ');
        }
        System.out.println();

        // 测试自定义的类 Student
        Student[] d = new Student[4];
        d[0] = new Student("D",90);
        d[1] = new Student("C",100);
        d[2] = new Student("B",95);
        d[3] = new Student("A",95);
        SelectionSort.sort(d);
        for( int i = 0 ; i < d.length ; i ++ )
            System.out.println(d[i]);
    }
}
