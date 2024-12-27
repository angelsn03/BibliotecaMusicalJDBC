package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import utilities.SpringUtilities;

/**
 *
 * @author angelsn
 */
public class frmRegistrar extends JPanel {
    
    private JLabel[] labels;
    private JTextField[] fields;
    private JPasswordField contraseniaPwField;
    private JButton signInBtn;

    private JPanel contentPanel;
    private JPanel dataEntryPanel;

    public frmRegistrar() {
        // Inicializar componentes
        initializeComponents();
        this.setBackground(new Color(243, 242, 255));
        // Configurar panel principal
        setLayout(new BorderLayout());
        configurePanels();

        // Añadir contenido
        contentPanel.add(dataEntryPanel, BorderLayout.CENTER);
        this.add(contentPanel, BorderLayout.CENTER);
    }

    private void initializeComponents() {
        // Inicializar etiquetas y campos
        labels = new JLabel[]{
            new JLabel("Nombre: "),
            new JLabel("Apellido: "),
            new JLabel("Correo: "),
            new JLabel("Contraseña: ")
        };

        fields = new JTextField[]{
            new JTextField(20),
            new JTextField(20),
            new JTextField(20)
        };

        contraseniaPwField = new JPasswordField(20);
        signInBtn = new JButton("Registrar");

        // Inicializar paneles
        contentPanel = new JPanel(new BorderLayout());
        dataEntryPanel = new JPanel(new SpringLayout());
    }

    private void configurePanels() {
        // Cargar el formulario de registro
        cargarRegistro();

        // Añadir botón al final del panel de entrada
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(signInBtn);

        contentPanel.add(dataEntryPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void cargarRegistro() {
        for (int i = 0; i < labels.length; i++) {
            dataEntryPanel.add(labels[i]);
            if (i < fields.length) {
                dataEntryPanel.add(fields[i]);
            } else {
                dataEntryPanel.add(contraseniaPwField);
            }
        }

        // Layout del panel
        SpringUtilities.makeCompactGrid(dataEntryPanel,
                                        labels.length, 2, // filas, columnas
                                        6, 6,        // espacio inicial X, Y
                                        6, 6);       // padding X, Y
    }
}
