import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UsuariosRecursosComponent } from './usuarios-recursos.component';

describe('UsuariosRecursosComponent', () => {
  let component: UsuariosRecursosComponent;
  let fixture: ComponentFixture<UsuariosRecursosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UsuariosRecursosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UsuariosRecursosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
