package edu.coursera.parallel;

import edu.rice.pcdp.PCDP;

import static edu.rice.pcdp.PCDP.async;

/**
 * A simple class for testing compilation of an PCDP project.
 */
public final class Setup {

    /**
     * Default constructor.
     */
    private Setup() {
    }

    /**
     * A simple method for testing compilation of an PCDP project.
     * @param val Input value
     * @return Dummy value
     */
    public static int setup(final int val) {
        final int[] result = new int[1];
        PCDP.finish(() -> {
            async(() -> {
                result[0] = val;
            });
        });
        return result[0];
    }
}
