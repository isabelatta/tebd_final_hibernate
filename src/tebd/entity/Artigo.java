package tebd.entity;
// Generated 02/03/2020 10:02:00 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Artigo generated by hbm2java
 */
public class Artigo  implements java.io.Serializable {


     private Integer id;
     private String resumo;
     private Date createdAt;
     private Date updatedAt;
     private Date deletedAt;
     private Set revisaos = new HashSet(0);
     private Set autorArtigos = new HashSet(0);

    public Artigo() {
    }

	
    public Artigo(String resumo, Date createdAt, Date updatedAt) {
        this.resumo = resumo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Artigo(String resumo, Date createdAt, Date updatedAt, Date deletedAt, Set revisaos, Set autorArtigos) {
       this.resumo = resumo;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.deletedAt = deletedAt;
       this.revisaos = revisaos;
       this.autorArtigos = autorArtigos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getResumo() {
        return this.resumo;
    }
    
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Date getDeletedAt() {
        return this.deletedAt;
    }
    
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
    public Set getRevisaos() {
        return this.revisaos;
    }
    
    public void setRevisaos(Set revisaos) {
        this.revisaos = revisaos;
    }
    public Set getAutorArtigos() {
        return this.autorArtigos;
    }
    
    public void setAutorArtigos(Set autorArtigos) {
        this.autorArtigos = autorArtigos;
    }




}


