package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
	
	private JList<String> LstAlunos;
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
		lblRM.setBounds(10, 20, 70, 20);
		painel.add(lblRM);
		
		txtRM = new JTextField();
		txtRM.setBounds(70, 20, 100, 20);
		painel.add(txtRM);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 45, 100, 20);
		painel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(70, 45, 266, 20);
		painel.add(txtNome);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(10, 70, 100, 20);
		painel.add(lblCurso);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(70, 70, 100, 20);
		painel.add(txtCurso);
		
		lblPeriodo = new JLabel("Período:");
		lblPeriodo.setBounds(175, 70, 100, 20);
		painel.add(lblPeriodo);
		
		cmbPeriodo = new JComboBox<String>(periodo);
		cmbPeriodo.setBounds(235, 70, 100, 20);
		painel.add(cmbPeriodo);
		
		scrool = new JScrollPane();
		scrool.setBounds(350, 10, 200, 150);
		painel.add(scrool);
		
		LstAlunos = new JList<String>();
		LstAlunos.setBounds(350, 10, 200, 150);
		scrool.setViewportView(LstAlunos);
		painel.add(LstAlunos);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno(
					Integer.parseInt(txtRM.getText()),
					txtNome.getText(),
					txtCurso.getText(),
					(String) cmbPeriodo.getSelectedItem()
				);
				
				Aluno.alunos.add(aluno);
				
				JOptionPane.showMessageDialog(null, "Aluno incluido na lista");
				
			}
		});
		btnEnviar.setBounds(30, 112, 90, 25);
		painel.add(btnEnviar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = new DefaultListModel<String>();
				for (Aluno aluno : Aluno.alunos) {
					model.addElement(aluno.toString());
				}
			}
		});
		btnListar.setBounds(130, 112, 90, 25);
		painel.add(btnListar);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnFechar.setBounds(230, 112, 90, 25);
		painel.add(btnFechar);
		
	}
	
}
