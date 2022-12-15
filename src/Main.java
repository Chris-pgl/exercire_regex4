public class Main {
    public static void main(String[] args) {
        String s = "x3z ? xYz ! R1 && __";


        System.out.println(s.replaceAll("[a-z]","*"));
    }
}