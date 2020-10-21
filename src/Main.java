public class Main {

    public static void main(String[] args) {
        System.out.println(convertToString());
    }
    public static String convertToString() {
        char[] a = {'f', 'u', 'n'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }
        return sb.toString();
    }
}
