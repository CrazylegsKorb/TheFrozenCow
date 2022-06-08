// HTTP client error fix
import { HttpClient } from '@angular/common/http';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
//
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';

import { ProductListComponent } from './product-list.component';

describe('ProductListComponent', () => {
  // HTTP client error fix
  let httpClient: HttpClient;
  let httpTestingController: HttpTestingController;
  //
  let component: ProductListComponent;
  let fixture: ComponentFixture<ProductListComponent>;


  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ProductListComponent],
      // HTTP client error fix
      imports: [RouterTestingModule, HttpClientTestingModule]
      //
    })
      .compileComponents();
  }));

  beforeEach(() => {
    // HTTP client error fix
    httpClient = TestBed.inject(HttpClient);
    httpTestingController = TestBed.inject(HttpTestingController);
    //
    fixture = TestBed.createComponent(ProductListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  afterEach(() => {
    if (fixture.nativeElement && 'remove' in fixture.nativeElement) {
      (fixture.nativeElement as HTMLElement).remove();
    }
  });
  
});
