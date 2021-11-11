package ev.harras.mongo.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ev.harras.mongo.repository.Book;
import ev.harras.mongo.repository.BookRepository;

@Component
public class BookDomain {

	private BookRepository bookRepository;

	@Autowired
	public BookDomain(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}
	
	public void save (Book book) {
		bookRepository.save(book);
	}
}