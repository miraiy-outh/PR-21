package com.company.z3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuTest extends JFrame{
    public JMenuTest()
    {
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        // Создание строки главного меню
        JMenuBar menuBar = new JMenuBar();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(300, 200);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {
        JMenu file = new JMenu("File");
        JMenuItem neww = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(neww);
        file.addSeparator();
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);

        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 }
            });
        return file;
    }
}
