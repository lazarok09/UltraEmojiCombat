package aula07;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
        this.setAprovada(true);
        this.desafiado = l1;
        this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("==== RESULTADO DA LUTA =====");
            switch(vencedor) {
                case 0:
                System.out.println("Temos um empate!");
                desafiante.empatarLuta();
                desafiado.empatarLuta();
                break;   // Empate
                case 1:
                System.out.println("Lutador " + this.desafiado.getNome() + " venceu a luta");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;   // Desafiado vence
                case 2:
                System.out.println("Lutador " + this.desafiante.getNome() + " venceu a luta");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;   // Desafiante vence
            }
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    // getters and setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
