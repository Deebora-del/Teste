public class Condutor {
    //Condutor(nroCnh, dataEmissao, orgaoEmissor, pontuacao, Veiculo)
    private int nroCnh;
    private String orgaoEmissor;
    private int Pontuacao;
    private Veiculo veiculo;

    public void setNroCnh(int nroCnh){
       this.nroCnh = nroCnh;

    }
        
    public int getNroCnh(){
        return this.nroCnh;
    }
}
