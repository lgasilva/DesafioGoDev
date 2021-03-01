
package desafio;

import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author lgasi
 */
public class SalaDeEventos {
   private String nome;
   private int lotacao; 
   private int totalSala;
   private Pessoa pessoa;
   private ArrayList<Pessoa> listaPessoaFase1 = new ArrayList<>();
   private ArrayList<Pessoa> listaPessoaFase2 = new ArrayList<>();
   
   
   
    public SalaDeEventos(String nome, int lotacaoMaxima) {
        this.nome = nome;
        this.lotacao = lotacaoMaxima;
        totalSala++;
    }

             
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLotacaoMaxima() {
        return lotacao;
    }

    public void setLotacaoMaxima(int lotacaoMaxima) {
        this.lotacao = lotacaoMaxima;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getTotalSala() {
        return totalSala;
    }

    public void setTotalSala(int totalSala) {
        this.totalSala = totalSala;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Pessoa> getListaPessoaFase1() {
        return listaPessoaFase1;
    }

    public void setListaPessoaFase1(ArrayList<Pessoa> listaPessoaFase1) {
        this.listaPessoaFase1 = listaPessoaFase1;
    }

    public ArrayList<Pessoa> getListaPessoaFase2() {
        return listaPessoaFase2;
    }

    public void setListaPessoaFase2(ArrayList<Pessoa> listaPessoaFase2) {
        this.listaPessoaFase2 = listaPessoaFase2;
    }
   
   
   
}
