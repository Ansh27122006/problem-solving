package advanced.dsa.assignment;

public class Q12GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int totalTank=0;
        int currTank=0;
        for(int i=0;i<gas.length;i++){
            totalTank+=gas[i]-cost[i];
            currTank+=gas[i]-cost[i];
            if(currTank<0){
                start=i+1;
                currTank=0;
            }
        }
        return totalTank<0?-1:start;
    }
    public static void main(String[] args) {
        int[] gas1 = {1,2,3,4,5}, cost1 = {3,4,5,1,2};//3
        System.out.println(canCompleteCircuit(gas1,cost1));
        int[] gas2 = {2,3,4}, cost2 = {3,4,3};//-1
        System.out.println(canCompleteCircuit(gas2,cost2));
    }
}
