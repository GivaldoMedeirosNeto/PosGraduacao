package model;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class AlunosGUI extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel painel;
	
	private JTextField txtRM;
	private JTextField txtNome;
	private JTextField txtCurso;
	
	private JLabel lblRM;
	private JLabel lblNome;
	private JLabel lblCurso;
	private JLabel lblPeriodo;
	
	private JList<Aluno> alunos;
	private JScrollPane scrool;
	private JComboBox<String> cmbPeriodo;
	private String[] periodo = {"MATUTINO", "VESPERTINO", "NOTURNO"};
	
	private JButton btnEnviar;
	private JButton btnListar;
	private JButton btnFechar;
	
	public AlunosGUI() {
		super("Cadastro de Alunos");
		
		painel = new JPanel();
		this.setContentPane(painel);
		painel.setLayout(null);
		this.setBounds(100, 100, 600, 250);
		
		lblRM = new JLabel("RM:");
		lblRM.setBounds(10, 10, 70, 20);
		painel.add(lblRM);
		
		txtRM = new JTextField();
		txtRM.setBounds(70, 10, 100, 20);
		painel.add(txtRM);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 32, 100, 20);
		painel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(70, 32, 266, 20);
		painel.add(txtNome);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(10, 54, 100, 20);
		painel.add(lblCurso);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(70, 54, 100, 20);
		painel.add(txtCurso);
		
		lblPeriodo = new JLabel("Período:");
		lblPeriodo.setBounds(175, 54, 100, 20);
		painel.add(lblPeriodo);
		
		cmbPeriodo = new JComboBox<String>(periodo);
		cmbPeriodo.setBounds(235, 54, 100, 20);
		painel.add(cmbPeriodo);
		
		scrool = new JScrollPane();
		scrool.setBounds(350, 10, 200, 150);
		painel.add(scrool);
		
		alunos = new JList<Aluno>();
		alunos.setBounds(350, 10, 200, 150);
		scrool.setViewportView(alunos);
		painel.add(alunos);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(10, 112, 90, 25);
		painel.add(btnEnviar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(105, 112, 90, 25);
		painel.add(btnListar);
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBounds(200, 112, 90, 25);
		painel.add(btnFechar);
		
	}
	
}
