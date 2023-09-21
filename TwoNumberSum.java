import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TwoNumberSum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    int target=sc.nextInt();
    // O(N^2)
    // for(int i=0;i<n;i++){
    //   int cr=arr[i];
    //   for(int j=i+1;j<n;j++){
    //     if(cr+arr[j]==target){
    //       System.out.println(cr+" "+arr[j]);
    //       sc.close();
    //       return;
    //     }
    //   }
    // }

    //Using Set
    // Set<Integer> set=new HashSet<>();
    // for(int i=0;i<n;i++){
    //   if(set.contains(target-arr[i])){
    //     System.out.println(arr[i]+" "+(target-arr[i]));
    //     break;
    //   }
    //   set.add(arr[i]);
    // }
    // Using Map
    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
      if(map.containsKey(arr[i])){
        map.put(arr[i],map.get(arr[i])+1);
        continue;
      }
      map.put(arr[i],1);
    }
    for(int i=0;i<n;i++){
      int tp=target-arr[i];
      if(map.containsKey(tp) && tp==arr[i]  && map.get(arr[i])>1){
        System.out.println(arr[i]+" "+arr[i]);
        break;
      }
      else if(map.containsKey(tp) && tp!=arr[i]){
        System.out.println(arr[i]+" "+tp);
        break;
      }
    }
    sc.close();
  }
}
