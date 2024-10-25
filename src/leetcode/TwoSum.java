package leetcode;

import java.util.HashMap;

public class TwoSum {
    public String twoSum(int[] nums, int target) {
        // Usando HashMap
        HashMap<Integer, Integer> mapNums = new HashMap<Integer, Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = target - nums[i];

            if (mapNums.containsKey(num)) {
                return "[" + mapNums.get(num) + ", " + i + "]";
            }
            mapNums.put(nums[i], i);
        }
        return "";
    }
//        /// Algoritmo de força bruta On^2
//        int pont_inicial = 0;
//        int pont_final = nums.length -1;
//
//        while (pont_inicial < pont_final){
//            int sum = nums[pont_inicial] + nums[pont_final];
//            if( sum == target) {
//                return "[" + pont_inicial + "," + pont_final + "]";
//            } else if (sum < target) {
//                pont_inicial+=1;
//
//            }else{
//                pont_final-=1;
//            }
//        }
//        return "";

    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        System.out.print(two.twoSum(new int[]{2,3,4}, 6));
    }
}

