import { TestBed } from '@angular/core/testing';

import { UsuariosRecursosService } from './usuarios-recursos.service';

describe('UsuariosRecursosService', () => {
  let service: UsuariosRecursosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UsuariosRecursosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
