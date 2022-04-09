package week_05;

public class UtopianTree {

    public static void main(String[] args) {

        int year=0;
        int growth=0;
        int treeSize=0;

        for (int i = year; i <3 ; i++) {
            year++;
            growth=1;
            treeSize+=growth;
            System.out.println("year "+year+" - growth "+growth+" cm\ntree size: "+treeSize+"cm");
        }
        for (int j = year; j < 10; j++) {
            year++;
            growth=2;
            treeSize+=growth;
            System.out.println("year "+year+" - growth "+growth+" cm\ntree size: "+treeSize+"cm");
        }






    }
}

/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm
​
year 2 - growth 1 cm
tree size: 2cm
​
year 3  - growth 1 cm
tree size:3cm
​
year 4 - growth 2 cm
tree size: 5cm
​
year 5 - growth 2 cm
tree size: 7cm
​
year 6 - growth 2 cm
tree size: 9cm
​
... until you reach year 10
 */
