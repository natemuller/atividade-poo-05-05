public abstract class Evento implements Comparable<Evento> {
    private static int codGeralSequencial = 0;
    private int codigo;
    private String titulo;
    private String nomeProfessorResponsavel;
    private int numParticipantes;

    public Evento(String titulo, String nomeProfessorResponsavel, int numParticipantes) {
        codGeralSequencial++;
        this.codigo = codigo;
        this.titulo = titulo;
        this.nomeProfessorResponsavel = nomeProfessorResponsavel;
        this.numParticipantes = numParticipantes;
    }

    public int getCodigo() {
        return codGeralSequencial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeProfessorResponsavel() {
        return nomeProfessorResponsavel;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public String toString() {
        return "Evento com dados:\nCódigo: " + codGeralSequencial + "\nTítulo: " + titulo + "\nProfessor Responsável: " + nomeProfessorResponsavel + "\nNúmero de Participantes: " + numParticipantes;
    }

    public int compareTo(Evento outroEvento) {
        return this.getCodigo() - outroEvento.getCodigo();
    }
}