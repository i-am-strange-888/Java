public class ExceptionHandling_2 {
    static String str = "mmc";

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(str);
            System.out.println(x);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}