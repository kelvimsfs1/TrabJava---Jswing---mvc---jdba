package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Funcionario;

public class FuncionarioDAO {

	private Connection conn;

	public FuncionarioDAO() {
		dbconnect();

	}


	private void dbconnect() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoteste?user=root&password=root&useTimezone=true&serverTimezone=UTC");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public void insert(Funcionario funcionario) {
		String sql = "insert into funcionarios(nome,idade,cpf,email) values (?,?,?,?)";
		
		try {
			PreparedStatement prepInsert = conn.prepareStatement(sql);
			prepInsert.setString(1, funcionario.getNome());
			prepInsert.setInt(2, funcionario.getIdade());
			prepInsert.setInt(3, funcionario.getCpf());
			prepInsert.setString(4, funcionario.getEmail());
			prepInsert.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void atualizar(Funcionario funcionario) {
		String sql = "udpate  Funcionarios set (nome= ?, idade= ?, cpf= ?, email= ? where id =  ?) ";		
		try {
			PreparedStatement prepaAtualizar = conn.prepareStatement(sql);
			prepaAtualizar.setString(1, funcionario.getNome());
			prepaAtualizar.setInt(2, funcionario.getIdade());
			prepaAtualizar.setInt(3, funcionario.getCpf());
			prepaAtualizar.setString(4, funcionario.getEmail());
			prepaAtualizar.setInt(5, funcionario.getId());
			prepaAtualizar.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void deletar(Funcionario funcionario) {
		String sql = "delete * Funcionarios where nome =  ? and idade =  ? and cpf = ? and email = ? and where id =  ? ";		
		try {
			PreparedStatement prepaDeletar = conn.prepareStatement(sql);
			prepaDeletar.setString(1, funcionario.getNome());
			prepaDeletar.setInt(2, funcionario.getIdade());
			prepaDeletar.setInt(3, funcionario.getCpf());
			prepaDeletar.setString(4, funcionario.getEmail());
			prepaDeletar.setInt(5, funcionario.getId());
			prepaDeletar.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

    
}

