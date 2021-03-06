package dao;

import pojo.Book;

import java.util.List;

/**
 * @author 孟享广
 * @date 2020-10-19 2:09 下午
 * @description
 */
public interface BookDao {
    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

    public Integer qureyForPageTotalCount();

    List<Book> qureyForPageItems(int begin, int pageSize);

    Integer qureyForPageTotalCountByPrice(int min, int max);

    List<Book> qureyForPageItemsByprice(int begin, int pageSize, int max, int min);
}