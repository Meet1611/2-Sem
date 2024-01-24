public class L46 {

    public static void main(String[] args) {
        int i = 0;
        while (i < args.length) {
            if (args[i].charAt(0) >= 'a' && args[i].charAt(0) <= 'z') {
                System.out.println("Error ! ");
                break;
            }
            System.out.println(args[i] + " ");
            i++;
        }
    }
}
