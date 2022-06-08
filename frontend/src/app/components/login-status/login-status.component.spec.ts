import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RouterTestingModule } from '@angular/router/testing';
import { OktaAuthService } from '@okta/okta-angular';
import { of } from 'rxjs';
import { LoginStatusComponent } from './login-status.component';

describe('LoginStatusComponent', () => {
  let service: OktaAuthService;
  let fixture: ComponentFixture<LoginStatusComponent>;
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
    fixture = TestBed.createComponent(LoginStatusComponent);
    service = TestBed.inject(OktaAuthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  afterEach(() => {
    if (fixture.nativeElement && 'remove' in fixture.nativeElement) {
      (fixture.nativeElement as HTMLElement).remove();
    }
  });
  
});