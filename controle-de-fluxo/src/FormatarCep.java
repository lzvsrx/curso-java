public class FormatarCep {

    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("O CEP informado é inválido.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {

        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return cep.substring(0, 2) + "."
                + cep.substring(2, 5) + "-"
                + cep.substring(5);
    }
}