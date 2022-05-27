package com.luv2code.ecommerce.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PurchaseResponseTest {
    /**
     * Method under test: {@link PurchaseResponse#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PurchaseResponse("foo")).canEqual("42"));
    }

    /**
     * Method under test: {@link PurchaseResponse#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PurchaseResponse purchaseResponse = new PurchaseResponse("foo");
        assertTrue(purchaseResponse.canEqual(new PurchaseResponse("foo")));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurchaseResponse#PurchaseResponse(String)}
     *   <li>{@link PurchaseResponse#getOrderTrackingNumber()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertEquals("42", (new PurchaseResponse("42")).getOrderTrackingNumber());
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new PurchaseResponse("foo"), null);
        assertNotEquals(new PurchaseResponse("foo"), "Different type to PurchaseResponse");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurchaseResponse#equals(Object)}
     *   <li>{@link PurchaseResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        PurchaseResponse purchaseResponse = new PurchaseResponse("foo");
        assertEquals(purchaseResponse, purchaseResponse);
        int expectedHashCodeResult = purchaseResponse.hashCode();
        assertEquals(expectedHashCodeResult, purchaseResponse.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurchaseResponse#equals(Object)}
     *   <li>{@link PurchaseResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PurchaseResponse purchaseResponse = new PurchaseResponse("foo");
        PurchaseResponse purchaseResponse1 = new PurchaseResponse("foo");
        assertEquals(purchaseResponse, purchaseResponse1);
        int expectedHashCodeResult = purchaseResponse.hashCode();
        assertEquals(expectedHashCodeResult, purchaseResponse1.hashCode());
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals4() {
        PurchaseResponse purchaseResponse = new PurchaseResponse(null);
        assertNotEquals(purchaseResponse, new PurchaseResponse("foo"));
    }

    /**
     * Method under test: {@link PurchaseResponse#equals(Object)}
     */
    @Test
    void testEquals5() {
        PurchaseResponse purchaseResponse = new PurchaseResponse("com.luv2code.ecommerce.dto.PurchaseResponse");
        assertNotEquals(purchaseResponse, new PurchaseResponse("foo"));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PurchaseResponse#equals(Object)}
     *   <li>{@link PurchaseResponse#hashCode()}
     * </ul>
     */
    @Test
    void testEquals6() {
        PurchaseResponse purchaseResponse = new PurchaseResponse(null);
        PurchaseResponse purchaseResponse1 = new PurchaseResponse(null);
        assertEquals(purchaseResponse, purchaseResponse1);
        int expectedHashCodeResult = purchaseResponse.hashCode();
        assertEquals(expectedHashCodeResult, purchaseResponse1.hashCode());
    }
}

