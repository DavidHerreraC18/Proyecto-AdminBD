import { TestBed } from '@angular/core/testing';

import { TablespacesService } from './tablespaces.service';

describe('TablespacesService', () => {
  let service: TablespacesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TablespacesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
