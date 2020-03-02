/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebd.entity;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import tebd.util.HibernateUtil;

/**
 *
 * @author isabelatta
 */
public class ArtigoDAO {
 
    public ArtigoDAO() {
    }
        
    String addArtigo(Artigo artigo){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();

            session.save(artigo);

            session.getTransaction().commit();
            session.close();
            return "Artigo adicionado com sucesso";
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
            return "Ocorreu um erro inesperado";
        }
    }
}
