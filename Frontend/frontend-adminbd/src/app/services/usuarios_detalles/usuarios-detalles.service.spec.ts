import { TestBed } from '@angular/core/testing';

import { UsuariosDetallesService } from './usuarios-detalles.service';

describe('UsuariosDetallesService', () => {
  let service: UsuariosDetallesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UsuariosDetallesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
