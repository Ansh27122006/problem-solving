package advanced.dsa.test;

public class FlipToMakeAlternate {
    static int countFlip(String binary){
        int count1=0;
        char alt='0';
        for(char ch:binary.toCharArray()){
            if(alt!=ch) count1++;
            alt=(alt=='0')?'1':'0';
        }
        int count2=0;
        alt='1';
        for(char ch:binary.toCharArray()){
            if(alt!=ch) count2++;
            alt=(alt=='0')?'1':'0';
        }
        return Math.min(count1,count2);
    }
    public static void main(String[] args) {
        System.out.println(countFlip("0001010111"));
    }
}
