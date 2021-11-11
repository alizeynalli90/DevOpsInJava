package ev.harras.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ev.harras.mongo.domain.BookDomain;
import ev.harras.mongo.repository.Book;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/devops")
public class BookController {

	private BookDomain bookDomain;
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	public BookController(BookDomain bookDomain) {
		this.bookDomain = bookDomain;
	}
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getBooks() {
		log.info("getting books...");
		return bookDomain.getBooks();
	}
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void saveBook(@RequestBody Book book) {
		log.info("saving book...");
		bookDomain.save(book);
	}
}