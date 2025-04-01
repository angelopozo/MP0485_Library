package main;

import jframes.Menu;
import filemanager.BooksManager;
import java.io.IOException;

/**
 *
 * @author Angelo
 */
public class main {

    public static void main(String[] args) throws IOException {
        BooksManager.createFile();
        if (!BooksManager.fileIsEmpty()) {
            BooksManager.initializeBooks();
        }

        Menu menu = new Menu();
        menu.setDefaultCloseOperation(Menu.EXIT_ON_CLOSE);
        menu.setSize(600, 600);
        menu.pack();
        menu.setVisible(true);
    }
}
