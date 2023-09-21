import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Winner {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String arr[][]=new String[n][2];
    int res[]=new int[n];
    for(int i=0;i<n;i++)
      for(int j=0;j<2;j++)
        arr[i][j]=sc.next();
    for(int i=0;i<n;i++) res[i]=sc.nextInt();
    Map<String,Integer> mp=new HashMap<>();
    String rest="";
    int max=0;
    for(int i=0;i<n;i++){
      if(mp.containsKey(arr[i][res[i]^1])){
        mp.put(arr[i][res[i]^1], mp.get(arr[i][res[i]^1])+1);
        if(max<mp.get(arr[i][res[i]^1])){
          max=mp.get(arr[i][res[i]^1]);
          rest=arr[i][res[i]^1];
          continue;
        }
      }
        mp.put(arr[i][res[i]^1],1);
        if(max<mp.get(arr[i][res[i]^1])){
          max=1;
          rest=arr[i][res[i]^1];
        }
    }
    System.out.println(rest);
    sc.close();
  }
}
