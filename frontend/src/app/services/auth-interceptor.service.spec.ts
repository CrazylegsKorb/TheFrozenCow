import { TestBed } from '@angular/core/testing';

import { RouterTestingModule } from '@angular/router/testing';
import { OktaAuthService } from '@okta/okta-angular';
import { of } from 'rxjs';

import { AuthInterceptorService } from './auth-interceptor.service';

describe('AuthGuardService', () => {
  let service: OktaAuthService;
  let authSpy = jasmine.createSpyObj<OktaAuthService>({
    isAuthenticated$: of(false)
  });

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [RouterTestingModule],
      providers: [
        { provide: OktaAuthService, useValue: authSpy }
      ]
    });
    service = TestBed.inject(OktaAuthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});