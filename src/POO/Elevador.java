package POO;

public class Elevador{

    private int andarAtual;
    private int[] andarestotais;
    private int capacidade;
    private int pessoas;

    public Elevador( int andarestotais, int capacidade) {
        this.andarAtual = 0;
        this.andarestotais = new int[andarestotais];
        this.capacidade = capacidade;
        this.pessoas = 0;
    }
    public void Entrar(){
        if (pessoas < capacidade){
            pessoas++;
        }
        else{
            System.out.println("Elevador cheio!");
        }
    }
    public void Sair(){
        if(pessoas > 0){
            pessoas--;
        }
        else{
            System.out.println("O elevador está vazio!");
        }
    }
    public void Subir() {
        if (andarAtual < andarestotais.length) {
            andarAtual++;
        } else {
            System.out.println("Ultimo andar");
        }
    }
    public void Descer(){
        if(andarAtual > 0){
            andarAtual--;
        }
        else{

            System.out.println("Você está no terreo!");
        }
    }















    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int[] getAndarestotais() {
        return andarestotais;
    }

    public void setAndarestotais(int[] andarestotais) {
        this.andarestotais = andarestotais;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
}

