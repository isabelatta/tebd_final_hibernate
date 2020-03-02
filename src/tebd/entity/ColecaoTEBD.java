/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebd.entity;


import java.util.*;
import tebd.util.HibernateUtil;

/**
 *
 * @author isabelatta
 */
public class ColecaoTEBD {
    
    private ArtigoDAO artigoDAO;
    
    public ColecaoTEBD() throws Exception{
        artigoDAO = new ArtigoDAO();
    }
        
    public void AdicionarArtigo()throws Exception{
        Artigo artigo = null;
        System.out.println("Adicionar Artigo:");
        System.out.println("-------------------");
        System.out.println("Resumo do Artigo: ");
        String resumo = Console.readLine();
        artigo = new Artigo();
        artigo.setResumo(resumo);
        artigo.setCreatedAt(new Date());
        artigo.setUpdatedAt(new Date());
        String msg = artigoDAO.addArtigo(artigo);
        System.out.println(msg);
    }
    
    public static void main(String args[]){

        try {
            ColecaoTEBD ca = new ColecaoTEBD();
            ca.AdicionarArtigo();
            System.exit(0);
            HibernateUtil.shutdown();
        }catch(Exception e){
            e.printStackTrace();
        }	
    }
}
