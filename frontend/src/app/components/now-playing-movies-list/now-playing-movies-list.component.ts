import { Component, OnInit } from '@angular/core';
import { MoviesService} from '../../movies.service';
import { Movie } from '../../models/movie';

@Component({
  selector: 'app-now-playing-movies-list',
  templateUrl: './now-playing-movies-list.component.html',
  styleUrls: ['./now-playing-movies-list.component.css']
})
export class NowPlayingMoviesListComponent implements OnInit {
  movies: Movie[] = [];

  constructor(private movieService: MoviesService) { }

  ngOnInit() {
    this.getAllNowPlayingMovies();
  }

  getAllNowPlayingMovies() {
    this.movieService.getNowPlaying().subscribe(
      res => {
        this.movies = res;
      },
      err => {
        alert('An error has occurred while downloading now playing movies');
      }
    );

  }
}
