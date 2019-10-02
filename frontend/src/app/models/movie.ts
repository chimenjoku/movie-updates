import { StringMap } from '@angular/compiler/src/compiler_facade_interface';

export class Movie {
  id: string;
  popularity: string;
  vote_count: string;
  vote_average: string;
  video: boolean;
  adult: boolean;
  genre_ids: string[];
  title: string;
  original_language: string;
  overview: string;
  poster_path: string;
  backdrop_path: string;
  release_date: string;
}
