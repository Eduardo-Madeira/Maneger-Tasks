package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarefa {
    private String titulo;
    private LocalDate dataEntrega;
    private LocalDate dataConclusao;
    private Categoria categoria;
    private ArrayList<Pessoas> responsaveis;

    public Tarefa(String titulo, LocalDate dataEntrega, LocalDate dataConclusao, Categoria categoria) {
        this.titulo = titulo;
        this.dataEntrega = dataEntrega;
        this.dataConclusao = dataConclusao;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public ArrayList<Pessoas> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(ArrayList<Pessoas> responsaveis) {
        this.responsaveis = responsaveis;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", dataEntrega=" + dataEntrega +
                ", dataConclusao=" + dataConclusao +
                ", categoria=" + categoria +
                ", responsaveis=" + responsaveis +
                '}';
    }
}
