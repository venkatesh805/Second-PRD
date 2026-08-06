public class Main {

    public static void main(String[] args) {

        // Hard-coded values
        int currentVal = 18;
        int divisor = 4;
        int benchmarkNum = 25;

        // Hard-coded menu choices
        int[] operationSequence = {1, 2, 3, 5, 7, 6, 4, 9, 8};

        int step = 0;
        boolean isRunning = true;

        System.out.println("Starting Number: " + currentVal);
        System.out.println();

        do {

            int selectedChoice = operationSequence[step];

            switch (selectedChoice) {

                case 1:
                    System.out.println("Operation: Positive/Negative/Zero");

                    String sign = (currentVal > 0)
                            ? "Positive Number"
                            : (currentVal < 0)
                                ? "Negative Number"
                                : "Zero";

                    System.out.println("Result: " + sign);
                    break;

                case 2:
                    System.out.println("Operation: Even/Odd");

                    String evenOdd = (currentVal % 2 == 0)
                            ? "Even Number"
                            : "Odd Number";

                    System.out.println("Result: " + evenOdd);
                    break;

                case 3:
                    System.out.println("Operation: Divisibility");

                    if (divisor != 0 && currentVal % divisor == 0) {
                        System.out.println(currentVal + " is divisible by " + divisor);
                    } else {
                        System.out.println(currentVal + " is not divisible by " + divisor);
                    }
                    break;

                case 4:
                    System.out.println("Operation: Compare Numbers");

                    String compare = (currentVal > benchmarkNum)
                            ? "Greater than " + benchmarkNum
                            : (currentVal < benchmarkNum)
                                ? "Less than " + benchmarkNum
                                : "Equal to " + benchmarkNum;

                    System.out.println("Result: " + compare);
                    break;

                case 5:
                    System.out.println("Operation: Increment");

                    currentVal++;
                    System.out.println("Updated Number: " + currentVal);
                    break;

                case 6:
                    System.out.println("Operation: Decrement");

                    currentVal--;
                    System.out.println("Updated Number: " + currentVal);
                    break;

                case 7:
                    System.out.println("Operation: Change Sign");

                    currentVal = -currentVal;
                    System.out.println("Updated Number: " + currentVal);
                    break;

                case 8:
                    System.out.println("Operation: Exit");
                    System.out.println("Number Analyser Closed.");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println();
            step++;

        } while (isRunning && step < operationSequence.length);

    }
}