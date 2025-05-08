import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Criação de eventos
        Oficina oficina1 = new Oficina("Oficina de Programação", "Professor João", 20, "Mentor Maria", "Desenvolvimento de aplicações web");
        Oficina oficina2 = new Oficina("Oficina de Petróleo", "Professor Pedro", 30, "Mentor Ana", "Desenvolvimento de aplicações para a indústria do petróleo");

        Palestra palestra1 = new Palestra("Palestra sobre Inteligência Artificial", "Professor Carlos", 40, "Palestrante João", "Especialista em IA");
        Palestra palestra2 = new Palestra("Palestra sobre Java", "Professor Maria", 50, "Palestrante Pedro", "Desenvolvimento de aplicações com Java");

        Hackaton hackaton1 = new Hackaton("Hackaton de Desenvolvimento de Jogos", "Professor Ana", 60, List.of("Mentor João", "Mentor Maria"), "Desenvolvimento de jogos em equipe", 5);
        Hackaton hackaton2 = new Hackaton("Hackaton de Desenvolvimento de Aplicações Web", "Professor Pedro", 70, List.of("Mentor Ana", "Mentor Carlos"), "Desenvolvimento de aplicações web em equipe", 5);

        // Adição de tecnologias à oficina
        oficina1.adicionarTecnologi("Java");
        oficina1.adicionarTecnologi("Python");
        oficina2.adicionarTecnologi("C#");
        oficina2.adicionarTecnologi("JavaScript");

        // Criação de uma coleção de eventos
        List<Evento> eventos = new ArrayList<>();
        eventos.add(oficina1);
        eventos.add(oficina2);
        eventos.add(palestra1);
        eventos.add(palestra2);
        eventos.add(hackaton1);
        eventos.add(hackaton2);

        // Impressão de todos os eventos
        System.out.println("Todos os eventos:");
        for (Evento evento : eventos) {
            System.out.println(evento.toString());
        }

        // Solicitação de um termo de busca ao usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um termo de busca: ");
        String termoDeBusca = scanner.nextLine();

        // Busca e impressão dos eventos que contenham o termo de busca
        System.out.println("Eventos que contenham o termo de busca:");
        for (Evento evento : eventos) {
            if (evento.toString().contains(termoDeBusca)) {
                System.out.println(evento.toString());
            }
        }
    }
}