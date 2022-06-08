import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RouterTestingModule } from '@angular/router/testing';
import { OktaAuthService } from '@okta/okta-angular';
import { of } from 'rxjs';

import { LoginComponent } from './login.component';

describe('LoginComponent', () => {
  let service: OktaAuthService;
  let fixture: ComponentFixture<LoginComponent>;
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
    fixture = TestBed.createComponent(LoginComponent);
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