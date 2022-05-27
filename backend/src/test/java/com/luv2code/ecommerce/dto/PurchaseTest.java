package com.luv2code.ecommerce.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.luv2code.ecommerce.entity.Address;
import com.luv2code.ecommerce.entity.Customer;
import com.luv2code.ecommerce.entity.Order;
import com.luv2code.ecommerce.entity.OrderItem;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class PurchaseTest {
    /**
     * Method under test: {@link Purchase#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new Purchase()).canEqual("Other"));
    }

    /**
     * Method under test: {@link Purchase#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        Purchase purchase = new Purchase();

        Order order = new Order();
        order.setBillingAddress(new Address());
        order.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(new Address());
        order.setStatus("Status");
        order.setTotalPrice(null);
        order.setTotalQuantity(3);

        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(order);
        address.setState("MD");
        address.setStreet("Street");
        address.setZipcode("21654");

        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());

        Order order1 = new Order();
        order1.setBillingAddress(new Address());
        order1.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(new Address());
        order1.setStatus("Status");
        order1.setTotalPrice(null);
        order1.setTotalQuantity(3);

        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(order1);
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipcode("21654");

        Order order2 = new Order();
        order2.setBillingAddress(address);
        order2.setCustomer(customer);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address1);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(42L));
        order2.setTotalQuantity(3);

        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order2);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipcode("21654");

        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());

        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(new Order());
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipcode("21654");

        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());

        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(new Order());
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipcode("21654");

        Order order3 = new Order();
        order3.setBillingAddress(address3);
        order3.setCustomer(customer2);
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(address4);
        order3.setStatus("Status");
        order3.setTotalPrice(BigDecimal.valueOf(42L));
        order3.setTotalQuantity(3);

        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order3);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipcode("21654");

        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());

        Address address6 = new Address();
        address6.setCity("Oxford");
        address6.setCountry("GB");
        address6.setId(123L);
        address6.setOrder(new Order());
        address6.setState("MD");
        address6.setStreet("Street");
        address6.setZipcode("21654");

        Customer customer4 = new Customer();
        customer4.setEmail("jane.doe@example.org");
        customer4.setFirstName("Jane");
        customer4.setId(123L);
        customer4.setLastName("Doe");
        customer4.setOrders(new HashSet<>());

        Address address7 = new Address();
        address7.setCity("Oxford");
        address7.setCountry("GB");
        address7.setId(123L);
        address7.setOrder(new Order());
        address7.setState("MD");
        address7.setStreet("Street");
        address7.setZipcode("21654");

        Order order4 = new Order();
        order4.setBillingAddress(address6);
        order4.setCustomer(customer4);
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(address7);
        order4.setStatus("Status");
        order4.setTotalPrice(BigDecimal.valueOf(42L));
        order4.setTotalQuantity(3);

        Address address8 = new Address();
        address8.setCity("Oxford");
        address8.setCountry("GB");
        address8.setId(123L);
        address8.setOrder(order4);
        address8.setState("MD");
        address8.setStreet("Street");
        address8.setZipcode("21654");

        Order order5 = new Order();
        order5.setBillingAddress(address5);
        order5.setCustomer(customer3);
        LocalDateTime atStartOfDayResult10 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setDateCreated(Date.from(atStartOfDayResult10.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setId(123L);
        LocalDateTime atStartOfDayResult11 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setLastUpdated(Date.from(atStartOfDayResult11.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setOrderItems(new HashSet<>());
        order5.setOrderTrackingNumber("42");
        order5.setShippingAddress(address8);
        order5.setStatus("Status");
        order5.setTotalPrice(BigDecimal.valueOf(42L));
        order5.setTotalQuantity(3);

        Order order6 = new Order();
        order6.setBillingAddress(new Address());
        order6.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult12 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setDateCreated(Date.from(atStartOfDayResult12.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setId(123L);
        LocalDateTime atStartOfDayResult13 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setLastUpdated(Date.from(atStartOfDayResult13.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setOrderItems(new HashSet<>());
        order6.setOrderTrackingNumber("42");
        order6.setShippingAddress(new Address());
        order6.setStatus("Status");
        order6.setTotalPrice(null);
        order6.setTotalQuantity(3);

        Address address9 = new Address();
        address9.setCity("Oxford");
        address9.setCountry("GB");
        address9.setId(123L);
        address9.setOrder(order6);
        address9.setState("MD");
        address9.setStreet("Street");
        address9.setZipcode("21654");

        Customer customer5 = new Customer();
        customer5.setEmail("jane.doe@example.org");
        customer5.setFirstName("Jane");
        customer5.setId(123L);
        customer5.setLastName("Doe");
        customer5.setOrders(new HashSet<>());

        Order order7 = new Order();
        order7.setBillingAddress(new Address());
        order7.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult14 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setDateCreated(Date.from(atStartOfDayResult14.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setId(123L);
        LocalDateTime atStartOfDayResult15 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setLastUpdated(Date.from(atStartOfDayResult15.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setOrderItems(new HashSet<>());
        order7.setOrderTrackingNumber("42");
        order7.setShippingAddress(new Address());
        order7.setStatus("Status");
        order7.setTotalPrice(null);
        order7.setTotalQuantity(3);

        Address address10 = new Address();
        address10.setCity("Oxford");
        address10.setCountry("GB");
        address10.setId(123L);
        address10.setOrder(order7);
        address10.setState("MD");
        address10.setStreet("Street");
        address10.setZipcode("21654");

        Order order8 = new Order();
        order8.setBillingAddress(address9);
        order8.setCustomer(customer5);
        LocalDateTime atStartOfDayResult16 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setDateCreated(Date.from(atStartOfDayResult16.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setId(123L);
        LocalDateTime atStartOfDayResult17 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setLastUpdated(Date.from(atStartOfDayResult17.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setOrderItems(new HashSet<>());
        order8.setOrderTrackingNumber("42");
        order8.setShippingAddress(address10);
        order8.setStatus("Status");
        order8.setTotalPrice(BigDecimal.valueOf(42L));
        order8.setTotalQuantity(3);

        Address address11 = new Address();
        address11.setCity("Oxford");
        address11.setCountry("GB");
        address11.setId(123L);
        address11.setOrder(order8);
        address11.setState("MD");
        address11.setStreet("Street");
        address11.setZipcode("21654");

        Purchase purchase1 = new Purchase();
        purchase1.setBillingAddress(address2);
        purchase1.setCustomer(customer1);
        purchase1.setOrder(order5);
        purchase1.setOrderItems(new HashSet<>());
        purchase1.setShippingAddress(address11);
        assertTrue(purchase.canEqual(purchase1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Purchase}
     *   <li>{@link Purchase#setBillingAddress(Address)}
     *   <li>{@link Purchase#setCustomer(Customer)}
     *   <li>{@link Purchase#setOrder(Order)}
     *   <li>{@link Purchase#setOrderItems(Set)}
     *   <li>{@link Purchase#setShippingAddress(Address)}
     *   <li>{@link Purchase#getBillingAddress()}
     *   <li>{@link Purchase#getCustomer()}
     *   <li>{@link Purchase#getOrder()}
     *   <li>{@link Purchase#getOrderItems()}
     *   <li>{@link Purchase#getShippingAddress()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Purchase actualPurchase = new Purchase();
        Order order = new Order();
        order.setBillingAddress(new Address());
        order.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(new Address());
        order.setStatus("Status");
        order.setTotalPrice(null);
        order.setTotalQuantity(1);
        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(order);
        address.setState("MD");
        address.setStreet("Street");
        address.setZipcode("21654");
        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());
        Order order1 = new Order();
        order1.setBillingAddress(new Address());
        order1.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(new Address());
        order1.setStatus("Status");
        order1.setTotalPrice(null);
        order1.setTotalQuantity(1);
        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(order1);
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipcode("21654");
        Order order2 = new Order();
        order2.setBillingAddress(address);
        order2.setCustomer(customer);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address1);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(42L));
        order2.setTotalQuantity(1);
        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order2);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipcode("21654");
        actualPurchase.setBillingAddress(address2);
        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());
        actualPurchase.setCustomer(customer1);
        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(new Order());
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipcode("21654");
        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());
        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(new Order());
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipcode("21654");
        Order order3 = new Order();
        order3.setBillingAddress(address3);
        order3.setCustomer(customer2);
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(address4);
        order3.setStatus("Status");
        order3.setTotalPrice(BigDecimal.valueOf(42L));
        order3.setTotalQuantity(1);
        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order3);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipcode("21654");
        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());
        Address address6 = new Address();
        address6.setCity("Oxford");
        address6.setCountry("GB");
        address6.setId(123L);
        address6.setOrder(new Order());
        address6.setState("MD");
        address6.setStreet("Street");
        address6.setZipcode("21654");
        Customer customer4 = new Customer();
        customer4.setEmail("jane.doe@example.org");
        customer4.setFirstName("Jane");
        customer4.setId(123L);
        customer4.setLastName("Doe");
        customer4.setOrders(new HashSet<>());
        Address address7 = new Address();
        address7.setCity("Oxford");
        address7.setCountry("GB");
        address7.setId(123L);
        address7.setOrder(new Order());
        address7.setState("MD");
        address7.setStreet("Street");
        address7.setZipcode("21654");
        Order order4 = new Order();
        order4.setBillingAddress(address6);
        order4.setCustomer(customer4);
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(address7);
        order4.setStatus("Status");
        order4.setTotalPrice(BigDecimal.valueOf(42L));
        order4.setTotalQuantity(1);
        Address address8 = new Address();
        address8.setCity("Oxford");
        address8.setCountry("GB");
        address8.setId(123L);
        address8.setOrder(order4);
        address8.setState("MD");
        address8.setStreet("Street");
        address8.setZipcode("21654");
        Order order5 = new Order();
        order5.setBillingAddress(address5);
        order5.setCustomer(customer3);
        LocalDateTime atStartOfDayResult10 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setDateCreated(Date.from(atStartOfDayResult10.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setId(123L);
        LocalDateTime atStartOfDayResult11 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setLastUpdated(Date.from(atStartOfDayResult11.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setOrderItems(new HashSet<>());
        order5.setOrderTrackingNumber("42");
        order5.setShippingAddress(address8);
        order5.setStatus("Status");
        order5.setTotalPrice(BigDecimal.valueOf(42L));
        order5.setTotalQuantity(1);
        actualPurchase.setOrder(order5);
        HashSet<OrderItem> orderItemSet = new HashSet<>();
        actualPurchase.setOrderItems(orderItemSet);
        Order order6 = new Order();
        order6.setBillingAddress(new Address());
        order6.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult12 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setDateCreated(Date.from(atStartOfDayResult12.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setId(123L);
        LocalDateTime atStartOfDayResult13 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setLastUpdated(Date.from(atStartOfDayResult13.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setOrderItems(new HashSet<>());
        order6.setOrderTrackingNumber("42");
        order6.setShippingAddress(new Address());
        order6.setStatus("Status");
        order6.setTotalPrice(null);
        order6.setTotalQuantity(1);
        Address address9 = new Address();
        address9.setCity("Oxford");
        address9.setCountry("GB");
        address9.setId(123L);
        address9.setOrder(order6);
        address9.setState("MD");
        address9.setStreet("Street");
        address9.setZipcode("21654");
        Customer customer5 = new Customer();
        customer5.setEmail("jane.doe@example.org");
        customer5.setFirstName("Jane");
        customer5.setId(123L);
        customer5.setLastName("Doe");
        customer5.setOrders(new HashSet<>());
        Order order7 = new Order();
        order7.setBillingAddress(new Address());
        order7.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult14 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setDateCreated(Date.from(atStartOfDayResult14.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setId(123L);
        LocalDateTime atStartOfDayResult15 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setLastUpdated(Date.from(atStartOfDayResult15.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setOrderItems(new HashSet<>());
        order7.setOrderTrackingNumber("42");
        order7.setShippingAddress(new Address());
        order7.setStatus("Status");
        order7.setTotalPrice(null);
        order7.setTotalQuantity(1);
        Address address10 = new Address();
        address10.setCity("Oxford");
        address10.setCountry("GB");
        address10.setId(123L);
        address10.setOrder(order7);
        address10.setState("MD");
        address10.setStreet("Street");
        address10.setZipcode("21654");
        Order order8 = new Order();
        order8.setBillingAddress(address9);
        order8.setCustomer(customer5);
        LocalDateTime atStartOfDayResult16 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setDateCreated(Date.from(atStartOfDayResult16.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setId(123L);
        LocalDateTime atStartOfDayResult17 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setLastUpdated(Date.from(atStartOfDayResult17.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setOrderItems(new HashSet<>());
        order8.setOrderTrackingNumber("42");
        order8.setShippingAddress(address10);
        order8.setStatus("Status");
        order8.setTotalPrice(BigDecimal.valueOf(42L));
        order8.setTotalQuantity(1);
        Address address11 = new Address();
        address11.setCity("Oxford");
        address11.setCountry("GB");
        address11.setId(123L);
        address11.setOrder(order8);
        address11.setState("MD");
        address11.setStreet("Street");
        address11.setZipcode("21654");
        actualPurchase.setShippingAddress(address11);
        assertSame(address2, actualPurchase.getBillingAddress());
        assertSame(customer1, actualPurchase.getCustomer());
        assertSame(order5, actualPurchase.getOrder());
        assertSame(orderItemSet, actualPurchase.getOrderItems());
        assertSame(address11, actualPurchase.getShippingAddress());
    }

    /**
     * Method under test: {@link Purchase#equals(Object)}
     */
    @Test
    void testEquals() {
        Order order = new Order();
        order.setBillingAddress(new Address());
        order.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(new Address());
        order.setStatus("Status");
        order.setTotalPrice(null);
        order.setTotalQuantity(1);

        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(order);
        address.setState("MD");
        address.setStreet("Street");
        address.setZipcode("21654");

        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());

        Order order1 = new Order();
        order1.setBillingAddress(new Address());
        order1.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(new Address());
        order1.setStatus("Status");
        order1.setTotalPrice(null);
        order1.setTotalQuantity(1);

        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(order1);
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipcode("21654");

        Order order2 = new Order();
        order2.setBillingAddress(address);
        order2.setCustomer(customer);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address1);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(42L));
        order2.setTotalQuantity(1);

        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order2);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipcode("21654");

        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());

        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(new Order());
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipcode("21654");

        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());

        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(new Order());
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipcode("21654");

        Order order3 = new Order();
        order3.setBillingAddress(address3);
        order3.setCustomer(customer2);
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(address4);
        order3.setStatus("Status");
        order3.setTotalPrice(BigDecimal.valueOf(42L));
        order3.setTotalQuantity(1);

        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order3);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipcode("21654");

        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());

        Address address6 = new Address();
        address6.setCity("Oxford");
        address6.setCountry("GB");
        address6.setId(123L);
        address6.setOrder(new Order());
        address6.setState("MD");
        address6.setStreet("Street");
        address6.setZipcode("21654");

        Customer customer4 = new Customer();
        customer4.setEmail("jane.doe@example.org");
        customer4.setFirstName("Jane");
        customer4.setId(123L);
        customer4.setLastName("Doe");
        customer4.setOrders(new HashSet<>());

        Address address7 = new Address();
        address7.setCity("Oxford");
        address7.setCountry("GB");
        address7.setId(123L);
        address7.setOrder(new Order());
        address7.setState("MD");
        address7.setStreet("Street");
        address7.setZipcode("21654");

        Order order4 = new Order();
        order4.setBillingAddress(address6);
        order4.setCustomer(customer4);
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(address7);
        order4.setStatus("Status");
        order4.setTotalPrice(BigDecimal.valueOf(42L));
        order4.setTotalQuantity(1);

        Address address8 = new Address();
        address8.setCity("Oxford");
        address8.setCountry("GB");
        address8.setId(123L);
        address8.setOrder(order4);
        address8.setState("MD");
        address8.setStreet("Street");
        address8.setZipcode("21654");

        Order order5 = new Order();
        order5.setBillingAddress(address5);
        order5.setCustomer(customer3);
        LocalDateTime atStartOfDayResult10 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setDateCreated(Date.from(atStartOfDayResult10.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setId(123L);
        LocalDateTime atStartOfDayResult11 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setLastUpdated(Date.from(atStartOfDayResult11.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setOrderItems(new HashSet<>());
        order5.setOrderTrackingNumber("42");
        order5.setShippingAddress(address8);
        order5.setStatus("Status");
        order5.setTotalPrice(BigDecimal.valueOf(42L));
        order5.setTotalQuantity(1);

        Order order6 = new Order();
        order6.setBillingAddress(new Address());
        order6.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult12 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setDateCreated(Date.from(atStartOfDayResult12.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setId(123L);
        LocalDateTime atStartOfDayResult13 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setLastUpdated(Date.from(atStartOfDayResult13.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setOrderItems(new HashSet<>());
        order6.setOrderTrackingNumber("42");
        order6.setShippingAddress(new Address());
        order6.setStatus("Status");
        order6.setTotalPrice(null);
        order6.setTotalQuantity(1);

        Address address9 = new Address();
        address9.setCity("Oxford");
        address9.setCountry("GB");
        address9.setId(123L);
        address9.setOrder(order6);
        address9.setState("MD");
        address9.setStreet("Street");
        address9.setZipcode("21654");

        Customer customer5 = new Customer();
        customer5.setEmail("jane.doe@example.org");
        customer5.setFirstName("Jane");
        customer5.setId(123L);
        customer5.setLastName("Doe");
        customer5.setOrders(new HashSet<>());

        Order order7 = new Order();
        order7.setBillingAddress(new Address());
        order7.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult14 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setDateCreated(Date.from(atStartOfDayResult14.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setId(123L);
        LocalDateTime atStartOfDayResult15 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setLastUpdated(Date.from(atStartOfDayResult15.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setOrderItems(new HashSet<>());
        order7.setOrderTrackingNumber("42");
        order7.setShippingAddress(new Address());
        order7.setStatus("Status");
        order7.setTotalPrice(null);
        order7.setTotalQuantity(1);

        Address address10 = new Address();
        address10.setCity("Oxford");
        address10.setCountry("GB");
        address10.setId(123L);
        address10.setOrder(order7);
        address10.setState("MD");
        address10.setStreet("Street");
        address10.setZipcode("21654");

        Order order8 = new Order();
        order8.setBillingAddress(address9);
        order8.setCustomer(customer5);
        LocalDateTime atStartOfDayResult16 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setDateCreated(Date.from(atStartOfDayResult16.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setId(123L);
        LocalDateTime atStartOfDayResult17 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setLastUpdated(Date.from(atStartOfDayResult17.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setOrderItems(new HashSet<>());
        order8.setOrderTrackingNumber("42");
        order8.setShippingAddress(address10);
        order8.setStatus("Status");
        order8.setTotalPrice(BigDecimal.valueOf(42L));
        order8.setTotalQuantity(1);

        Address address11 = new Address();
        address11.setCity("Oxford");
        address11.setCountry("GB");
        address11.setId(123L);
        address11.setOrder(order8);
        address11.setState("MD");
        address11.setStreet("Street");
        address11.setZipcode("21654");

        Purchase purchase = new Purchase();
        purchase.setBillingAddress(address2);
        purchase.setCustomer(customer1);
        purchase.setOrder(order5);
        purchase.setOrderItems(new HashSet<>());
        purchase.setShippingAddress(address11);
        assertNotEquals(purchase, null);
    }

    /**
     * Method under test: {@link Purchase#equals(Object)}
     */
    @Test
    void testEquals2() {
        Order order = new Order();
        order.setBillingAddress(new Address());
        order.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(new Address());
        order.setStatus("Status");
        order.setTotalPrice(null);
        order.setTotalQuantity(1);

        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(order);
        address.setState("MD");
        address.setStreet("Street");
        address.setZipcode("21654");

        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());

        Order order1 = new Order();
        order1.setBillingAddress(new Address());
        order1.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(new Address());
        order1.setStatus("Status");
        order1.setTotalPrice(null);
        order1.setTotalQuantity(1);

        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(order1);
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipcode("21654");

        Order order2 = new Order();
        order2.setBillingAddress(address);
        order2.setCustomer(customer);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address1);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(42L));
        order2.setTotalQuantity(1);

        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order2);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipcode("21654");

        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());

        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(new Order());
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipcode("21654");

        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());

        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(new Order());
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipcode("21654");

        Order order3 = new Order();
        order3.setBillingAddress(address3);
        order3.setCustomer(customer2);
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(address4);
        order3.setStatus("Status");
        order3.setTotalPrice(BigDecimal.valueOf(42L));
        order3.setTotalQuantity(1);

        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order3);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipcode("21654");

        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());

        Address address6 = new Address();
        address6.setCity("Oxford");
        address6.setCountry("GB");
        address6.setId(123L);
        address6.setOrder(new Order());
        address6.setState("MD");
        address6.setStreet("Street");
        address6.setZipcode("21654");

        Customer customer4 = new Customer();
        customer4.setEmail("jane.doe@example.org");
        customer4.setFirstName("Jane");
        customer4.setId(123L);
        customer4.setLastName("Doe");
        customer4.setOrders(new HashSet<>());

        Address address7 = new Address();
        address7.setCity("Oxford");
        address7.setCountry("GB");
        address7.setId(123L);
        address7.setOrder(new Order());
        address7.setState("MD");
        address7.setStreet("Street");
        address7.setZipcode("21654");

        Order order4 = new Order();
        order4.setBillingAddress(address6);
        order4.setCustomer(customer4);
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(address7);
        order4.setStatus("Status");
        order4.setTotalPrice(BigDecimal.valueOf(42L));
        order4.setTotalQuantity(1);

        Address address8 = new Address();
        address8.setCity("Oxford");
        address8.setCountry("GB");
        address8.setId(123L);
        address8.setOrder(order4);
        address8.setState("MD");
        address8.setStreet("Street");
        address8.setZipcode("21654");

        Order order5 = new Order();
        order5.setBillingAddress(address5);
        order5.setCustomer(customer3);
        LocalDateTime atStartOfDayResult10 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setDateCreated(Date.from(atStartOfDayResult10.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setId(123L);
        LocalDateTime atStartOfDayResult11 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setLastUpdated(Date.from(atStartOfDayResult11.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setOrderItems(new HashSet<>());
        order5.setOrderTrackingNumber("42");
        order5.setShippingAddress(address8);
        order5.setStatus("Status");
        order5.setTotalPrice(BigDecimal.valueOf(42L));
        order5.setTotalQuantity(1);

        Order order6 = new Order();
        order6.setBillingAddress(new Address());
        order6.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult12 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setDateCreated(Date.from(atStartOfDayResult12.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setId(123L);
        LocalDateTime atStartOfDayResult13 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setLastUpdated(Date.from(atStartOfDayResult13.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setOrderItems(new HashSet<>());
        order6.setOrderTrackingNumber("42");
        order6.setShippingAddress(new Address());
        order6.setStatus("Status");
        order6.setTotalPrice(null);
        order6.setTotalQuantity(1);

        Address address9 = new Address();
        address9.setCity("Oxford");
        address9.setCountry("GB");
        address9.setId(123L);
        address9.setOrder(order6);
        address9.setState("MD");
        address9.setStreet("Street");
        address9.setZipcode("21654");

        Customer customer5 = new Customer();
        customer5.setEmail("jane.doe@example.org");
        customer5.setFirstName("Jane");
        customer5.setId(123L);
        customer5.setLastName("Doe");
        customer5.setOrders(new HashSet<>());

        Order order7 = new Order();
        order7.setBillingAddress(new Address());
        order7.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult14 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setDateCreated(Date.from(atStartOfDayResult14.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setId(123L);
        LocalDateTime atStartOfDayResult15 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setLastUpdated(Date.from(atStartOfDayResult15.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setOrderItems(new HashSet<>());
        order7.setOrderTrackingNumber("42");
        order7.setShippingAddress(new Address());
        order7.setStatus("Status");
        order7.setTotalPrice(null);
        order7.setTotalQuantity(1);

        Address address10 = new Address();
        address10.setCity("Oxford");
        address10.setCountry("GB");
        address10.setId(123L);
        address10.setOrder(order7);
        address10.setState("MD");
        address10.setStreet("Street");
        address10.setZipcode("21654");

        Order order8 = new Order();
        order8.setBillingAddress(address9);
        order8.setCustomer(customer5);
        LocalDateTime atStartOfDayResult16 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setDateCreated(Date.from(atStartOfDayResult16.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setId(123L);
        LocalDateTime atStartOfDayResult17 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setLastUpdated(Date.from(atStartOfDayResult17.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setOrderItems(new HashSet<>());
        order8.setOrderTrackingNumber("42");
        order8.setShippingAddress(address10);
        order8.setStatus("Status");
        order8.setTotalPrice(BigDecimal.valueOf(42L));
        order8.setTotalQuantity(1);

        Address address11 = new Address();
        address11.setCity("Oxford");
        address11.setCountry("GB");
        address11.setId(123L);
        address11.setOrder(order8);
        address11.setState("MD");
        address11.setStreet("Street");
        address11.setZipcode("21654");

        Purchase purchase = new Purchase();
        purchase.setBillingAddress(address2);
        purchase.setCustomer(customer1);
        purchase.setOrder(order5);
        purchase.setOrderItems(new HashSet<>());
        purchase.setShippingAddress(address11);
        assertNotEquals(purchase, "Different type to Purchase");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Purchase#equals(Object)}
     *   <li>{@link Purchase#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        Order order = new Order();
        order.setBillingAddress(new Address());
        order.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(new Address());
        order.setStatus("Status");
        order.setTotalPrice(null);
        order.setTotalQuantity(1);

        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(order);
        address.setState("MD");
        address.setStreet("Street");
        address.setZipcode("21654");

        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());

        Order order1 = new Order();
        order1.setBillingAddress(new Address());
        order1.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(new Address());
        order1.setStatus("Status");
        order1.setTotalPrice(null);
        order1.setTotalQuantity(1);

        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(order1);
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipcode("21654");

        Order order2 = new Order();
        order2.setBillingAddress(address);
        order2.setCustomer(customer);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address1);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(42L));
        order2.setTotalQuantity(1);

        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order2);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipcode("21654");

        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());

        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(new Order());
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipcode("21654");

        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());

        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(new Order());
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipcode("21654");

        Order order3 = new Order();
        order3.setBillingAddress(address3);
        order3.setCustomer(customer2);
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(address4);
        order3.setStatus("Status");
        order3.setTotalPrice(BigDecimal.valueOf(42L));
        order3.setTotalQuantity(1);

        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order3);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipcode("21654");

        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());

        Address address6 = new Address();
        address6.setCity("Oxford");
        address6.setCountry("GB");
        address6.setId(123L);
        address6.setOrder(new Order());
        address6.setState("MD");
        address6.setStreet("Street");
        address6.setZipcode("21654");

        Customer customer4 = new Customer();
        customer4.setEmail("jane.doe@example.org");
        customer4.setFirstName("Jane");
        customer4.setId(123L);
        customer4.setLastName("Doe");
        customer4.setOrders(new HashSet<>());

        Address address7 = new Address();
        address7.setCity("Oxford");
        address7.setCountry("GB");
        address7.setId(123L);
        address7.setOrder(new Order());
        address7.setState("MD");
        address7.setStreet("Street");
        address7.setZipcode("21654");

        Order order4 = new Order();
        order4.setBillingAddress(address6);
        order4.setCustomer(customer4);
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(address7);
        order4.setStatus("Status");
        order4.setTotalPrice(BigDecimal.valueOf(42L));
        order4.setTotalQuantity(1);

        Address address8 = new Address();
        address8.setCity("Oxford");
        address8.setCountry("GB");
        address8.setId(123L);
        address8.setOrder(order4);
        address8.setState("MD");
        address8.setStreet("Street");
        address8.setZipcode("21654");

        Order order5 = new Order();
        order5.setBillingAddress(address5);
        order5.setCustomer(customer3);
        LocalDateTime atStartOfDayResult10 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setDateCreated(Date.from(atStartOfDayResult10.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setId(123L);
        LocalDateTime atStartOfDayResult11 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setLastUpdated(Date.from(atStartOfDayResult11.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setOrderItems(new HashSet<>());
        order5.setOrderTrackingNumber("42");
        order5.setShippingAddress(address8);
        order5.setStatus("Status");
        order5.setTotalPrice(BigDecimal.valueOf(42L));
        order5.setTotalQuantity(1);

        Order order6 = new Order();
        order6.setBillingAddress(new Address());
        order6.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult12 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setDateCreated(Date.from(atStartOfDayResult12.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setId(123L);
        LocalDateTime atStartOfDayResult13 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setLastUpdated(Date.from(atStartOfDayResult13.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setOrderItems(new HashSet<>());
        order6.setOrderTrackingNumber("42");
        order6.setShippingAddress(new Address());
        order6.setStatus("Status");
        order6.setTotalPrice(null);
        order6.setTotalQuantity(1);

        Address address9 = new Address();
        address9.setCity("Oxford");
        address9.setCountry("GB");
        address9.setId(123L);
        address9.setOrder(order6);
        address9.setState("MD");
        address9.setStreet("Street");
        address9.setZipcode("21654");

        Customer customer5 = new Customer();
        customer5.setEmail("jane.doe@example.org");
        customer5.setFirstName("Jane");
        customer5.setId(123L);
        customer5.setLastName("Doe");
        customer5.setOrders(new HashSet<>());

        Order order7 = new Order();
        order7.setBillingAddress(new Address());
        order7.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult14 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setDateCreated(Date.from(atStartOfDayResult14.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setId(123L);
        LocalDateTime atStartOfDayResult15 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setLastUpdated(Date.from(atStartOfDayResult15.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setOrderItems(new HashSet<>());
        order7.setOrderTrackingNumber("42");
        order7.setShippingAddress(new Address());
        order7.setStatus("Status");
        order7.setTotalPrice(null);
        order7.setTotalQuantity(1);

        Address address10 = new Address();
        address10.setCity("Oxford");
        address10.setCountry("GB");
        address10.setId(123L);
        address10.setOrder(order7);
        address10.setState("MD");
        address10.setStreet("Street");
        address10.setZipcode("21654");

        Order order8 = new Order();
        order8.setBillingAddress(address9);
        order8.setCustomer(customer5);
        LocalDateTime atStartOfDayResult16 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setDateCreated(Date.from(atStartOfDayResult16.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setId(123L);
        LocalDateTime atStartOfDayResult17 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setLastUpdated(Date.from(atStartOfDayResult17.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setOrderItems(new HashSet<>());
        order8.setOrderTrackingNumber("42");
        order8.setShippingAddress(address10);
        order8.setStatus("Status");
        order8.setTotalPrice(BigDecimal.valueOf(42L));
        order8.setTotalQuantity(1);

        Address address11 = new Address();
        address11.setCity("Oxford");
        address11.setCountry("GB");
        address11.setId(123L);
        address11.setOrder(order8);
        address11.setState("MD");
        address11.setStreet("Street");
        address11.setZipcode("21654");

        Purchase purchase = new Purchase();
        purchase.setBillingAddress(address2);
        purchase.setCustomer(customer1);
        purchase.setOrder(order5);
        purchase.setOrderItems(new HashSet<>());
        purchase.setShippingAddress(address11);
        assertEquals(purchase, purchase);
        int expectedHashCodeResult = purchase.hashCode();
        assertEquals(expectedHashCodeResult, purchase.hashCode());
    }

    /**
     * Method under test: {@link Purchase#equals(Object)}
     */
    @Test
    void testEquals4() {
        Order order = new Order();
        order.setBillingAddress(new Address());
        order.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setDateCreated(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        order.setId(123L);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setLastUpdated(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        order.setOrderItems(new HashSet<>());
        order.setOrderTrackingNumber("42");
        order.setShippingAddress(new Address());
        order.setStatus("Status");
        order.setTotalPrice(null);
        order.setTotalQuantity(1);

        Address address = new Address();
        address.setCity("Oxford");
        address.setCountry("GB");
        address.setId(123L);
        address.setOrder(order);
        address.setState("MD");
        address.setStreet("Street");
        address.setZipcode("21654");

        Customer customer = new Customer();
        customer.setEmail("jane.doe@example.org");
        customer.setFirstName("Jane");
        customer.setId(123L);
        customer.setLastName("Doe");
        customer.setOrders(new HashSet<>());

        Order order1 = new Order();
        order1.setBillingAddress(new Address());
        order1.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setDateCreated(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setId(123L);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setLastUpdated(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        order1.setOrderItems(new HashSet<>());
        order1.setOrderTrackingNumber("42");
        order1.setShippingAddress(new Address());
        order1.setStatus("Status");
        order1.setTotalPrice(null);
        order1.setTotalQuantity(1);

        Address address1 = new Address();
        address1.setCity("Oxford");
        address1.setCountry("GB");
        address1.setId(123L);
        address1.setOrder(order1);
        address1.setState("MD");
        address1.setStreet("Street");
        address1.setZipcode("21654");

        Order order2 = new Order();
        order2.setBillingAddress(address);
        order2.setCustomer(customer);
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setDateCreated(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setId(123L);
        LocalDateTime atStartOfDayResult5 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order2.setLastUpdated(Date.from(atStartOfDayResult5.atZone(ZoneId.of("UTC")).toInstant()));
        order2.setOrderItems(new HashSet<>());
        order2.setOrderTrackingNumber("42");
        order2.setShippingAddress(address1);
        order2.setStatus("Status");
        order2.setTotalPrice(BigDecimal.valueOf(42L));
        order2.setTotalQuantity(1);

        Address address2 = new Address();
        address2.setCity("Oxford");
        address2.setCountry("GB");
        address2.setId(123L);
        address2.setOrder(order2);
        address2.setState("MD");
        address2.setStreet("Street");
        address2.setZipcode("21654");

        Customer customer1 = new Customer();
        customer1.setEmail("jane.doe@example.org");
        customer1.setFirstName("Jane");
        customer1.setId(123L);
        customer1.setLastName("Doe");
        customer1.setOrders(new HashSet<>());

        Address address3 = new Address();
        address3.setCity("Oxford");
        address3.setCountry("GB");
        address3.setId(123L);
        address3.setOrder(new Order());
        address3.setState("MD");
        address3.setStreet("Street");
        address3.setZipcode("21654");

        Customer customer2 = new Customer();
        customer2.setEmail("jane.doe@example.org");
        customer2.setFirstName("Jane");
        customer2.setId(123L);
        customer2.setLastName("Doe");
        customer2.setOrders(new HashSet<>());

        Address address4 = new Address();
        address4.setCity("Oxford");
        address4.setCountry("GB");
        address4.setId(123L);
        address4.setOrder(new Order());
        address4.setState("MD");
        address4.setStreet("Street");
        address4.setZipcode("21654");

        Order order3 = new Order();
        order3.setBillingAddress(address3);
        order3.setCustomer(customer2);
        LocalDateTime atStartOfDayResult6 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setDateCreated(Date.from(atStartOfDayResult6.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setId(123L);
        LocalDateTime atStartOfDayResult7 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order3.setLastUpdated(Date.from(atStartOfDayResult7.atZone(ZoneId.of("UTC")).toInstant()));
        order3.setOrderItems(new HashSet<>());
        order3.setOrderTrackingNumber("42");
        order3.setShippingAddress(address4);
        order3.setStatus("Status");
        order3.setTotalPrice(BigDecimal.valueOf(42L));
        order3.setTotalQuantity(1);

        Address address5 = new Address();
        address5.setCity("Oxford");
        address5.setCountry("GB");
        address5.setId(123L);
        address5.setOrder(order3);
        address5.setState("MD");
        address5.setStreet("Street");
        address5.setZipcode("21654");

        Customer customer3 = new Customer();
        customer3.setEmail("jane.doe@example.org");
        customer3.setFirstName("Jane");
        customer3.setId(123L);
        customer3.setLastName("Doe");
        customer3.setOrders(new HashSet<>());

        Address address6 = new Address();
        address6.setCity("Oxford");
        address6.setCountry("GB");
        address6.setId(123L);
        address6.setOrder(new Order());
        address6.setState("MD");
        address6.setStreet("Street");
        address6.setZipcode("21654");

        Customer customer4 = new Customer();
        customer4.setEmail("jane.doe@example.org");
        customer4.setFirstName("Jane");
        customer4.setId(123L);
        customer4.setLastName("Doe");
        customer4.setOrders(new HashSet<>());

        Address address7 = new Address();
        address7.setCity("Oxford");
        address7.setCountry("GB");
        address7.setId(123L);
        address7.setOrder(new Order());
        address7.setState("MD");
        address7.setStreet("Street");
        address7.setZipcode("21654");

        Order order4 = new Order();
        order4.setBillingAddress(address6);
        order4.setCustomer(customer4);
        LocalDateTime atStartOfDayResult8 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setDateCreated(Date.from(atStartOfDayResult8.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setId(123L);
        LocalDateTime atStartOfDayResult9 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order4.setLastUpdated(Date.from(atStartOfDayResult9.atZone(ZoneId.of("UTC")).toInstant()));
        order4.setOrderItems(new HashSet<>());
        order4.setOrderTrackingNumber("42");
        order4.setShippingAddress(address7);
        order4.setStatus("Status");
        order4.setTotalPrice(BigDecimal.valueOf(42L));
        order4.setTotalQuantity(1);

        Address address8 = new Address();
        address8.setCity("Oxford");
        address8.setCountry("GB");
        address8.setId(123L);
        address8.setOrder(order4);
        address8.setState("MD");
        address8.setStreet("Street");
        address8.setZipcode("21654");

        Order order5 = new Order();
        order5.setBillingAddress(address5);
        order5.setCustomer(customer3);
        LocalDateTime atStartOfDayResult10 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setDateCreated(Date.from(atStartOfDayResult10.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setId(123L);
        LocalDateTime atStartOfDayResult11 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order5.setLastUpdated(Date.from(atStartOfDayResult11.atZone(ZoneId.of("UTC")).toInstant()));
        order5.setOrderItems(new HashSet<>());
        order5.setOrderTrackingNumber("42");
        order5.setShippingAddress(address8);
        order5.setStatus("Status");
        order5.setTotalPrice(BigDecimal.valueOf(42L));
        order5.setTotalQuantity(1);

        Order order6 = new Order();
        order6.setBillingAddress(new Address());
        order6.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult12 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setDateCreated(Date.from(atStartOfDayResult12.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setId(123L);
        LocalDateTime atStartOfDayResult13 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order6.setLastUpdated(Date.from(atStartOfDayResult13.atZone(ZoneId.of("UTC")).toInstant()));
        order6.setOrderItems(new HashSet<>());
        order6.setOrderTrackingNumber("42");
        order6.setShippingAddress(new Address());
        order6.setStatus("Status");
        order6.setTotalPrice(null);
        order6.setTotalQuantity(1);

        Address address9 = new Address();
        address9.setCity("Oxford");
        address9.setCountry("GB");
        address9.setId(123L);
        address9.setOrder(order6);
        address9.setState("MD");
        address9.setStreet("Street");
        address9.setZipcode("21654");

        Customer customer5 = new Customer();
        customer5.setEmail("jane.doe@example.org");
        customer5.setFirstName("Jane");
        customer5.setId(123L);
        customer5.setLastName("Doe");
        customer5.setOrders(new HashSet<>());

        Order order7 = new Order();
        order7.setBillingAddress(new Address());
        order7.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult14 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setDateCreated(Date.from(atStartOfDayResult14.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setId(123L);
        LocalDateTime atStartOfDayResult15 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order7.setLastUpdated(Date.from(atStartOfDayResult15.atZone(ZoneId.of("UTC")).toInstant()));
        order7.setOrderItems(new HashSet<>());
        order7.setOrderTrackingNumber("42");
        order7.setShippingAddress(new Address());
        order7.setStatus("Status");
        order7.setTotalPrice(null);
        order7.setTotalQuantity(1);

        Address address10 = new Address();
        address10.setCity("Oxford");
        address10.setCountry("GB");
        address10.setId(123L);
        address10.setOrder(order7);
        address10.setState("MD");
        address10.setStreet("Street");
        address10.setZipcode("21654");

        Order order8 = new Order();
        order8.setBillingAddress(address9);
        order8.setCustomer(customer5);
        LocalDateTime atStartOfDayResult16 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setDateCreated(Date.from(atStartOfDayResult16.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setId(123L);
        LocalDateTime atStartOfDayResult17 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order8.setLastUpdated(Date.from(atStartOfDayResult17.atZone(ZoneId.of("UTC")).toInstant()));
        order8.setOrderItems(new HashSet<>());
        order8.setOrderTrackingNumber("42");
        order8.setShippingAddress(address10);
        order8.setStatus("Status");
        order8.setTotalPrice(BigDecimal.valueOf(42L));
        order8.setTotalQuantity(1);

        Address address11 = new Address();
        address11.setCity("Oxford");
        address11.setCountry("GB");
        address11.setId(123L);
        address11.setOrder(order8);
        address11.setState("MD");
        address11.setStreet("Street");
        address11.setZipcode("21654");

        Purchase purchase = new Purchase();
        purchase.setBillingAddress(address2);
        purchase.setCustomer(customer1);
        purchase.setOrder(order5);
        purchase.setOrderItems(new HashSet<>());
        purchase.setShippingAddress(address11);

        Order order9 = new Order();
        order9.setBillingAddress(new Address());
        order9.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult18 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order9.setDateCreated(Date.from(atStartOfDayResult18.atZone(ZoneId.of("UTC")).toInstant()));
        order9.setId(123L);
        LocalDateTime atStartOfDayResult19 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order9.setLastUpdated(Date.from(atStartOfDayResult19.atZone(ZoneId.of("UTC")).toInstant()));
        order9.setOrderItems(new HashSet<>());
        order9.setOrderTrackingNumber("42");
        order9.setShippingAddress(new Address());
        order9.setStatus("Status");
        order9.setTotalPrice(null);
        order9.setTotalQuantity(1);

        Address address12 = new Address();
        address12.setCity("Oxford");
        address12.setCountry("GB");
        address12.setId(123L);
        address12.setOrder(order9);
        address12.setState("MD");
        address12.setStreet("Street");
        address12.setZipcode("21654");

        Customer customer6 = new Customer();
        customer6.setEmail("jane.doe@example.org");
        customer6.setFirstName("Jane");
        customer6.setId(123L);
        customer6.setLastName("Doe");
        customer6.setOrders(new HashSet<>());

        Order order10 = new Order();
        order10.setBillingAddress(new Address());
        order10.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult20 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order10.setDateCreated(Date.from(atStartOfDayResult20.atZone(ZoneId.of("UTC")).toInstant()));
        order10.setId(123L);
        LocalDateTime atStartOfDayResult21 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order10.setLastUpdated(Date.from(atStartOfDayResult21.atZone(ZoneId.of("UTC")).toInstant()));
        order10.setOrderItems(new HashSet<>());
        order10.setOrderTrackingNumber("42");
        order10.setShippingAddress(new Address());
        order10.setStatus("Status");
        order10.setTotalPrice(null);
        order10.setTotalQuantity(1);

        Address address13 = new Address();
        address13.setCity("Oxford");
        address13.setCountry("GB");
        address13.setId(123L);
        address13.setOrder(order10);
        address13.setState("MD");
        address13.setStreet("Street");
        address13.setZipcode("21654");

        Order order11 = new Order();
        order11.setBillingAddress(address12);
        order11.setCustomer(customer6);
        LocalDateTime atStartOfDayResult22 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order11.setDateCreated(Date.from(atStartOfDayResult22.atZone(ZoneId.of("UTC")).toInstant()));
        order11.setId(123L);
        LocalDateTime atStartOfDayResult23 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order11.setLastUpdated(Date.from(atStartOfDayResult23.atZone(ZoneId.of("UTC")).toInstant()));
        order11.setOrderItems(new HashSet<>());
        order11.setOrderTrackingNumber("42");
        order11.setShippingAddress(address13);
        order11.setStatus("Status");
        order11.setTotalPrice(BigDecimal.valueOf(42L));
        order11.setTotalQuantity(1);

        Address address14 = new Address();
        address14.setCity("Oxford");
        address14.setCountry("GB");
        address14.setId(123L);
        address14.setOrder(order11);
        address14.setState("MD");
        address14.setStreet("Street");
        address14.setZipcode("21654");

        Customer customer7 = new Customer();
        customer7.setEmail("jane.doe@example.org");
        customer7.setFirstName("Jane");
        customer7.setId(123L);
        customer7.setLastName("Doe");
        customer7.setOrders(new HashSet<>());

        Address address15 = new Address();
        address15.setCity("Oxford");
        address15.setCountry("GB");
        address15.setId(123L);
        address15.setOrder(new Order());
        address15.setState("MD");
        address15.setStreet("Street");
        address15.setZipcode("21654");

        Customer customer8 = new Customer();
        customer8.setEmail("jane.doe@example.org");
        customer8.setFirstName("Jane");
        customer8.setId(123L);
        customer8.setLastName("Doe");
        customer8.setOrders(new HashSet<>());

        Address address16 = new Address();
        address16.setCity("Oxford");
        address16.setCountry("GB");
        address16.setId(123L);
        address16.setOrder(new Order());
        address16.setState("MD");
        address16.setStreet("Street");
        address16.setZipcode("21654");

        Order order12 = new Order();
        order12.setBillingAddress(address15);
        order12.setCustomer(customer8);
        LocalDateTime atStartOfDayResult24 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order12.setDateCreated(Date.from(atStartOfDayResult24.atZone(ZoneId.of("UTC")).toInstant()));
        order12.setId(123L);
        LocalDateTime atStartOfDayResult25 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order12.setLastUpdated(Date.from(atStartOfDayResult25.atZone(ZoneId.of("UTC")).toInstant()));
        order12.setOrderItems(new HashSet<>());
        order12.setOrderTrackingNumber("42");
        order12.setShippingAddress(address16);
        order12.setStatus("Status");
        order12.setTotalPrice(BigDecimal.valueOf(42L));
        order12.setTotalQuantity(1);

        Address address17 = new Address();
        address17.setCity("Oxford");
        address17.setCountry("GB");
        address17.setId(123L);
        address17.setOrder(order12);
        address17.setState("MD");
        address17.setStreet("Street");
        address17.setZipcode("21654");

        Customer customer9 = new Customer();
        customer9.setEmail("jane.doe@example.org");
        customer9.setFirstName("Jane");
        customer9.setId(123L);
        customer9.setLastName("Doe");
        customer9.setOrders(new HashSet<>());

        Address address18 = new Address();
        address18.setCity("Oxford");
        address18.setCountry("GB");
        address18.setId(123L);
        address18.setOrder(new Order());
        address18.setState("MD");
        address18.setStreet("Street");
        address18.setZipcode("21654");

        Customer customer10 = new Customer();
        customer10.setEmail("jane.doe@example.org");
        customer10.setFirstName("Jane");
        customer10.setId(123L);
        customer10.setLastName("Doe");
        customer10.setOrders(new HashSet<>());

        Address address19 = new Address();
        address19.setCity("Oxford");
        address19.setCountry("GB");
        address19.setId(123L);
        address19.setOrder(new Order());
        address19.setState("MD");
        address19.setStreet("Street");
        address19.setZipcode("21654");

        Order order13 = new Order();
        order13.setBillingAddress(address18);
        order13.setCustomer(customer10);
        LocalDateTime atStartOfDayResult26 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order13.setDateCreated(Date.from(atStartOfDayResult26.atZone(ZoneId.of("UTC")).toInstant()));
        order13.setId(123L);
        LocalDateTime atStartOfDayResult27 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order13.setLastUpdated(Date.from(atStartOfDayResult27.atZone(ZoneId.of("UTC")).toInstant()));
        order13.setOrderItems(new HashSet<>());
        order13.setOrderTrackingNumber("42");
        order13.setShippingAddress(address19);
        order13.setStatus("Status");
        order13.setTotalPrice(BigDecimal.valueOf(42L));
        order13.setTotalQuantity(1);

        Address address20 = new Address();
        address20.setCity("Oxford");
        address20.setCountry("GB");
        address20.setId(123L);
        address20.setOrder(order13);
        address20.setState("MD");
        address20.setStreet("Street");
        address20.setZipcode("21654");

        Order order14 = new Order();
        order14.setBillingAddress(address17);
        order14.setCustomer(customer9);
        LocalDateTime atStartOfDayResult28 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order14.setDateCreated(Date.from(atStartOfDayResult28.atZone(ZoneId.of("UTC")).toInstant()));
        order14.setId(123L);
        LocalDateTime atStartOfDayResult29 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order14.setLastUpdated(Date.from(atStartOfDayResult29.atZone(ZoneId.of("UTC")).toInstant()));
        order14.setOrderItems(new HashSet<>());
        order14.setOrderTrackingNumber("42");
        order14.setShippingAddress(address20);
        order14.setStatus("Status");
        order14.setTotalPrice(BigDecimal.valueOf(42L));
        order14.setTotalQuantity(1);

        Order order15 = new Order();
        order15.setBillingAddress(new Address());
        order15.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult30 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order15.setDateCreated(Date.from(atStartOfDayResult30.atZone(ZoneId.of("UTC")).toInstant()));
        order15.setId(123L);
        LocalDateTime atStartOfDayResult31 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order15.setLastUpdated(Date.from(atStartOfDayResult31.atZone(ZoneId.of("UTC")).toInstant()));
        order15.setOrderItems(new HashSet<>());
        order15.setOrderTrackingNumber("42");
        order15.setShippingAddress(new Address());
        order15.setStatus("Status");
        order15.setTotalPrice(null);
        order15.setTotalQuantity(1);

        Address address21 = new Address();
        address21.setCity("Oxford");
        address21.setCountry("GB");
        address21.setId(123L);
        address21.setOrder(order15);
        address21.setState("MD");
        address21.setStreet("Street");
        address21.setZipcode("21654");

        Customer customer11 = new Customer();
        customer11.setEmail("jane.doe@example.org");
        customer11.setFirstName("Jane");
        customer11.setId(123L);
        customer11.setLastName("Doe");
        customer11.setOrders(new HashSet<>());

        Order order16 = new Order();
        order16.setBillingAddress(new Address());
        order16.setCustomer(new Customer());
        LocalDateTime atStartOfDayResult32 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order16.setDateCreated(Date.from(atStartOfDayResult32.atZone(ZoneId.of("UTC")).toInstant()));
        order16.setId(123L);
        LocalDateTime atStartOfDayResult33 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order16.setLastUpdated(Date.from(atStartOfDayResult33.atZone(ZoneId.of("UTC")).toInstant()));
        order16.setOrderItems(new HashSet<>());
        order16.setOrderTrackingNumber("42");
        order16.setShippingAddress(new Address());
        order16.setStatus("Status");
        order16.setTotalPrice(null);
        order16.setTotalQuantity(1);

        Address address22 = new Address();
        address22.setCity("Oxford");
        address22.setCountry("GB");
        address22.setId(123L);
        address22.setOrder(order16);
        address22.setState("MD");
        address22.setStreet("Street");
        address22.setZipcode("21654");

        Order order17 = new Order();
        order17.setBillingAddress(address21);
        order17.setCustomer(customer11);
        LocalDateTime atStartOfDayResult34 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order17.setDateCreated(Date.from(atStartOfDayResult34.atZone(ZoneId.of("UTC")).toInstant()));
        order17.setId(123L);
        LocalDateTime atStartOfDayResult35 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order17.setLastUpdated(Date.from(atStartOfDayResult35.atZone(ZoneId.of("UTC")).toInstant()));
        order17.setOrderItems(new HashSet<>());
        order17.setOrderTrackingNumber("42");
        order17.setShippingAddress(address22);
        order17.setStatus("Status");
        order17.setTotalPrice(BigDecimal.valueOf(42L));
        order17.setTotalQuantity(1);

        Address address23 = new Address();
        address23.setCity("Oxford");
        address23.setCountry("GB");
        address23.setId(123L);
        address23.setOrder(order17);
        address23.setState("MD");
        address23.setStreet("Street");
        address23.setZipcode("21654");

        Purchase purchase1 = new Purchase();
        purchase1.setBillingAddress(address14);
        purchase1.setCustomer(customer7);
        purchase1.setOrder(order14);
        purchase1.setOrderItems(new HashSet<>());
        purchase1.setShippingAddress(address23);
        assertNotEquals(purchase, purchase1);
    }
}

