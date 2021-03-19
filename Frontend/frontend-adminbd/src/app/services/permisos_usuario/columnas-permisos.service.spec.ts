import { TestBed } from '@angular/core/testing';

import { ColumnasPermisosService } from './columnas-permisos.service';

describe('ColumnasPermisosService', () => {
  let service: ColumnasPermisosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ColumnasPermisosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
