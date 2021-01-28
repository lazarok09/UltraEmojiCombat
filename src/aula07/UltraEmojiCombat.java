package aula07;


public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador lutadores[] = new Lutador[10];
        lutadores[0] = new Lutador("Pretty Boy","França", 31, 1.75f, 68.9f, 11, 2, 1, "Masculino");
        lutadores[1] = new Lutador("Putscrip","Brasil", 29, 1.68f, 65.8f, 14, 2, 3, "Masculino");
        lutadores[2] = new Lutador("Snapshow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1, "Masculino");
        lutadores[3] = new Lutador("DeadCode", "Austrália", 28, 1.93f, 81.6f, 13, 0,2, "Masculino");
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3, "Masculino");
        lutadores[5] = new Lutador("Nerdad","EUA", 30, 1.81f, 105.07f, 12, 2, 4, "Masculino");
        // womans
        lutadores[6] = new Lutador("Hermione Granger", "INGLATERRA", 25, 1.70f, 60f, 5, 3, 1, "Feminino");
        lutadores[7] = new Lutador("Britany Spears", "EUA", 39, 1.63f, 63f, 12, 4, 2, "Feminino");
        Luta UFC = new Luta();
        UFC.marcarLuta(lutadores[6], lutadores[7]);
        UFC.lutar();

        
        
        
        
        
    }
    
}
