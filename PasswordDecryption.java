import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Character;
public class PasswordDecryption{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int i=0;
    int n=s.length();
    char ch[]=s.toCharArray();
    while(i<n){
      if(ch[i]=='*'){
        char tp=ch[i-1];
        ch[i-1]=ch[i-2];
        ch[i-2]=tp;
      }i+=1;
    }
    List<Character> ls=new ArrayList<>();
    i=0;
    while(i<n){
      if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z') || ch[i]=='0'){
        ls.add(Character.valueOf(ch[i]));
      }i+=1;
    }
    i=ls.size()-1;
    int tp=0;
    while(i>=0){
      if(ls.get(i)=='0'){
        System.out.print(ch[tp++]);
      }else{System.out.print(ls.get(i));}i-=1;
    }
    sc.close();
  }
}