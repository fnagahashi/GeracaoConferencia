import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate dia = LocalDate.of(2024, 1, 5);
        LocalDate dia2 = LocalDate.of(2024, 2, 5);
        LocalTime horaInicio = LocalTime.of(9, 0);
        LocalTime horaTermino = LocalTime.of(10, 30);
        LocalTime horaInicio2 = LocalTime.of(12, 30);
        LocalTime horaTermino2 = LocalTime.of(14, 0);
        Palestrante palestrante1 = new Palestrante("123456789", "Fulano", "Inteligência Artificial");
        Palestrante palestrante2 = new Palestrante("987654321", "Ciclano", "Machine Learning");

        Palestra palestra1 = new Palestra("IA", "Introdução à Inteligência Artificial", dia, horaInicio, horaTermino, palestrante1);
        Palestra palestra2 = new Palestra("ML", "Machine Learning Avançado", dia2 , horaInicio2, horaTermino2, palestrante2);
        Palestra palestra3 = new Palestra("UML", "UML para Iniciantes", dia2 , horaInicio2, horaTermino2, palestrante1);

        Participantes participante1 = new Participantes("Alice", "alice@example.com");
        Participantes participante2 = new Participantes("Bob", "bob@example.com");

        Conferencia conferencia = new Conferencia("Conferência de Tecnologia");
        palestra1.adicionarParticipante(participante1);
        palestra1.adicionarParticipante(participante2);

        palestra2.adicionarParticipante(participante2);
        palestra2.adicionarParticipante(participante2);

        conferencia.adicionarPalestra(palestra1);
        conferencia.adicionarPalestra(palestra2);
        conferencia.adicionarPalestra(palestra3);

        System.out.println("Palestras sobre IA:");
        Set<Palestra> palestrasIA = conferencia.encontrarPalestrasPorTopico("IA");
        for (Palestra palestra : palestrasIA) {
            System.out.println("- " + palestra.getTitulo());
        }

        System.out.println("Palestras do palestrante Fulano:");
        Set<Palestra> palestrasFulano = conferencia.encontrarPalestrasPorPalestrante("123456789");
        for (Palestra palestra : palestrasFulano) {
            System.out.println("- " + palestra.getTitulo());
        }
    }
}