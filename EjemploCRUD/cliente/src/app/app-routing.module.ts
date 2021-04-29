import { Route } from '@angular/compiler/src/core';
import { ModuleWithProviders, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { InicioComponent } from './components/inicio/inicio.component';
import { RegistroComponent } from './components/registro/registro.component';
import { UploadComponent } from './components/upload/upload.component';

const routes: Routes = [
  {
    path:'',
    redirectTo:'/inicio',
    pathMatch:'full'
  },
  {
    path:'inicio',
    component:InicioComponent
  },
  {
    path:'registro',
    component: RegistroComponent
  },
  {
    path:'upload',
    component: UploadComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
export const routing: ModuleWithProviders<any> = RouterModule.forRoot(routes);
