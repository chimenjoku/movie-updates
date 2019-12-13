import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Movie } from './models/movie';

@Injectable({
  providedIn: 'root'
})

export class MoviesService {

  // tslint:disable-next-line: quotemark
  private baseUrl = "http://localhost:8081/api";
  private UPCOMING_MOVIES_URL = `${this.baseUrl}/upcoming-movies`;
  private NOW_PLAYING_MOVIES_URL = `${this.baseUrl}/now-playing-movies`;
  private MOVIE_URL = `${this.baseUrl}/movie/`;


  constructor(private http: HttpClient) { }

  getUpcoming(): Observable<Movie[]> {
    return this.http.get<Movie[]>(this.UPCOMING_MOVIES_URL);
  }

  getNowPlaying(): Observable<Movie[]> {
    return this.http.get<Movie[]>(this.NOW_PLAYING_MOVIES_URL);
  }

  getMovie(id: string): Observable<Movie> {
    return this.http.get<Movie>(this.MOVIE_URL + id);
  }
}
