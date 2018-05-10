package org.japo.java.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {

    // Referencia a la imagen de fondo
    private Image img;

    public BackgroundPanel(Image img) {
        if (img != null) {
            this.img = img;
        }
    }

    @Override
    public void paint(Graphics g) {
        // Dibuja la imagen en el área de la etiqueta
        g.drawImage(
                img,            // Objeto Image - Imagen de fondo para el panel
                0, 0,           // X e Y donde se va a insertar la imagen
                getWidth() - 1, // Ancho de la imagen - Ancho del panel
                getHeight() - 1,// Alto de la imagen - Alto del panel
                this);          // Dónde se dibujará la imagen - Panel

        // Panel opaco - Muestra imagen
        setOpaque(false);

        // Pinta la imagen
        super.paint(g);
    }
}
