import { ComponentFixture, TestBed } from '@angular/core/testing';
// HTTP client error fix
import { HttpClient } from '@angular/common/http';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
//
import { OrderHistoryComponent } from './order-history.component';

describe('OrderHistoryComponent', () => {
  // HTTP client error fix
  let httpClient: HttpClient;
  let httpTestingController: HttpTestingController;
  //
  let component: OrderHistoryComponent;
  let fixture: ComponentFixture<OrderHistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrderHistoryComponent ],
      imports:[ HttpClientTestingModule]
    })
    .compileComponents();
  });

  beforeEach(() => {
    // HTTP client error fix
    httpClient = TestBed.inject(HttpClient);
    httpTestingController = TestBed.inject(HttpTestingController);
    //
    fixture = TestBed.createComponent(OrderHistoryComponent);
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
