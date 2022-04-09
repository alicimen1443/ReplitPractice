package arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {
    public static ArrayList<String> combineRs(String[] r1,String[] r2){

        // your code here

        String[] result = new String[r1.length+ r2.length];

        int i =0;
        for (String each : r1) {
            result[i++]=each;
        }
        for (String each : r2) {
            result[i++]=each;
        }
        ArrayList<String> list = new ArrayList<>(Arrays.asList(result));
        return list;




    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }
}
/*
Finish the combineRs method to combine the two given String arrays into one arraylist and return the arraylist.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns [f, o, o, b, a, r]

combineRs(["1","2","3"],["4"])
returns [1, 2, 3, 4]
 */