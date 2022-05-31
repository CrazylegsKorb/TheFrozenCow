import { HttpClientTestingModule } from '@angular/common/http/testing';
import { async, TestBed } from '@angular/core/testing';

import { CheckoutService } from './checkout.service';



describe('CheckoutService', () => {
  let service: CheckoutService;

  beforeEach( async ( () => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule]
  })));

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
  
});
