import java.util.Scanner;

public class ArraySubsequence {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) arr[i]=sc.nextInt();
    int m=sc.nextInt();
    int seq[]=new int[m];
    for(int i=0;i<m;i++) seq[i]=sc.nextInt();
    int tp=0;
    for(int i:arr){
      if(tp==m)break;
      if(i==seq[tp]) tp+=1;
    }
    if(tp==m) System.out.println(true);
    else System.out.println(false);
    sc.close();
  }
}
