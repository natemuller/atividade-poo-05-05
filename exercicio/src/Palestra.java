public class Palestra extends Evento {
   private String nomePalestrante;
   private String titulo;
   private String biografia;

   public Palestra(String titulo, String nomeProfessorResponsavel, int numParticipantes, String nomePalestrante, String biografia) {
       super(titulo, nomeProfessorResponsavel, numParticipantes);
       this.titulo = titulo;
       this.nomePalestrante = nomePalestrante;
       this.biografia = biografia;
   }

   public String getNomePalestrante() {
       return nomePalestrante;
   }

   public String getBiografia() {
       return biografia;
   }

   public String getTitulo() {
       return titulo;
   }

   public String toString() {
       return super.toString() + "Evento Palestra:\nPalestrante: " + this.getNomePalestrante() + "\nBiografia: " + this.getBiografia() + "\nTítulo: " + this.getTitulo();
   }
}
