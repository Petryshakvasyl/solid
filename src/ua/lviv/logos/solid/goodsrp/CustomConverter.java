package ua.lviv.logos.solid.goodsrp;

import ua.lviv.logos.solid.goodsrp.converter.BookConverter;
import ua.lviv.logos.solid.goodsrp.model.Book;

public class CustomConverter implements BookConverter {

    @Override
    public void convert(Book book) {
        System.out.println("Custom convert ...");
    }
}
