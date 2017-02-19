package edu.ashish.DAA; /******************************************************************************
 *  Compilation:  javac edu.ashish.DAA.Stopwatch.java
 *  Execution:    none
 *  Dependencies: none
 *
 *  A utility class to measure the running time (wall clock) of a
 *  program.
 *
 ******************************************************************************/

/**
 *  The <tt>edu.ashish.DAA.Stopwatch</tt> data type is for measuring
 *  the time that elapses between the start and end of a
 *  programming task (wall-clock time).
 *
 *  See { StopwatchCPU} for a version that measures CPU time.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */


public class Stopwatch {

    private final long start;

    /**
     * Initializes a new stopwatch.
     */
    public Stopwatch() {
        start = System.currentTimeMillis();
    }


    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }


    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.elapsedTime());
    }
}
