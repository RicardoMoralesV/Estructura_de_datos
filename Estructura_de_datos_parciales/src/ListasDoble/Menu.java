package ListasDoble;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txttipo;
	private JTextField txtcancion;
	private JTextField txtautor;
	private JTextField txtalbum;
	private JTextField txtid;
	
	ListaDoble ld=new ListaDoble();
	private JTextField txtresul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Insertar nodo adelante");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				musica nuevo=new musica();
				
				nuevo.setId(txtid.getText());
				nuevo.setAlbum(txtalbum.getText());
				nuevo.setAutor(txtautor.getText());
				nuevo.setCancion(txtcancion.getText());
				nuevo.setTipo(txttipo.getText());
				
				
			ld.insertarnodoadelante(nuevo);
			JOptionPane.showMessageDialog(null,"Valores insertados adelante");
			
				txtid.setText("");
				txtalbum.setText("");
				txtautor.setText("");
				txtcancion.setText("");
				txttipo.setText("");
			}
		});
		btnNewButton.setBounds(63, 57, 162, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insertar nodo atras");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				musica nuevo=new musica();
				
				nuevo.setId(txtid.getText());
				nuevo.setAlbum(txtalbum.getText());
				nuevo.setAutor(txtautor.getText());
				nuevo.setCancion(txtcancion.getText());
				nuevo.setTipo(txttipo.getText());
				
				ld.insertarnodoatras(nuevo);
				JOptionPane.showMessageDialog(null,"Valores insertados adelante");
				
				txtid.setText("");
				txtalbum.setText("");
				txtautor.setText("");
				txtcancion.setText("");
				txttipo.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(63, 91, 162, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar primer nodo");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x=JOptionPane.showConfirmDialog(null,"Desea eliminar este valor de la primera posicion" );
				if(JOptionPane.YES_OPTION==1){
				ld.eliminarprimernodo();
				JOptionPane.showMessageDialog(null,"Valor eliminado de la primera posicion");
				}
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(63, 125, 162, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar ultimo nodo");
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x=JOptionPane.showConfirmDialog(null,"Desea eliminar este valor de la ultima posicion" );
				if(JOptionPane.YES_OPTION==1){
				ld.eliminarultimonodo();
				JOptionPane.showMessageDialog(null,"Valor eliminado de la ultima posicion");
				}
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setBounds(63, 159, 162, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Recorrido hacia adelante");
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtresul.setText(ld.recorrerhaciaadelante().toString());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_4.setBackground(Color.CYAN);
		btnNewButton_4.setBounds(63, 228, 162, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Recorrido hacia atras");
		btnNewButton_5.setForeground(Color.RED);
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				txtresul.setText(ld.recorrerhaciaatras().toString());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_5.setBackground(Color.CYAN);
		btnNewButton_5.setBounds(63, 194, 162, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("Salir");
		btnNewButton_8.setForeground(Color.RED);
		btnNewButton_8.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_8.setBackground(Color.CYAN);
		btnNewButton_8.setBounds(63, 262, 162, 23);
		contentPane.add(btnNewButton_8);
		
		txttipo = new JTextField();
		txttipo.setForeground(Color.BLUE);
		txttipo.setBackground(Color.CYAN);
		txttipo.setBounds(449, 117, 162, 31);
		contentPane.add(txttipo);
		txttipo.setColumns(10);
		
		JLabel lblIngreseElDato = new JLabel("Ingrese el tipo de cancion");
		lblIngreseElDato.setForeground(Color.RED);
		lblIngreseElDato.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElDato.setBounds(449, 101, 192, 14);
		contentPane.add(lblIngreseElDato);
		
		txtcancion = new JTextField();
		txtcancion.setForeground(Color.BLUE);
		txtcancion.setBackground(Color.CYAN);
		txtcancion.setColumns(10);
		txtcancion.setBounds(449, 173, 162, 31);
		contentPane.add(txtcancion);
		
		JLabel lblIngreseElGenero = new JLabel("Ingrese el cancion");
		lblIngreseElGenero.setForeground(Color.RED);
		lblIngreseElGenero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElGenero.setBounds(449, 158, 162, 14);
		contentPane.add(lblIngreseElGenero);
		
		txtautor = new JTextField();
		txtautor.setForeground(Color.BLUE);
		txtautor.setBackground(Color.CYAN);
		txtautor.setColumns(10);
		txtautor.setBounds(449, 281, 162, 31);
		contentPane.add(txtautor);
		
		txtalbum = new JTextField();
		txtalbum.setForeground(Color.BLUE);
		txtalbum.setBackground(Color.CYAN);
		txtalbum.setColumns(10);
		txtalbum.setBounds(449, 229, 162, 31);
		contentPane.add(txtalbum);
		
		JLabel lblIngreseElAutor = new JLabel("Ingrese el autor");
		lblIngreseElAutor.setForeground(Color.RED);
		lblIngreseElAutor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElAutor.setBounds(449, 265, 162, 14);
		contentPane.add(lblIngreseElAutor);
		
		JLabel lblIngreseElAlbum = new JLabel("Ingrese el album");
		lblIngreseElAlbum.setForeground(Color.RED);
		lblIngreseElAlbum.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElAlbum.setBounds(449, 215, 162, 14);
		contentPane.add(lblIngreseElAlbum);
		
		txtid = new JTextField();
		txtid.setForeground(Color.BLUE);
		txtid.setBackground(Color.CYAN);
		txtid.setColumns(10);
		txtid.setBounds(449, 64, 162, 31);
		contentPane.add(txtid);
		
		JLabel lblIngreseElId = new JLabel("Ingrese el id");
		lblIngreseElId.setForeground(Color.RED);
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElId.setBounds(449, 49, 162, 14);
		contentPane.add(lblIngreseElId);
		
		txtresul = new JTextField();
		txtresul.setForeground(Color.RED);
		txtresul.setBackground(Color.CYAN);
		txtresul.setBounds(0, 356, 641, 55);
		contentPane.add(txtresul);
		txtresul.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ricardo Morales\\workspace\\Estructura_datos\\imagen\\Fondo negro relieve verde.jpg"));
		lblNewLabel.setBounds(0, -128, 641, 598);
		contentPane.add(lblNewLabel);
	}
}
