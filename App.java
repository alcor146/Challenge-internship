
import java.util.*;
public class App {
    

    static int minDist(int n, int p) {
        
        int count = 0;
        
        if(p == 1 || p == n)
            return 0;
        
        if(p/2 > (n-p)/2)
            count = (n-p)/2;
        else
            count = p/2;
        
        if(n % 2 == 0 && p == n-1)
            count++;
        
        return count;
    }

    static String minSwap(List<Integer> coada) {
        int count = 0;
        for(int i=coada.size() - 1; i>=0; i--){
            if(coada.get(i) - (i+1) > 2) {
                return "Configuratia nu este posibila";
            }
            
            for(int j=Math.max(0, coada.get(i)-2); j<i; j++)
                if(coada.get(j) > coada.get(i))
                    count++;    
        }
        return Integer.toString(count);
    }

    public static void main(String[] args) throws Exception {
       
        System.out.println("Teste pentru problema 1");
        System.out.println("pentru n = 6 si p = 2:  " + minDist(6, 2));
        System.out.println("pentru n = 5 si p = 4:  " + minDist(5, 4));
        System.out.println("pentru n = 6 si p = 5:  " + minDist(6, 5));
        System.out.println("");


        System.out.println("Teste pentru problema 2");
        List<Integer> coada = new ArrayList<>();
        coada.add(2);
        coada.add(1);
        coada.add(5);
        coada.add(3);
        coada.add(4);
        System.out.println("Pentru coada " + coada.toString() + ":  " + minSwap(coada));
        
        coada.clear();
        coada.add(2);
        coada.add(5);
        coada.add(1);
        coada.add(3);
        coada.add(4);
        System.out.println("Pentru coada " + coada.toString() + ":  " + minSwap(coada));

        
    }
}
