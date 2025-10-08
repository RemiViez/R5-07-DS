public class Q3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Q3 <nombre de termes>");
            return;
        }
        int N = Integer.parseInt(args[0]);
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}