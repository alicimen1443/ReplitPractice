package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class LameDb {
    public static String lameDb(String db, String op, String id, String data) {

        String[] arr = db.split("#");
        String result="";
        int n = Integer.parseInt(id)-1;

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        if(op.equals("delete")){
            list.remove(n);
            for (String each : list) {
                result+=each+"#";
            }
        }

        if(op.equals("edit")){
            list.set(n,n+data);
            for (String each : list) {
                result+=each+"#";
            }
        }

        if(op.equals("add")){
            if(Integer.parseInt(id)>list.size()){
                list.add(id+data);
                for (String each : list) {
                    result+=each+"#";
                }
            } else if(Integer.parseInt(id)==list.size()){
                list.add(Integer.parseInt(id)+1+data);
                for (String each : list) {
                    result+=each+"#";
                }
            }else{
                list.add(n,id+data);
                for (int i = 1; i < list.size(); i++) {
                    list.set(i,Integer.parseInt(list.get(i).substring(0,1))+1+list.get(i).substring(1));
                }
                for (String each : list) {
                    result+=result+=each+"#";
                }
            }

        }

        return result.substring(0,result.length()-1);
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}
