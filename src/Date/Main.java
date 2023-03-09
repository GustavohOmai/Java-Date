package Date;

public class Main {



    public static void main(String[] args) {
        Date validacao = new Date(29,2,2003);

        System.out.println(validacao.isBissexto(validacao.getAno()));
    }
}
