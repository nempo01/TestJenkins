package sample.java.project;

public class SampleJavaProject implements Runnable {

    /** The delay between printed messages. */
    private static final long PRINT_DELAY = 1000L;

      /**
     * Print the "Hello, world!" string.
     * @param args application input arguments
     */
    public static void main(final String[] args) {
        /* Parse command line arguments. */
        SampleJavaProject sjp = new SampleJavaProject();     

        sjp.run();
    }

    /**
     * Print the "Hello, world!" string.
     */
    public final void sayHello() {
        System.out.printf("Hello, %s!%n");
    }

    @Override
    public final void run() {       
            sayHello();
            try {
                Thread.sleep(PRINT_DELAY);
            } catch (Exception e) {
                return;
            }
        
    }
}
