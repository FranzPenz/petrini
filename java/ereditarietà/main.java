package java.ereditarietà;

public class main {
    public static void main(String[] args) {
        Lavoratore capo = new Capo ("Francesco", "Bagnaia");
        Fattorino [] fattorini = {
            new Fattorino ("Marc", "Marquez"),
            new Fattorino ("Jorge", "Martin"),
            new Fattorino ("Marco", "Bezzecchi"),
            new Fattorino ("Luca", "Salvadori"),
        };
        Impiegato [] impiegati = {
            new Impiegato ("Jack", "Miller"),
            new Impiegato ("Franco", "Morbidelli"),
            new Impiegato ("Fabio", "Quartararo"),
            new Impiegato ("Luca", "Marini"),
            new Impiegato ("Miguel", "Oliveira"),
        };

        int giornilavorativi = 20; //esempio
        
        System.out.println("Stipendio del capo:");
        System.out.println(capo.getnome() + " " + capo.getcognome() + ": " + capo.stipendio(giornilavorativi) + "€");

        System.out.println("Stipendi dei fattorini:");
        for(int i = 0; i < fattorini.length; i++){
            Fattorino fattorino = fattorini[i];
            System.out.println(fattorino.getnome() + " " + fattorino.getcognome() + ": " + fattorino.stipendio(giornilavorativi) + "€");
        }

        System.out.println("Stipendi degli impiegati: ");
        for(int i = 0; i < impiegati.length; i++){
            Impiegato impiegato = impiegati[i];
            System.out.println(impiegato.getnome() + " " + impiegato.getcognome() + ": " + impiegato.stipendio(giornilavorativi) + "€");
        }
    }
}
