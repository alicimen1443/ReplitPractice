package arrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class CombineAll {
    //create your method below

    public static ArrayList<Integer> combineAll(ArrayList<Integer> list,ArrayList<Integer> list2){

        ArrayList<Integer> newList=new ArrayList<>();

        newList.addAll(list);
        newList.addAll(list2);

        return newList;

    }



    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAll(list,list2));

    }





}
/*
Create a static method that:

is called combineAL
returns an ArrayList<Integer>
takes two parameters: an ArrayList of Integers called list, and an ArrayList of Integers called list2
This method should create a new ArrayList of Integers, add all the words (in order) from list, then add all the words (in order)
 from list2. In other words, it is combining all the elements from the two parameters.
 */