public class InverterString {
    public static void main(String[] args) {

        String textoOriginal = "Caderno";

        String textoInverso = "";

        for (int i=textoOriginal.length() - 1; i>=0; i--){
            textoInverso += textoOriginal.charAt(i);
        }

        System.out.println(textoInverso);

    }
}
