package Heap;

import java.util.PriorityQueue;



public class PurchasingMaxItems {
    public static void purchaseMaxItems(int[] arr,int sum){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < pq.size(); i++) {
            if(pq.peek() <= sum){
                ans++;
                sum-=pq.poll();
            }else{
                break;
            }
        }
        System.out.println("You can buy a max of "+ans+" items");
    }
    public static void main(String[] args){
        int[] arr = {1,12,5,111,200};
        int sum = 10;
        purchaseMaxItems(arr,sum);
    }
}