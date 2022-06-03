// HTTP client error fix
import { HttpClient } from '@angular/common/http';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
//
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterTestingModule } from '@angular/router/testing';
import { environment } from 'src/environments/environment';
import { CheckoutComponent } from './checkout.component';

var stripe = Stripe('pk_test_TYooMQauvdEDq54NiTphI7jx'
);
var elements = stripe.elements();

describe('CheckoutComponent', () => {
  // HTTP client error fix
  let httpClient: HttpClient;
  let httpTestingController: HttpTestingController;
  //
  let component: CheckoutComponent;
  let fixture: ComponentFixture<CheckoutComponent>;


  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [CheckoutComponent],
      // HTTP client error fix
      imports: [ReactiveFormsModule, RouterTestingModule, HttpClientTestingModule]

      //
    })

      .compileComponents();
    var stripe = Stripe(environment.stripePublishableKey);

  }));

  beforeEach(() => {
    // HTTP client error fix
    httpClient = TestBed.inject(HttpClient);
    httpTestingController = TestBed.inject(HttpTestingController);
    //
    fixture = TestBed.createComponent(CheckoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
