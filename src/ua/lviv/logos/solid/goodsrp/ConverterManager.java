package ua.lviv.logos.solid.goodsrp;


import ua.lviv.logos.solid.goodsrp.converter.BookConverter;
import ua.lviv.logos.solid.goodsrp.model.Book;

public class ConverterManager {

    private BookConverter converter;

    public ConverterManager(BookConverter converter) {
        this.converter = converter;
    }

    public void convertBook(Book book) {
        converter.convert(book);
    }
}
