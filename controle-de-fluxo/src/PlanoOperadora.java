public class PlanoOperadora {

    public static void main(String[] args) {

        String plano = "M";

        // Switch moderno
        switch (plano) {
            case "B" -> System.out.println(
                "Plano Básico de 100 minutos de ligação"
            );

            case "M" -> System.out.println(
                "Plano Médio de 200 minutos de ligação"
            );

            case "T" -> System.out.println(
                "Plano Top de 300 minutos de ligação"
            );

            default -> System.out.println(
                "Plano inválido!"
            );
        }

        // Outro exemplo
        plano = "T";

        switch (plano) {
            case "B" -> System.out.println(
                "Plano Básico de 100 minutos de ligação"
            );

            case "M" -> System.out.println(
                "5 GB e YouTube grátis"
            );

            case "T" -> System.out.println(
                "WhatsApp e Instagram grátis"
            );

            default -> System.out.println(
                "Plano inválido!"
            );
        }
    }
}