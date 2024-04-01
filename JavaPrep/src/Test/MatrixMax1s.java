package Test;

import java.sql.SQLOutput;

public class MatrixMax1s {

    public static void rowWithMax1s(int arr[][])
    {

        int currentCount =0;
        int rowWithMax1s = 0;
        for(int i=0; i<arr.length;i++)
        {
            int count =0;
            for(int j=0; j<arr[0].length;j++)
            {
                if(arr[i][j] ==1)
                    count++;

                if(count > currentCount)
                    rowWithMax1s =i;

            }
        }

        System.out.println("The row with max is is "+rowWithMax1s);
    }

    public static void main(String[] args) {

        int arr[][] = {{0,0,1,1},{0,1,1,1},{1,1,1,1},{0,0,0,1}};
        rowWithMax1s(arr);

    }
}
