public class Main {

    public static void main(String[] args) {

        System.out.println(factorial(4));

    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    // here, the factorial method must run 4 times.
    // recursion case 1: return 4 * factorial(3)
    // recursion case 2: return 3 * factorial(2)
    // recursion case 3: return 2 * factorial(1)
    // base case: 1: return 1

    //once 1 is reached, '1' is returned to recursion case 3 which returns 2*1 = 3 and returns 2
    // recursion case 2 then return 3*2 = 6
    // recursion case ` then returns 4*6 = 24 as final answer

    // note the call stack again starts with recursion case 1 with pushing onto the stack, then pops off the call stack
    // starting with base case back to recursion case 1


}