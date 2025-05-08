import java.util.List;
import java.util.LinkedList;

public class Hackaton extends Evento {
   private List<String> listaMentores;
   private String descricao;
   private int qtdAlunosGrupo;

    public Hackaton(String titulo, String nomeProfessorResponsavel, int numParticipantes, List<String> listaMentores, String descricao, int qtdAlunosGrupo) {
        super(titulo, nomeProfessorResponsavel, numParticipantes);
        this.listaMentores = listaMentores;
        this.descricao = descricao;
        this.qtdAlunosGrupo = qtdAlunosGrupo;
    }

    public List<String> getListaMentores() {
        List<String> clone = new LinkedList<String>(this.listaMentores);
        for (String mentor : this.listaMentores) {      
            clone.add(mentor);   
        }
        return clone;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtdAlunosGrupo() {
        return qtdAlunosGrupo;
    }

    public String toString() {
        return super.toString() + "Evento Hackaton:\nMentores: " + this.getListaMentores() + "\nDescrição: " + this.getDescricao() + "\nQuantidade de Alunos por Grupo: " + this.getQtdAlunosGrupo();
    }

}
