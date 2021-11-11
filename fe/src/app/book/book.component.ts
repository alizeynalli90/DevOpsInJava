import { BookService } from '../../book.service';
import { Book } from '../book';
import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.scss'],
})
export class BookComponent implements OnInit {
  public books: Book[];
  public title: string;
  bookForm;
  constructor(
    private bookService: BookService,
    private formBuilder: FormBuilder
  ) {}

  ngOnInit(): void {
    this.bookService.getBooks().subscribe((value) => (this.books = value));
    this.bookForm = this.formBuilder.group({
      title: '',
    });
  }

  // save(book: any): void {
  //   this.bookService.saveBook(book.title);
  // }
}
