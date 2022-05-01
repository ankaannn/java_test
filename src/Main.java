import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        //Arrays
        System.out.println("About arrays:");
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

        //multi-dimensional arrays
        System.out.println("About multi-dimensional arrays:");
        int[][] array2D = new int[2][3]; //create an 2D-array
        array2D[0][0] = 1;
        System.out.println(Arrays.deepToString(array2D)); //deepToString for printing multi-dimensional arrays
        int[][] array2D_1 = {{1, 2, 3}, {4, 5, 6}}; //another way of creating an 2D-array
        System.out.println(Arrays.deepToString(array2D_1));

        int[][][] array3D = new int[2][3][5]; //create an 3D-array

    }
}
