import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ColumnasTablasComponent } from './components/columnas-tablas/columnas-tablas.component';
import { JobsComponent } from './components/jobs/jobs.component';
import { MenuComponent } from './components/menu/menu.component';
import { PermisosUsuariosComponent } from './components/permisos-usuarios/permisos-usuarios.component';
import { TablespacesComponent } from './components/tablespaces/tablespaces.component';
import { UsuariosRecursosComponent } from './components/usuarios-recursos/usuarios-recursos.component';
import { UsuariosComponent } from './components/usuarios/usuarios.component';

const routes: Routes = [
  {path: 'tablespaces',
   component: TablespacesComponent},
  {path: 'usuarios-recursos',
   component: UsuariosRecursosComponent},
  {path: 'jobs',
   component: JobsComponent},
  {path: 'permisos-usuarios',
   component: PermisosUsuariosComponent},
  {path: 'columnas-propietarios',
   component: ColumnasTablasComponent},
  {path: 'menu',
   component: MenuComponent},
  {path: 'usuarios-propietarios',
   component: UsuariosComponent},
  {path: '',
   component: MenuComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
