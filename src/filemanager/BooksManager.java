package filemanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import main.Book;

/**
 *
 * @author Angelo
 */
public class BooksManager {

    static File inventory = new File(System.getProperty("user.dir") + File.separator + "inventario.txt");
    static HashMap<String, Book> inventoryBooks = new HashMap<>();

    public static void createFile() throws IOException {
        if (!inventory.exists()) {
            inventory.createNewFile();
        }
    }

    public static boolean fileIsEmpty() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(inventory);
        BufferedReader brFile = new BufferedReader(fr);

        for (String line = brFile.readLine(); line != null; line = brFile.readLine()) {
            return false;
        }

        return true;
    }

    public static void initializeBooks() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(inventory);
        BufferedReader br = new BufferedReader(fr);
        
        
        
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            String[] attributesBook = line.split(";");
            String[] authors = attributesBook[4].split(",");

            Book book = new Book(attributesBook[0], attributesBook[1], Double.parseDouble(attributesBook[2]), Integer.parseInt(attributesBook[3]));
            for (String author : authors) {
                book.addAuthor(author);
            }

            inventoryBooks.put(attributesBook[0], book);
        }
    }

    public static boolean bookExists(String title) throws IOException {
        Iterator it = inventoryBooks.keySet().iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            if (inventoryBooks.get(key).equals(new Book("", title, 0, 0))) {
                return true;
            }
        }
        return false;
    }

    public static Book searchBook(String title) {
        Iterator it = inventoryBooks.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            if (inventoryBooks.get(key).equals(new Book("", title, 0, 0))) {
                return inventoryBooks.get(key);
            }
        }
        return new Book("", "", 0, 0);
    }

    public static void overwriteFile() throws IOException {
        FileWriter fw = new FileWriter(inventory);
        BufferedWriter bw = new BufferedWriter(fw);

        Iterator it = inventoryBooks.keySet().iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            Book book = inventoryBooks.get(key);

            String autores = "";

            for (int i = 0; i < book.getAuthors().size(); i++) {
                if (i == 0) {
                    autores = book.getAuthors().get(i);
                } else {
                    autores += "," + book.getAuthors().get(i);
                }
            }

            bw.write(book.toString() + autores + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void addNewBook(String isbn, String title, double price, int stock, ArrayList<String> authors) throws IOException {
        Book book = new Book(isbn, title, price, stock);
        book.setAuthors(authors);

        inventoryBooks.put(isbn, book);

        overwriteFile();
    }

    public static void deleteBook(String title) throws IOException {
        inventoryBooks.remove(searchBook(title).getIsbn());
        overwriteFile();
    }

    public static void updateBook(String title, double price, int stock) throws IOException {
        Book book = searchBook(title);

        book.setPrice(price);
        book.setStock(stock);

        overwriteFile();
    }
}
