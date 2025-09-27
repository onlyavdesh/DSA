
public class binarytodec {
    public static void bintodec(int binnum){
        int pow =0;
        int decnum = 0;

        while(binnum>0){
            int lastdigit = binnum % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binnum = binnum/10;
        } 
        System.out.println("Your last digit" + decnum);
    }
    
 public static void main( String args[]){
    bintodec(111);
}
}

