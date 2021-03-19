import { TestBed } from '@angular/core/testing';

import { TablaPermisosService } from './tabla-permisos.service';

describe('TablaPermisosService', () => {
  let service: TablaPermisosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TablaPermisosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
