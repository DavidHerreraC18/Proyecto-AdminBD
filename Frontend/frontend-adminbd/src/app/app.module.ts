import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsuariosComponent } from './components/usuarios/usuarios.component';
import { UsuariosService } from './services/usuarios.service';
import { MenuComponent } from './components/menu/menu.component';
import { ColumnasTablasComponent } from './components/columnas-tablas/columnas-tablas.component';
import { PermisosUsuariosComponent } from './components/permisos-usuarios/permisos-usuarios.component';
import { JobsComponent } from './components/jobs/jobs.component';
import { UsuariosRecursosComponent } from './components/usuarios-recursos/usuarios-recursos.component';
import { TablespacesComponent } from './components/tablespaces/tablespaces.component';
import { UsuariosDetallesComponent } from './components/usuarios-detalles/usuarios-detalles.component';
import { ColumnaService } from './services/tabla_propietario/columna.service';
import { TablaPermisosService } from './services/permisos_usuario/tabla-permisos.service';
import { ColumnasPermisosComponent } from './components/columnas-permisos/columnas-permisos.component';
import { TablasService } from './services/tabla_propietario/tablas.service';
import { ColumnasPermisosService } from './services/permisos_usuario/columnas-permisos.service';
import { JobsService } from './services/jobs/jobs.service';
import { UsuariosRecursosService } from './services/usuarios_recursos/usuarios-recursos.service';


@NgModule({
  declarations: [
    AppComponent,
    UsuariosComponent,
    MenuComponent,
    ColumnasTablasComponent,
    PermisosUsuariosComponent,
    JobsComponent,
    UsuariosRecursosComponent,
    TablespacesComponent,
    UsuariosDetallesComponent,
    ColumnasPermisosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [
    UsuariosService, 
    TablasService, 
    ColumnaService, 
    TablaPermisosService,
    ColumnasPermisosService,
    JobsService,
    UsuariosRecursosService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
