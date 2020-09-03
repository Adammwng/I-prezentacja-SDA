package varargs;

public class MathOperationsWithVarargs {

    public static int min(int... numbers) {
        int min = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int max(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static double avg(int... numbers) {
        double avg = 0;
        for (int i : numbers) {
            avg += i;
        }
        return avg / numbers.length;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}

class Usage {
    public static void main(String[] args) {
        System.out.println(MathOperationsWithVarargs.min(1, 2, 3, 4, 5));
        System.out.println(MathOperationsWithVarargs.max(1, 2, 3, 4, 5));
        System.out.println(MathOperationsWithVarargs.avg(1, 2, 3, 4, 5));
        System.out.println(MathOperationsWithVarargs.sum(1, 2, 3, 4, 5));

        System.out.println("-----");

        System.out.println(MathOperationsWithVarargs.min(-1, 1, -1, 1, -1, 1));
        System.out.println(MathOperationsWithVarargs.max(-1, 1, -1, 1, -1, 1));
        System.out.println(MathOperationsWithVarargs.avg(-1, 1, -1, 1, -1, 1));
        System.out.println(MathOperationsWithVarargs.sum(-1, 1, -1, 1, -1, 1));

        System.out.println("-----");

        System.out.println(MathOperationsWithVarargs.min(-10, 2, 21, 31, 101, -1201, 541, 2));
        System.out.println(MathOperationsWithVarargs.max(-10, 2, 21, 31, 101, -1201, 541, 2));
        System.out.println(MathOperationsWithVarargs.avg(-10, 2, 21, 31, 101, -1201, 541, 2));
        System.out.println(MathOperationsWithVarargs.sum(-10, 2, 21, 31, 101, -1201, 541, 2));

        System.out.println("-----");

        System.out.println(MathOperationsWithVarargs.min(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024));
        System.out.println(MathOperationsWithVarargs.max(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024));
        System.out.println(MathOperationsWithVarargs.avg(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024));
        System.out.println(MathOperationsWithVarargs.sum(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024));
    }
}
