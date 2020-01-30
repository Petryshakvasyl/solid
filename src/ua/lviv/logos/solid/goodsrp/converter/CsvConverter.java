package ua.lviv.logos.solid.goodsrp.converter;

import ua.lviv.logos.solid.goodsrp.model.Book;

public class CsvConverter implements BookConverter {

    @Override
    public void convert(Book book) {
        System.out.println("convert to csv ..");
    }
}
