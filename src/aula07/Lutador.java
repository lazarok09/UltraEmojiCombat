package aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    // construtor 
   public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates, String sexo){
    this.setNome(nome);
    this.setNacionalidade(nacionalidade);
    this.setIdade(idade);
    this.setAltura(altura);
    this.setPeso(peso);
    this.setVitorias(vitorias);
    this.setDerrotas(derrotas);
    this.setEmpates(empates);
    this.setSexo(sexo);
   }
   public Lutador(){
   // with nothing cause maybe can be wrong.
   }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(this.getPeso());
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {
        if(peso >= 60 && peso <= 75) {
        this.categoria = "leve";
        } else if(peso > 75 && peso <= 91) { 
        this.categoria = "medio";
        } else if (peso >= 91){
        this.categoria = "pesado";
        } else {
            this.categoria = "inválido";
        }
    }

    private int getVitorias() {
        return this.vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = this.empates + empates;
    }
    // métodos públicos
    public void apresentar(){
         System.out.println("--Apresentacao--");
        System.out.println("Lutador: "+ this.getNome()); 
        System.out.println("Origem : "+ this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura()+ "m de altura");
        System.out.println("Pesando : " + this.getPeso() + "kg");
        System.out.println("Categoria : " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu : " + this.getDerrotas());
        System.out.println("Empatou : " + this.getEmpates());
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso " +this.getCategoria());
        System.out.println("Vitorias " + this.getVitorias());
        System.out.println("Derrotas " + this.getDerrotas());
        System.out.println("Empates " + this.getEmpates());
        
    }
    public void ganharLuta(){
        System.out.println("+1 uma vitória para " + this.getNome());
        this.setVitorias(this.getVitorias() + 1);
    }
    public void empatarLuta(){ 
        System.out.println("Empate");
        this.setEmpates(this.getEmpates() + 1);
    }
    public void perderLuta() {
        System.out.println(this.getNome() + " perdeu mais uma luta");
        this.setDerrotas(this.getDerrotas() + 1);
    }
}
