import { Component, OnInit } from '@angular/core';
import { MoviesService } from '../../movies.service';
import { Movie } from '../../models/movie';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
  movie: Movie;

  constructor(
    private movieService: MoviesService,
    private router: ActivatedRoute
    ) { }

  ngOnInit() {
    this.router.params.subscribe((params) => {
    const id = params.id;
    this.movieService.getMovie(id).subscribe(movie => {
      this.movie = movie;
    });

    });
  }

}
