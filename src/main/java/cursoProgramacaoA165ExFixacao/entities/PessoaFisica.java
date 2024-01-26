package cursoProgramacaoA165ExFixacao.entities;

public class PessoaFisica extends Contribuinte {
    private Double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double taxa() {

 // double impostoAPagar = (getRendaAnual() < 20000.00) ?  impostoAPagar = getRendaAnual() * 0.25:  impostoAPagar = getRendaAnual() * 0.25;

        double impostoAPagar;

        if (getRendaAnual() < 20000.00){
            impostoAPagar = getRendaAnual() * 0.15;
        }
        else{
            impostoAPagar = getRendaAnual() * 0.25;
        }
        impostoAPagar -= (gastosComSaude * 0.5);

        if (impostoAPagar < 0.00){
            return 0.00;
        }
        return impostoAPagar;

    }
}

