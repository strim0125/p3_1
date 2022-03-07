import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"qwe", "asd", "zxc"};

        ArrayList<String> test = arrayToList(arr);
        System.out.println(test);

        BoxWithFruits<Apple> boxx = new BoxWithFruits<>();
        boxx.add(new Apple());
    }

    public static <T> ArrayList<T> arrayToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void swap(Object[] arr, int index1, int index2){
        Object obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
    }

//    public static <T> void swap1(){
//        T obj = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = obj;
//    }
}
