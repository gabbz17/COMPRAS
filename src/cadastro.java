public class cadastro {

    private String nome = "Gabriel";
    private String senha = "1606";
    private String email;
    private String numero;

    /*
     * public cadastro(String nome, String senha, String email, String numero){
     * this.nome = nome;
     * this.senha = senha;
     * this.email = email;
     * this.numero = numero;
     * }
     */

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getsenha() {
        return senha;
    }

    public void setsenha(String senha) {
        this.senha = senha;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getnumero() {
        return numero;
    }

    public void setnumero(String numero) {
        this.numero = numero;
    }

}
