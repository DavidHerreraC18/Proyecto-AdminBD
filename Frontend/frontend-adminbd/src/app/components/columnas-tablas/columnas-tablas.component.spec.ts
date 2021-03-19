import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ColumnasTablasComponent } from './columnas-tablas.component';

describe('ColumnasTablasComponent', () => {
  let component: ColumnasTablasComponent;
  let fixture: ComponentFixture<ColumnasTablasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ColumnasTablasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ColumnasTablasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
