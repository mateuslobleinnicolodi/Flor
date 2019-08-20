/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Flor;

/**
 *
 * @author Administrador
 */
public class DaoFlor {
    public static boolean inserir(Flor objeto) {
        String sql = "INSERT INTO Flor (nome_cientifico, nome_popular, tamanho_petala, tamanho_sepala, ano) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_cientifico());
            ps.setString(2, objeto.getNome_popular());
            ps.setDouble(3, objeto.getTamanho_petala());
            ps.setDouble(4, objeto.getTamanho_sepala());
            ps.setInt(5, objeto.getAno());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        Flor objeto = new Flor();
        objeto.setNome_cientifico("Teste");
        objeto.setNome_popular("Testi");
        objeto.setTamanho_petala(3.5);
        objeto.setTamanho_sepala(1.3);
        objeto.setAno(2018);
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
    public static boolean alterar(Flor objeto) {
        String sql = "UPDATE Flor SET nome_cientifico = ?, nome_popular = ?, tamanho_petala = ?, tamanho_sepala = ?, ano = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_cientifico()); 
            ps.setString(2, objeto.getNome_popular());
            ps.setDouble(3, objeto.getTamanho_petala());
            ps.setDouble(4, objeto.getTamanho_sepala());
            ps.setInt(5, objeto.getAno());
            ps.setInt(6, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean excluir(Flor objeto) {
        String sql = "DELETE FROM Flor WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
