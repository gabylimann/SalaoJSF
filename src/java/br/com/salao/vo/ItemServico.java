package br.com.salao.vo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
/**
 *
 * @author Gabs
 */
public class ItemServico implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Servico servico;
    @OneToOne
    private OrdemServico ordemServico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.servico);
        hash = 17 * hash + Objects.hashCode(this.ordemServico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemServico other = (ItemServico) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        if (!Objects.equals(this.ordemServico, other.ordemServico)) {
            return false;
        }
        return true;
    }

    public String toString(){
    return servico.toString() + " - " + ordemServico.toString();
    }

    
}
