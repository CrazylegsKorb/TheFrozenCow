import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Purchase } from '../common/purchase';
import { PaymentInfo } from '../common/payment-info';
import { CurrencyPipe } from '@angular/common';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {

  private purchaseUrl = environment.luv2shopApiUrl + '/checkout/purchase';

  private paymentIntentUrl = environment.luv2shopApiUrl + '/checkout/payment-intent';
  
  constructor(private httpClient: HttpClient) { }

  placeOrder(purchase: Purchase): Observable<any> {
    console.log(`Customer: ${purchase.customer.firstName} ${purchase.customer.lastName}\n` +
                `Billing Address:\n` + 
                ` ${purchase.billingAddress.street}\n` +
                ` ${purchase.billingAddress.city}, ${purchase.billingAddress.state} ${purchase.billingAddress.zipCode}\n` +
                `Shipping Address:\n` + 
                ` ${purchase.shippingAddress.street}\n` +
                ` ${purchase.shippingAddress.city}, ${purchase.shippingAddress.state} ${purchase.shippingAddress.zipCode}\n` +
                `Order items:\n`);
                purchase.orderItems.forEach( item => {console.log(` Prod Id: ${item.productId}\n Quantity: ${item.quantity}\n UnitPrice: ${item.unitPrice}`)});
    return this.httpClient.post<Purchase>(this.purchaseUrl, purchase);    
  }

  createPaymentIntent(paymentInfo: PaymentInfo): Observable<any> {
    return this.httpClient.post<PaymentInfo>(this.paymentIntentUrl, paymentInfo);
  }
  
}
