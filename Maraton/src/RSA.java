public class RSA {

    public static void main(String[] args) {
        double[] ar = new double[5];
        double[] n = new double[5];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 10 + 1);
            n[i] = (Math.pow(ar[i], (double) 7)) % 33;
            System.out.println("ar[" + i + "]: " + ar[i]);

        }
        System.out.println("Encriptado");
        for (int i = 0; i < n.length; i++) {
            System.out.println("n[" + i + "]: " + n[i]);
        }
        System.out.println("Desencriptado");
        for (int i = 0; i < n.length; i++) {
            n[i] = (Math.pow(n[i], (double) 3)) % 33;
            System.out.println("n[" + i + "]: " + ar[i]);
        }
    }
}
