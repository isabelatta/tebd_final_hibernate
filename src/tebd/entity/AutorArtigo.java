package tebd.entity;
// Generated 02/03/2020 10:02:00 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AutorArtigo generated by hbm2java
 */
public class AutorArtigo  implements java.io.Serializable {


     private Integer id;
     private Artigo artigo;
     private Autor autor;
     private Date createdAt;
     private Date updatedAt;
     private Date deletedAt;

    public AutorArtigo() {
    }

	
    public AutorArtigo(Artigo artigo, Autor autor, Date createdAt, Date updatedAt) {
        this.artigo = artigo;
        this.autor = autor;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public AutorArtigo(Artigo artigo, Autor autor, Date createdAt, Date updatedAt, Date deletedAt) {
       this.artigo = artigo;
       this.autor = autor;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.deletedAt = deletedAt;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Artigo getArtigo() {
        return this.artigo;
    }
    
    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }
    public Autor getAutor() {
        return this.autor;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
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




}

