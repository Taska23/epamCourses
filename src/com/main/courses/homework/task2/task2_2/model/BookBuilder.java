package courses.homework.task2.task2_2.model;
public class BookBuilder {
    private String Title;
    private String author;
    private String publisher;
    private int publishYear;
    private int pagesNumber;

    public BookBuilder withName(String name) {
        this.Title = name;
        return this;
    }

    public BookBuilder withAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BookBuilder withPublishYear(int publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    public BookBuilder withPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
        return this;
    }

    public Book build() {
        Book book = new Book();
        book.setTitle(Title);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setPublishYear(publishYear);
        book.setPagesNumber(pagesNumber);
        return book;
    }
}
