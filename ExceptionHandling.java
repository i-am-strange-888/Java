public class ExceptionHandling {
    static int a = 0, b = 1, c;
    public static void main(String[] args) {

        try {
            c = b/a; 
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

}