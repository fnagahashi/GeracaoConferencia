import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Palestra {
    private String topico;
    private String titulo;
    private LocalDate dia;
    private LocalTime horaInicio;
    private LocalTime horaTermino;
    private Set<Participantes> participantes = new HashSet<>();
    private Palestrante palestrante;

public Palestra(String topico, String titulo, LocalDate dia, LocalTime horaInicio, LocalTime horaTermino) {
        this.topico = topico;
        this.titulo = titulo;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.palestrante = palestrante;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(LocalTime horaTermino) {
        this.horaTermino = horaTermino;
    }
    public boolean addParticipante(Participantes participante) {
        return participantes.add(participante);
    }
}
