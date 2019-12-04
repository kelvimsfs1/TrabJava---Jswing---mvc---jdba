package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import controller.ControlFuncionario;
import model.Funcionario;

public class ViewFuncionario extends JFrame{

	private ControlFuncionario control = new ControlFuncionario(this);
    private JTextField CadFuncNome;
    private JTextField CadFuncIdade;
    private JTextField CadFuncCpf;
    private JTextField CadFuncEmail;
    private JTextField ConPesquisarId;
    
	
	public ViewFuncionario() {
		JPanel painel = new JPanel();



		setTitle("Tela de Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		add(painel);
		configureMenu();
		show();


	}

	public Funcionario getFuncionairo() {
		String nome =  CadFuncNome.getText();
		int idade = Integer.parseInt(CadFuncIdade.getText());
		int cpf = Integer.parseInt(CadFuncCpf.getText());
		String email = CadFuncEmail.getText();
		int id = Integer.parseInt(ConPesquisarId.getText());
		Funcionario funcionario = new Funcionario(nome,idade,cpf,email,id);
		return funcionario;
		
		
	}

	
	////
	private void configureMenu() {
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);

		JMenu menu1 = new JMenu("Arquivo");
		JMenu menu2 = new JMenu("Editar");
		JMenu menu3 = new JMenu("Ajuda");
		JMenuItem teste = new JMenuItem("Arquivo1", KeyEvent.VK_S);
		JMenuItem teste1 = new JMenuItem("Conteúdo Editado", KeyEvent.VK_S);
		JMenuItem teste2 = new JMenuItem("Material de Ajuda", KeyEvent.VK_S);
		menu1.add(teste);
		menu2.add(teste1);
		menu3.add(teste2);

		JPanel ConsultarFuncionario = new JPanel();
		ConsultarFuncionario.setLayout(null);
		ConsultarFuncionario.setPreferredSize(new Dimension(300,300));

		JPanel CadastrarFuncionario = new JPanel();
		CadastrarFuncionario.setLayout(null);
		CadastrarFuncionario.setPreferredSize(new Dimension(300,300));



		JTabbedPane tab = new JTabbedPane();

		tab.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

		ConsultarFuncionario.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com titulo
				,BorderFactory.createTitledBorder("Consultar Funcionario")));


		CadastrarFuncionario.setBorder(BorderFactory.createCompoundBorder(
				// Margem
				BorderFactory.createEmptyBorder(20, 20, 20, 20)
				// Com titulo
				,BorderFactory.createTitledBorder("Cadastrar Funcionario")));



		tab.addTab("Cadastrar Funcionarios", CadastrarFuncionario);


		ConPesquisarId = new JTextField();
		ConPesquisarId.setBounds(150, 80, 50, 20);


	    CadFuncNome = new JTextField();
		CadFuncNome.setBounds(150, 120, 150, 20);

	    CadFuncIdade = new JTextField();
		CadFuncIdade.setBounds(150, 160, 150, 20);

	    CadFuncCpf = new JTextField();
		CadFuncCpf.setBounds(150, 200, 150, 20);

	    CadFuncEmail = new JTextField();
		CadFuncEmail.setBounds(150, 240, 150, 20);


		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(170, 280, 100, 20);
		cadastrar.setName("cadastrar");
		

		JButton alterar = new JButton("Consultar");
		alterar.setBounds(120, 280, 100, 20);
		alterar.setName("alterar");

		JButton excluir = new JButton("Excluir");
		excluir.setBounds(230, 280, 100, 20);
		excluir.setName("excluir");
		



		JLabel labelPesqId1 = new JLabel("Id");
		labelPesqId1.setBounds(120, 80, 40, 20);

		JLabel labelConFunc = new JLabel("Nome");
		labelConFunc.setBounds(100, 120, 40, 20);

		JLabel labelConFunc1 = new JLabel("Idade");
		labelConFunc1.setBounds(100, 160, 40, 20);

		JLabel labelConFunc2 = new JLabel("cpf");
		labelConFunc2.setBounds(100, 200, 40, 20);

		JLabel labelConFunc3 = new JLabel("Email");
		labelConFunc3.setBounds(100, 240, 40, 20);
        
		
		CadastrarFuncionario.add(labelPesqId1);
		CadastrarFuncionario.add(ConPesquisarId);
		CadastrarFuncionario.add(CadFuncNome);
		CadastrarFuncionario.add(CadFuncIdade);
		CadastrarFuncionario.add(CadFuncCpf);
		CadastrarFuncionario.add(CadFuncEmail);
		CadastrarFuncionario.add(cadastrar);
		CadastrarFuncionario.add(labelConFunc);
		CadastrarFuncionario.add(labelConFunc1);
		CadastrarFuncionario.add(labelConFunc2);
		CadastrarFuncionario.add(labelConFunc3);



		


		add(tab);
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
	}



		


	}





