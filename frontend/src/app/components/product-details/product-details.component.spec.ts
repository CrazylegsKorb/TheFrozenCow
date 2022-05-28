// HTTP client error fix
import { HttpClient } from '@angular/common/http';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
//
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductDetailsComponent } from './product-details.component';

describe('ProductDetailsComponent', () => {
  // HTTP client error fix
  let httpClient: HttpClient;
  let httpTestingController: HttpTestingController;
  //
  let component: ProductDetailsComponent;
  let fixture: ComponentFixture<ProductDetailsComponent>;


  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductDetailsComponent ],
      // HTTP client error fix
      imports: [ HttpClientTestingModule ]
      //
    })
    .compileComponents();
  }));

  beforeEach(() => {
    // HTTP client error fix
    httpClient = TestBed.inject(HttpClient);
    httpTestingController = TestBed.inject(HttpTestingController);
    //
    fixture = TestBed.createComponent(ProductDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
