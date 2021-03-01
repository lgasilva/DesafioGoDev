
package desafio;

/**
 *
 * @author lgasi
 */
public class Pessoa {
    private String nome;
    private String sobrenome; 
    private int totalPessoa;


    public Pessoa(String nome, String Sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        totalPessoa++;
               
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
        public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTotal() {
        return totalPessoa;
    }

    public void setTotal(int total) {
        this.totalPessoa = total;
    }
    
    
    
    
}

