package swing.ejercicios.block;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Block extends JFrame {

	private Container contentPane = getContentPane();
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public Block() {
		
		setTitle("Bloc de notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Fijamos el tamaño preferido. Se usará este tamaño cada vez que llamemos a
		// pack()
		setPreferredSize(new Dimension(800, 400));

		setJMenuBar(createMenu());

		contentPane.add(createToolbar(), BorderLayout.NORTH);

		contentPane.add(createTextArea(), BorderLayout.CENTER);

		pack();
		
		//Es importante llamar a este método después de hacer pack, ya que ahora ya sabe las
		//dimensiones de la ventana!!
		setLocationRelativeTo(null); 
		
	}
	
	private JMenuBar createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu mnNewMenu = new JMenu("Fichero");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNew = new JMenuItem("Nuevo");
		mntmNew.setMnemonic(KeyEvent.VK_N);
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
		mntmNew.addActionListener((e) -> {
			newTextArea();
		});

		// iconos por defecto
		// http://6iserver.osinerg.gob.pe/discwb4/applet/com/sun/java/swing/plaf/windows/icons/
		mntmNew.setIcon(new ImageIcon(Block.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		mnNewMenu.add(mntmNew);
		
		//TODO
		//Añadir el resto de menús y de ítems
		
		return menuBar;
	}

	private JScrollPane createTextArea() {
		textArea = new JTextArea();
		return new JScrollPane(textArea);
	}

	private JToolBar createToolbar() {
		JToolBar toolBar = new JToolBar();

		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener((e) -> {
			save();
		});
		btnNewButton.setIcon(new ImageIcon(Block.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
		toolBar.add(btnNewButton);

		//TODO
		//Crear el botón Abrir
		
		return toolBar;
	}
	/**
	 * Limpia la caja de texto textArea
	 */
	private void newTextArea() {
		//TODO
		System.out.println("Nuevo");
	}
	
	/**
	 * Muestra la ventana About
	 */
	private void showAbout() {
		//TODO
		System.out.println("About");
	}

	/**
	 * Muestra un diálogo para seleccionar un archivo y lo carga en la caja de texto textArea
	 */
	private void load() {
		//TODO
		System.out.println("load");
	}

	/**
	 * Muestra un diálogo para seleccionar un archivo y guarda en él el contenido de la caja de texto textArea
	 */
	private void save() {
		//TODO
		System.out.println("save");
	}
	/**
	 * Cierra el JFrame y finaliza la aplicación
	 */
	private void salir() {
		//TODO
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> new Block().setVisible(true));
	}
}
