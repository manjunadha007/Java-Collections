import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
        }
        ArrayList<Character> arr=new ArrayList<>();
        for(char i : h){
            System.out.print(i+" ");
        }
    }
}