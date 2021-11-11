import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { Book } from './app/book';

@Injectable({
  providedIn: 'root',
})
export class BookService {
  private url = 'http://localhost:8102/devops';

  constructor(private httpClient: HttpClient) {}

  getBooks(): Observable<Book[]> {
    return this.httpClient.get<Book[]>(this.url + '/books');
  }

  // saveBook(title: string): Observable<any> {
  //   const postUrl = this.url + '/create';
  //   const body = { title };
  //   return this.httpClient.post<any>(postUrl, body);
  // }
}
