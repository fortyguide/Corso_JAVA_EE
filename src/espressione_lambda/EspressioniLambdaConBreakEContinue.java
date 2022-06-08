package espressione_lambda;

public class EspressioniLambdaConBreakEContinue {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            System.out.println("Sono nel thread 1");

            int max = 0;

            while(max < 10) {
                System.out.println("max = " +  max);

                if (max == 5) {
                    break;
                }
            }

        });
    }
}
