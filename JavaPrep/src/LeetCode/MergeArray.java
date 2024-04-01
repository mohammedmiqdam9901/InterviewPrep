package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < m; i++) {
            ar.add(nums1[i]);
        }

        for (int j = 0; j < n; j++) {
            ar.add(nums2[j]);
        }


        Collections.sort(ar);


    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,0,0,0};
        int arr1[] = {2,5,6};

        merge(arr,3,arr1,3);



    }
}
