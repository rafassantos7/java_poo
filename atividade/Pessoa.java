public class Pessoa {
    private int idade;
    private String nome;
    private Sexo sexo;
    
    public Pessoa() {
    }

    public Pessoa(int idade, String nome, Sexo sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo ;
    }

    
}
