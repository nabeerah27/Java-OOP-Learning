package _08_Built_In_Classes;

public class _03_System_Class {
    public static void main(String[] args) {

        // System.out: standard output
        System.out.println("Hello, this is printed using System.out.println!");
        System.out.print("This is ");
        System.out.print("on the same line.\n");

        // System.currentTimeMillis(): current time in milliseconds
        long startTime = System.currentTimeMillis();
        System.out.println("Current time in milliseconds: " + startTime);

        // System.nanoTime(): high-resolution time (for measuring elapsed time)
        long startNano = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int temp = i * i;
        }
        long endNano = System.nanoTime();
        System.out.println("Time taken to run loop (nanoseconds): " + (endNano - startNano));

        // System.exit(): terminate the program
        // System.exit(0); // Uncomment to stop program execution

        // System.gc(): request garbage collection
        System.gc(); // Suggests JVM to run garbage collector

        // System.arraycopy(): copy elements between arrays
        int[] source = {1, 2, 3, 4, 5};
        int[] dest = new int[5];

        System.arraycopy(source, 0, dest, 0, source.length);

        System.out.println("Copied array using System.arraycopy: ");
        for (int num : dest)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        // Notes:
        // - System.out for output; System.in for input
        // - currentTimeMillis() and nanoTime() useful for performance measurement
        // - System.gc() suggests garbage collection
        // - System.exit(status) terminates program
        // - arraycopy() is efficient for copying arrays

    }
}
