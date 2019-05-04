package ProjektZamianaBajtow;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A {
//    public int[] solution(){
//        return {1};
//    }
    int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum, i, j;

        // Pick a starting point
        for (i = 0; i < n; i++)
        {
            curr_sum = arr[i];

            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++)
            {
                if (curr_sum == sum)
                {
                    int p = j - 1;
                    System.out.println("Sum found between indexes " + i
                            + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }
    static int findSubarraySum(int arr[], int n, int sum)
    {
        // HashMap to store number of subarrays
        // starting from index zero having
        // particular value of sum.
        HashMap <Integer, Integer> prevSum = new HashMap<>();

        int res = 0;

        // Sum of elements so far.
        int currsum = 0;

        for (int i = 0; i < n; i++) {

            // Add current element to sum so far.
            currsum += arr[i];

            // If currsum is equal to desired sum,
            // then a new subarray is found. So
            // increase count of subarrays.
            if (currsum == sum)
                res++;

            // currsum exceeds given sum by currsum
            //  - sum. Find number of subarrays having
            // this sum and exclude those subarrays
            // from currsum by increasing count by
            // same amount.
            if (prevSum.containsKey(currsum - sum))
                res += prevSum.get(currsum - sum);


            // Add currsum value to count of
            // different values of sum.
            Integer count = prevSum.get(currsum);
            if (count == null)
                prevSum.put(currsum, 1);
            else
                prevSum.put(currsum, count+1);
        }

        return res;
    }


    public static int solution(int A, int B) {
        // write your code in Java SE 8
        for (int i = A; i < B; i++) {

            double number = Math.sqrt(i);
            if (number%2==0)

            System.out.println(number);
            for (int j = 3; j < i; j++) {
            }
        }
        return 1;
    }

    public int[] twoSum(int[] nums, int target) {
        int sum = 0 ;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum==target) {
                    System.out.println(i + " " + j);
                }
            }
        }

        return new int[]{1};
    }


    public static void main(String[] args) {
        System.out.println("a");
        A a = new A();
        int[] ar = {2,1,23,2,1,3,-2,5};
//        System.out.println(findSubarraySum(ar, 0, 3));
////        solution(11,20);
        a.twoSum(ar,3);
        Set set = new HashSet();
        set.add(112);
        set.add(23);
        set.add(4);
        set.add(911);
        for (Object o: set){
            System.out.println(o);
        }
        System.out.println(set.remove(4));
        System.out.println(set.contains(21));
        Map map = new HashMap();
        map.put(94,921);
        map.put(12,12);
        map.put(32,1);
        System.out.println(map.get(94));
        System.out.println(map.values());

    }
}
