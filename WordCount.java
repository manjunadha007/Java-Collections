import java.util.*;

class WordCount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String curr_str=arr[i];
            if(h.containsKey(curr_str)){
                int freq=h.get(curr_str);
                freq++;
                h.put(curr_str,freq);
            }
            else{
                h.put(curr_str,1);
            }
        }
        for(String i:h.keySet()){
            System.out.println(i+" -->  "+h.get(i));
        }
    }
}
