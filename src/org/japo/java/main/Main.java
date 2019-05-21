/* 
 * Copyright 2019 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
package org.japo.java.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.japo.java.forms.GUI;
import org.japo.java.libraries.UtilesApp;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class Main {

    // Colección de Ventanas
    public static final List<JFrame> VIEW_LIST = new ArrayList<>();

    // Entidades Intercambio Datos
    public static final List<Object> DATA_LIST = new ArrayList<>();

    // Constructor Oculto
    private Main() {

    }

    // Entrada a la aplicación
    public static void main(String[] args) {
        // Lanzar GUI
        SwingUtilities.invokeLater(() -> {
            // Propiedades App
            Properties prp = UtilesApp.importarPropiedadesRecurso();

            // Instanciar Vistas
            GUI gui = new GUI(prp);

            // Incorporar Vistas
            VIEW_LIST.add(gui);

            // Mostrar Vista
            gui.setVisible(true);
        });
    }
}
