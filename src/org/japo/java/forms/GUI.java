/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.util.Properties;
import org.japo.java.libraries.UtilesSwing;
import org.japo.java.main.Main;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class GUI extends javax.swing.JFrame {

    // Referencias
    private Main main;
    private Properties prp;

    // Constructor
    public GUI(Main main, Properties prp) {
        // Inicializacion Anterior
        initBefore(main, prp);

        // Creación Vista
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Here comes the Title");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    //
    // --- Lógica Aplicación --- 
    //
    // Inicializar GUI - PREVIA
    private void initBefore(Main main, Properties prp) {
        // Memorizar Referencias
        this.main = main;
        this.prp = prp;

        // Establece Lnf
        UtilesSwing.establecerLnF(prp.getProperty(
                Main.PRP_LOOK_AND_FEEL, Main.DEF_LOOK_AND_FEEL));

        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty(
                Main.PRP_RUTA_FAVICON, Main.DEF_RUTA_FAVICON));
    }

    // Inicializar GUI - POSTERIOR
    private void initAfter() {

    }
}
