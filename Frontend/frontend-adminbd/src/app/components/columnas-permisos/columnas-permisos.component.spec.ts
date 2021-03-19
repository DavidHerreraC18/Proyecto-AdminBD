import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ColumnasPermisosComponent } from './columnas-permisos.component';

describe('ColumnasPermisosComponent', () => {
  let component: ColumnasPermisosComponent;
  let fixture: ComponentFixture<ColumnasPermisosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ColumnasPermisosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ColumnasPermisosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
