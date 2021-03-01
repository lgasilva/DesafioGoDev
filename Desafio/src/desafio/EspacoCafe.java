
package desafio;

import java.util.ArrayList;

/**
 *
 * @author lgasi
 */
public class EspacoCafe {
   private String nome;
   private int lotacao; 
   private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }

    public void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }
   private ArrayList<Pessoa> listaPessoa = new ArrayList<>();

    public EspacoCafe(String nome, int lotacaoMaxima) {
        this.nome = nome;
        this.lotacao = lotacaoMaxima;
    }
   
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
   
   
   
}
