
package tekraredençiftsayilar;

import java.util.Arrays;

public class TekraredenÇiftsayilar {

    public static void main(String[] args) {
        int array[]={2,4,3,7,42,35,32,34,2,4,42,84};
        Arrays.sort(array);
        int counter=0;
        
        for (int i = 0; i <array.length-1 ; i++) {
            if(array[i]==array[i++]){
                int select=array[i];
                if(select %2==0){
                    counter++;
                    System.out.println(select+" ");
                }
            }
        }if(counter==0){
            System.out.println("çift tekrar eden sayi yok.");
        }
        
    }
    
}
