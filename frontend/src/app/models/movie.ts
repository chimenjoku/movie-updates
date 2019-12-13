import { StringMap } from '@angular/compiler/src/compiler_facade_interface';

export class Movie {
  id: string;
  title: string;
  // tslint:disable-next-line: variable-name
  poster_path: string;
  // tslint:disable-next-line: variable-name
  backdrop_path: string;
  overview: string;
  // tslint:disable-next-line: variable-name
  release_date: string;
}
