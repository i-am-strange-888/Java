public class ExceptionHandling_3 {
    static String str = null;

    public static void main(String[] args) {
        try {
            String upprcase = str.toUpperCase();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}