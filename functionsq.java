public class functionsq {

    public static int[] change(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int a = 23;
        int b = 56;
        int[] swap = change(a, b);
        System.out.println(swap[0]);
        System.out.println(swap[1]);
    }
}



