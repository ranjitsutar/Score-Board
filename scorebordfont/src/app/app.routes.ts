import { Routes } from '@angular/router';
import { HistoryComponent } from './pages/history/history.component';
import { HomeComponent } from './pages/home/home.component';
import { LiveComponent } from './pages/live/live.component';
import { PointTableComponent } from './pages/point-table/point-table.component';

export const routes: Routes = [

{
    path : "history",
    component : HistoryComponent
},

{
    path : "home",
    component : HomeComponent
},
{
    path : "live",
    component : LiveComponent
},
{
    path : "point-table",
    component : PointTableComponent
},


];
