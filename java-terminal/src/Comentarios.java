public class Comentarios {

    public static void main(String[] args) {

    }

    public int somaMultiplica(int n, int x, String m) {

        int r;

        if ("M".equals(m)) {
            r = n * x;
        } else {
            r = n + x;
        }

        return r;
    }
}