import lombok.experimental.UtilityClass;

public class FactorialAlgorithms {

    @UtilityClass
    public static class Recursive {
        int factorial(int n) {
            if (n == 0) {
                return 1;
            }
            return (n * factorial(n - 1));
        }

    }

    @UtilityClass
    public static class Iterative {
        int factorial(int n) {
           int returnValue = 1;

           while (n != 0) {
               returnValue = returnValue * n;
               n --;
           }

           return returnValue;
        }
    }

}
