package Date;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    private boolean bissexto;

    public Date(int dia, int mes, int ano) {
        if (validarMes(mes)==true){
            this.mes = mes;
        }else {
            System.out.println("Mês Inválido");
        }
        if (validarAno(ano)==true){
            this.ano = ano;
        }else {
            System.out.println("Ano Inválido");
        }
        if (validarDia(dia, mes, ano)==true){
            this.dia = dia;
        }else {
            System.out.println("Dia Inválido");
        }
    }

    private boolean validarDia(int dia, int mes, int ano) {
        if (dia==31 && (mes== 1 || mes== 3 || mes== 5 || mes== 7 || mes== 8 || mes== 10 || mes== 12)){
            return true;
        } else if (dia <= 28 && mes==2 && isBissexto(ano)==false) {
            return true;
        } else if (dia<=29 && mes==2 && isBissexto(ano)==true) {
            return true;
        } else if (dia<=30 && mes!=2) {
            return true;
        }
        else if (dia<1 ) {
            return false;
        }
        return false;
    }

    private boolean validarMes(int mes){
        if (mes>12 || mes<1){
            return false;
        }
        return true;
    }

    private boolean validarAno(int ano){
        if (ano<1){
            return false;
        }
        return true;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto(int ano) {
        boolean isBissexto = false;
        if (ano % 400 == 0) {
            return isBissexto = true;
        }
        if (ano % 4 == 0 && ano % 100 != 0) {
            return isBissexto = true;
        }
        return isBissexto;
    }

}
