import { Routes } from '@angular/router';

export const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  {
    path: 'login',
    loadComponent: () => import('./views/login/login').then((m) => m.Login),
  },
  {
    path: '',
    loadComponent: () =>
      import('./layouts/main-layout/main-layout').then((m) => m.MainLayout),
    children: [
      { path: 'home', loadComponent: () => import('./views/home/home').then((m) => m.Home) },
    ],
  },
  { path: '**', redirectTo: 'login' },
];
