import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NarvarComponent } from './narvar.component';

describe('NarvarComponent', () => {
  let component: NarvarComponent;
  let fixture: ComponentFixture<NarvarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NarvarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NarvarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
