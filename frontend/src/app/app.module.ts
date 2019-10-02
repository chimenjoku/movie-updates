import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UpcomingMoviesListComponent } from './components/upcoming-movies-list/upcoming-movies-list.component';
import { NowPlayingMoviesListComponent } from './components/now-playing-movies-list/now-playing-movies-list.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import { Router, RouterModule, Routes } from '@angular/router';
import { MoviesService } from './movies.service';

const appRoutes: Routes = [
  {
    path: 'upcoming-movies',
    component: UpcomingMoviesListComponent
  },
  {
    path: 'in-theatres',
    component: NowPlayingMoviesListComponent
  },
  {
    path: '',
    component: UpcomingMoviesListComponent,
    pathMatch: 'full'
  }
];
@NgModule({
  declarations: [
    AppComponent,
    UpcomingMoviesListComponent,
    NowPlayingMoviesListComponent,
    NavigationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes, { enableTracing: true })
  ],
  providers: [MoviesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
