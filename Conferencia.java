import java.util.*;

public class Conferencia {
    private String nome;
    private Map<String, Palestra> palestras;

    public Conferencia(String nome) {
        this.nome = nome;
        this.palestras = new HashMap<>();
    }

    public void adicionarPalestra(Palestra palestra) {
        String Titulo = palestra.getTitulo();
        palestras.put(Titulo, palestra);
    }

    public Set<Palestra> encontrarPalestrasPorPalestrante(String cpf) {
        Set<Palestra> palestrasDoPalestrante = new HashSet<>();
        for (Palestra palestra : palestras.values()) {
            Palestrante palestrante = palestra.getPalestrante();
            if (palestrante != null && palestrante.getCPF().equals(cpf)) {
                palestrasDoPalestrante.add(palestra);
            }
        }
        return palestrasDoPalestrante;
    }

    public Set<Palestra> encontrarPalestrasPorTopico(String topico) {
        Set<Palestra> palestrasPorTopico = new HashSet<>();
        for (Palestra palestra : palestras.values()) {
            if (palestra.getTopico().equals(topico)) {
                palestrasPorTopico.add(palestra);
            }
        }
        return palestrasPorTopico;
    }
}
