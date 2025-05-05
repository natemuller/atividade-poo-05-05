public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Oficina oficina = new Oficina("Oficina de Testes", "Fulano", 10, "Ciclano", "Descrição da Oficina");
        oficina.adicionarTecnologi("Java");
        oficina.adicionarTecnologi("Python");
        oficina.adicionarTecnologi("C#");
        System.out.println(oficina.toString());

        Evento evento = new Evento("Evento de Testes", "Fulano", 10);
        System.out.println(evento.toString());

        System.out.println(oficina.compareTo(evento));
        
        
    }
}
