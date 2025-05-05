import java.util.LinkedList;
import java.util.List;

public class Oficina extends Evento {
    private String nomeMentor;
    private String descAtividades;
    private List<String> listaTecnologias;

    public Oficina(String titulo, String nomeProfessorResponsavel, int numParticipantes, String nomeMentor, String descAtividades) {
        super(titulo, nomeProfessorResponsavel, numParticipantes);
        this.nomeMentor = nomeMentor;
        this.descAtividades = descAtividades;
        this.listaTecnologias = new LinkedList<String>();

    }

    public String getNomeMentor() {
        return nomeMentor;
    }

    public String getDescAtividades() {
        return descAtividades;
    }

    public List getListaTecnologias() {
        return listaTecnologias;
    }

    public void adicionarTecnologi(String tecnologia) {
        this.listaTecnologias.add(tecnologia);
    }
}
