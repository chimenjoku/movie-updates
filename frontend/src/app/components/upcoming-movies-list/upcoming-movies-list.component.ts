import { Component, OnInit } from '@angular/core';
import { MoviesService } from '../../movies.service';
import { Movie } from '../../models/movie';

@Component({
  selector: 'app-upcoming-movies-list',
  templateUrl: './upcoming-movies-list.component.html',
  styleUrls: ['./upcoming-movies-list.component.css']
})
export class UpcomingMoviesListComponent implements OnInit {

  movies: Movie[] = [];

  constructor(private movieService: MoviesService) { }

  ngOnInit() {
    this.getAllUpcomingMovies();
  }

  getAllUpcomingMovies() {
    this.movieService.getUpcoming().subscribe(
      res => {
        this.movies = res;
      },
      err => {
        alert('An error has occurred while downloading upcoming movies');
      }
    );

  }
}
