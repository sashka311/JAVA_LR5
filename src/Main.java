import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String s;
        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //task1
        System.out.println("Enter A for random number from 1 to 10: ");
        System.out.println("Enter B for random number from 10.0 to 100.0: ");
        System.out.print("\t= ");

        s = reader.readLine();
        char c = s.charAt(0);
        if(c == 'A'){
            System.out.println("You entered 'A', your random number: "+ (random.nextInt(10) + 1));
        } else if (c == 'B') {
            System.out.println("You entered 'B', your random number: "+ random.nextFloat(100) + 10);
        }else{
            System.out.println("You entered other char");
        }

        //task2
        System.out.print("task2 = ");
        s = reader.readLine();
        System.out.println(s.equals("Привет") ? "Взаимно" : "Добрый день");
    }
}