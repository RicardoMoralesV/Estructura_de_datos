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
		
		TextArea txtresul = new TextArea();
		txtresul.setFont(new Font("Arial Black", Font.ITALIC, 13));
		txtresul.setBackground(Color.CYAN);
		txtresul.setBounds(0, 291, 641, 110);
		contentPane.add(txtresul);
		
		
		JButton btninsertaradelante = new JButton("Insertar nodo adelante");
		btninsertaradelante.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btninsertaradelante.setBackground(Color.CYAN);
		btninsertaradelante.setForeground(Color.RED);
		btninsertaradelante.addActionListener(new ActionListener() {
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
		btninsertaradelante.setBounds(63, 57, 162, 23);
		contentPane.add(btninsertaradelante);
		
		JButton btninsertaratras = new JButton("Insertar nodo atras");
		btninsertaratras.setForeground(Color.RED);
		btninsertaratras.addMouseListener(new MouseAdapter() {
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
		btninsertaratras.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btninsertaratras.setBackground(Color.CYAN);
		btninsertaratras.setBounds(63, 91, 162, 23);
		contentPane.add(btninsertaratras);
		
		JButton btneliminarprimero = new JButton("Eliminar primer nodo");
		btneliminarprimero.setForeground(Color.RED);
		btneliminarprimero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int x=JOptionPane.showConfirmDialog(null,"Desea eliminar este valor de la primera posicion" );
				if(JOptionPane.YES_OPTION==x){
					
				ld.eliminarprimernodo();
				JOptionPane.showMessageDialog(null,"Valor eliminado de la primera posicion");
				txtresul.setText("");
				
				
				}
				
				
			}
		});
		btneliminarprimero.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btneliminarprimero.setBackground(Color.CYAN);
		btneliminarprimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btneliminarprimero.setBounds(63, 125, 162, 23);
		contentPane.add(btneliminarprimero);
		
		JButton btneliminarultimo = new JButton("Eliminar ultimo nodo");
		btneliminarultimo.setForeground(Color.RED);
		btneliminarultimo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int y=JOptionPane.showConfirmDialog(null,"Desea eliminar este valor de la primera posicion" );
				if(JOptionPane.YES_OPTION==y){
					
				ld.eliminarultimonodo();
				JOptionPane.showMessageDialog(null,"Valor eliminado de la ultima posicion");
				txtresul.setText("");
				
				
				
				}
			}
		});
		btneliminarultimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btneliminarultimo.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btneliminarultimo.setBackground(Color.CYAN);
		btneliminarultimo.setBounds(63, 159, 162, 23);
		contentPane.add(btneliminarultimo);
		
		JButton btnrecorridoadelante = new JButton("Recorrido hacia adelante");
		btnrecorridoadelante.setForeground(Color.RED);
		btnrecorridoadelante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtresul.setText(ld.recorrerhaciaadelante().toString());
			}
		});
		btnrecorridoadelante.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnrecorridoadelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnrecorridoadelante.setBackground(Color.CYAN);
		btnrecorridoadelante.setBounds(63, 228, 162, 23);
		contentPane.add(btnrecorridoadelante);
		
		JButton btnrecorridoatras = new JButton("Recorrido hacia atras");
		btnrecorridoatras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnrecorridoatras.setForeground(Color.RED);
		btnrecorridoatras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				txtresul.setText(ld.recorrerhaciaatras().toString());
			}
		});
		btnrecorridoatras.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnrecorridoatras.setBackground(Color.CYAN);
		btnrecorridoatras.setBounds(63, 194, 162, 23);
		contentPane.add(btnrecorridoatras);
		
		JButton btnsalir = new JButton("Salir");
		btnsalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnsalir.setForeground(Color.RED);
		btnsalir.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnsalir.setBackground(Color.CYAN);
		btnsalir.setBounds(249, 125, 162, 23);
		contentPane.add(btnsalir);
		
		txttipo = new JTextField();
		txttipo.setForeground(Color.BLUE);
		txttipo.setBackground(Color.CYAN);
		txttipo.setBounds(449, 83, 162, 31);
		contentPane.add(txttipo);
		txttipo.setColumns(10);
		
		JLabel lblIngreseElDato = new JLabel("Ingrese el tipo de cancion");
		lblIngreseElDato.setForeground(Color.RED);
		lblIngreseElDato.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElDato.setBounds(449, 61, 192, 14);
		contentPane.add(lblIngreseElDato);
		
		txtcancion = new JTextField();
		txtcancion.setForeground(Color.BLUE);
		txtcancion.setBackground(Color.CYAN);
		txtcancion.setColumns(10);
		txtcancion.setBounds(449, 139, 162, 31);
		contentPane.add(txtcancion);
		
		JLabel lblIngreseElGenero = new JLabel("Ingrese el cancion");
		lblIngreseElGenero.setForeground(Color.RED);
		lblIngreseElGenero.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElGenero.setBounds(449, 114, 162, 14);
		contentPane.add(lblIngreseElGenero);
		
		txtautor = new JTextField();
		txtautor.setForeground(Color.BLUE);
		txtautor.setBackground(Color.CYAN);
		txtautor.setColumns(10);
		txtautor.setBounds(449, 254, 162, 31);
		contentPane.add(txtautor);
		
		txtalbum = new JTextField();
		txtalbum.setForeground(Color.BLUE);
		txtalbum.setBackground(Color.CYAN);
		txtalbum.setColumns(10);
		txtalbum.setBounds(449, 195, 162, 31);
		contentPane.add(txtalbum);
		
		JLabel lblIngreseElAutor = new JLabel("Ingrese el autor");
		lblIngreseElAutor.setForeground(Color.RED);
		lblIngreseElAutor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElAutor.setBounds(449, 231, 162, 14);
		contentPane.add(lblIngreseElAutor);
		
		JLabel lblIngreseElAlbum = new JLabel("Ingrese el album");
		lblIngreseElAlbum.setForeground(Color.RED);
		lblIngreseElAlbum.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElAlbum.setBounds(449, 181, 162, 14);
		contentPane.add(lblIngreseElAlbum);
		
		txtid = new JTextField();
		txtid.setForeground(Color.BLUE);
		txtid.setBackground(Color.CYAN);
		txtid.setColumns(10);
		txtid.setBounds(449, 25, 162, 31);
		contentPane.add(txtid);
		
		JLabel lblIngreseElId = new JLabel("Ingrese el id");
		lblIngreseElId.setForeground(Color.RED);
		lblIngreseElId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIngreseElId.setBounds(449, 0, 162, 14);
		contentPane.add(lblIngreseElId);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				txtid.setText("");
				txtalbum.setText("");
				txtautor.setText("");
				txtcancion.setText("");
				txttipo.setText("");
				txtresul.setText("");
			
			}
		});
		btnLimpiar.setBounds(283, 92, 89, 23);
		contentPane.add(btnLimpiar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ricardo Morales\\workspace\\Estructura_datos\\imagen\\Fondo negro relieve verde.jpg"));
		lblNewLabel.setBounds(0, -132, 714, 539);
		contentPane.add(lblNewLabel);
		
		
	}
}
