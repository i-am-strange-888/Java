
class TotalNumOfOddNums {
    static int total = 0;
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                total++;
            }
        }
        System.out.println("The total number of odd numbers between 1 and 100 is: " + total);
    }

}
