package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.FuncionarioDAO;
import view.ViewFuncionario;

public class ControlFuncionario implements ActionListener{

	private ViewFuncionario view;
	public ControlFuncionario(ViewFuncionario view) {
		this.view = view;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Component comp = (Component)e.getSource();
		switch (comp.getName()) {
		case "cadastrar":
			FuncionarioDAO dao = new FuncionarioDAO();
			dao.insert(view.getFuncionairo());
			JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");

			break;
		case "excluir":
			FuncionarioDAO dao1 = new FuncionarioDAO();
			dao1.deletar(view.getFuncionairo());
			JOptionPane.showMessageDialog(null, "Excluido com Sucesso");

			break;
		case "alterar":
			FuncionarioDAO dao3 = new FuncionarioDAO();
			dao3.atualizar(view.getFuncionairo());
			JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

		default:
			break;
		}

	}



}
