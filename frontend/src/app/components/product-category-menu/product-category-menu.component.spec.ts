// HTTP client error fix
import { HttpClient } from '@angular/common/http';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
//
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductCategoryMenuComponent } from './product-category-menu.component';

describe('ProductCategoryMenuComponent', () => {
  // HTTP client error fix
  let httpClient: HttpClient;
  let httpTestingController: HttpTestingController;
  //
  let component: ProductCategoryMenuComponent;
  let fixture: ComponentFixture<ProductCategoryMenuComponent>;


  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductCategoryMenuComponent ],
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
    fixture = TestBed.createComponent(ProductCategoryMenuComponent);
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
