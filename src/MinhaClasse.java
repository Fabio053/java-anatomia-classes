public class MinhaClasse {
    
    public static void main (String [] args ) {

        //System.out.print("Ola Mundo"); //Faz aparecer no terminal "Ola Mundo"

        String primeiroNome = "Fabio";
        String segundoNome = "Junior";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
