package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class RepeatAll {
    //create your method below
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> booleans){

        ArrayList<Boolean> result = new ArrayList<>(booleans);

        for( Boolean each: booleans ){

            result.add(each);
        }

        booleans=result;
        return booleans;

        //   booleans.addAll(Arrays.asList(booleans.toArray(new Boolean[0])));
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }



}
/*
Create a static method that:

is called repeatAll
returns a modified ArrayList
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is

(true, false, false)
(true, false, false)
The modified ArrayList should be

(true, false, false, true, false, false)
 */