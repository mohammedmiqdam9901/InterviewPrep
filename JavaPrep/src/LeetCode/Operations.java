package LeetCode;

public class Operations {

    public static int finalValueAfterOperations(String[] operations) {

        int x =0;

        for(int i =0; i <operations.length; i++)
        {
            if(operations[i].equals("X++")  || operations[i].equals("++X"))
            {
                x = x +1;
            }
            else if(operations[i].equals("X--")  || operations[i].equals("--X"))
            {
                x = x -1;
            }
        }

        return x;

    }

    public static void main(String[] args) {
        String arr[] = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(arr));
    }
}
