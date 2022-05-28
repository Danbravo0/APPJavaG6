package com.uai.app.ui;

import com.uai.app.dominio.Libro;
import com.uai.app.logic.DataManager;
import com.uai.app.ui.utils.UAIJFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.HashSet;
import java.util.List;

public class MostrarEditar extends UAIJFrame {

    private JPanel mainPanel;
    private JPanel mainTableConatiner;
    private JButton editarButton;

    public MostrarEditar(String title) {
        super(title);
        this.setMainPanel(mainPanel);
        String[] titles = { "titulo", "autor", "anio", "estante_numero", "estante_seccion", "piso", "edificio",
                "sede" };



        HashSet<Libro> data = DataManager.getInstance().getData();

        String[][] dataTabla = new String[1][4];






        String[] response=null;

        response=BuscarEditarUI.getresponse();

        dataTabla[0] = response;

        TableModel tableModel = new DefaultTableModel(dataTabla, titles);

        JTable table = new JTable(tableModel);
        mainTableConatiner.setLayout(new BorderLayout());
        mainTableConatiner.add(new JScrollPane(table), BorderLayout.CENTER);

        mainTableConatiner.add(table.getTableHeader(), BorderLayout.NORTH);

        mainTableConatiner.setVisible(true);
        mainTableConatiner.setSize(10, 10);

    }

}