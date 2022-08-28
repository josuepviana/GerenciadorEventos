package com.eventoapp.eventoapp.models;

<<<<<<< HEAD
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a

@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
    private Long codigo;
=======
    private long codigo;
>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a

    private String nome;
    private String ministrador;
    private String local;
    private String data;
    private String horarioInicio;
    private String horarioFim;

<<<<<<< HEAD
    @OneToMany
    private List<Convidado> convidados;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }



=======
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

>>>>>>> d8f89d01ae4f162fbf64f9862e1c1d5569002c0a
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMinistrador() {
        return ministrador;
    }

    public void setMinistrador(String ministrador) {
        this.ministrador = ministrador;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }
}
