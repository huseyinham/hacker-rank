package InterfaceTask;

public class MyCalculator implements AdvancedArithmetic {

    public int divisorSum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}