package ua.lviv.logos.solid.goodsrp;

import ua.lviv.logos.solid.goodsrp.converter.PdfConverter;
import ua.lviv.logos.solid.goodsrp.model.Author;
import ua.lviv.logos.solid.goodsrp.model.Book;

;

public class App {

    public static void main(String[] args) {
        PdfConverter pdfConverter = new PdfConverter();
        ConverterManager manager = new ConverterManager(pdfConverter);
        Book book = creteBook();
        manager.convertBook(book);
    }

    public static Book creteBook() {
        Author bob = new Author("Bob", "Martin");
        Author king = new Author("Stiven", "King");

        Author[] authors = new Author[2];
        authors[0] = bob;
        authors[1] = king;

        return new Book("Super book", authors, "Book text ...");
    }
}
