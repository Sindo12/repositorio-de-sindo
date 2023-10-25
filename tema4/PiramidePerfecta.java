public class PiramidePerfecta {
    public static void main(String[] args) {
        String s = "",s2 = "";

        for (int i = 1; i < 10; i++){
            s += i;
            System.out.printf("%9s", s);
                for (int k = i; k >= 10; k++){
                s2 += k;
                System.out.printf("%-9s", s2);
                }
                System.out.printf("\n");
        }
        
    }
}   