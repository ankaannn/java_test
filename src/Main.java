import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        //numbers[10] = 33 //will give an exception, javas way to report errors
        //System.out.println(numbers); //print out the address of the array
        System.out.println(Arrays.toString(numbers));
        int[] array = {2, 7, 4, 1, 6};
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
