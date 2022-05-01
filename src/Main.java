import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

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

        //constants
        System.out.println("About constants:");
        //final -> can not change the value after initialize, always use capital letters to name constants
        final float PI = 3.14F; //needs to add F because java compiler needs to know its not a double
        //pi = 1; //can not assign a value because of final, pi is a constant/final value

        //arithmetic expressions
        System.out.println("About arithmetic expressions :");
        int result = 10+3;
        System.out.println(result);
        int result1 = 10/3;
        System.out.println(result1); //gives 3, if you want a decimal number you need to convert
        double result2 = (double)10/(double)3;
        System.out.println(result2);
        int x = 1;
        x++; //++x or x++ --> different, increment before or after
        System.out.println(x);
        //increase x by two, two different ways
        x = x + 2;
        x += 2;

        //order of operations
        System.out.println("About order of operations :");
        int g = 10 + 3 * 2; //gives 16
        int f = (10 + 3) * 2; //gives 26
        System.out.println(g);
        System.out.println(f);

        //Casting
        System.out.println("About casting:");
        //implicit casting - when you not going to lose data
        //byte > short > int > long > float > long
        short variable = 1; //2bytes
        int variable2 = variable+2; //4bytes
        System.out.println(variable2);
        double variable3 = 1.1;
        double variable4  = variable3 + 2; //1.1 + 2.0
        System.out.println(variable4);
        //explicit casting
        int variable5 = (int)variable3 + 2;
        System.out.println(variable5);

        String string1 = "1";
        Integer.parseInt(string1); //parseInt takes a string and returns an integer
        System.out.println(string1);

        //The Math Class
        System.out.println("About math class:");
        int q = Math.round(1.1F);
        System.out.println(q); //1
        int w = (int)Math.ceil(1.1F);
        System.out.println(w); //2
        w = (int)Math.floor(1.1F);
        System.out.println(w);
        w = Math.max(1,2); //min
        System.out.println(w);
        double e = Math.random(); //generates a random nr between 0-1
        System.out.println(e);

        //Formatting Numbers
        System.out.println("About Formatting numbers");
        //NumberFormat currency = new NumberFormat(); //can not write like this because NumberFormat is abstract class
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //calling this method will create an instance of the number format class and return it
        String result_1 = currency.format(1234567.891);
        System.out.println(result_1);
        NumberFormat procent = NumberFormat.getPercentInstance(); //calling this method will create an instance of the number format class and return it
        String result_2 = currency.format(0.1);
        System.out.println(result_2);

        //Read input from  the user
        System.out.println("About reading input from user");
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte(); //all methods starts with next, nextByte reads a byte
        //.next -> takes only a word, .nextLine -> takes the entire line the user enters
        System.out.println("You are " + age);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Name:");
        //chaining multiple methods:

        //read a string we have next and nextLine()
        String name = scanner1.nextLine().trim(); //trim takes away spaces
        System.out.println("You are " + name);
    }
}
