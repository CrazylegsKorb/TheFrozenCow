package com.luv2code.ecommerce.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PaymentInfoTest {
    /**
     * Method under test: {@link PaymentInfo#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new PaymentInfo()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PaymentInfo#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        PaymentInfo paymentInfo = new PaymentInfo();

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency("GBP");
        paymentInfo1.setReceiptEmail("jane.doe@example.org");
        assertTrue(paymentInfo.canEqual(paymentInfo1));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link PaymentInfo}
     *   <li>{@link PaymentInfo#setAmount(int)}
     *   <li>{@link PaymentInfo#setCurrency(String)}
     *   <li>{@link PaymentInfo#setReceiptEmail(String)}
     *   <li>{@link PaymentInfo#getAmount()}
     *   <li>{@link PaymentInfo#getCurrency()}
     *   <li>{@link PaymentInfo#getReceiptEmail()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PaymentInfo actualPaymentInfo = new PaymentInfo();
        actualPaymentInfo.setAmount(10);
        actualPaymentInfo.setCurrency("GBP");
        actualPaymentInfo.setReceiptEmail("jane.doe@example.org");
        assertEquals(10, actualPaymentInfo.getAmount());
        assertEquals("GBP", actualPaymentInfo.getCurrency());
        assertEquals("jane.doe@example.org", actualPaymentInfo.getReceiptEmail());
    }

    /**
     * Method under test: {@link PaymentInfo#equals(Object)}
     */
    @Test
    void testEquals() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        assertNotEquals(paymentInfo, null);
    }

    /**
     * Method under test: {@link PaymentInfo#equals(Object)}
     */
    @Test
    void testEquals2() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        assertNotEquals(paymentInfo, "Different type to PaymentInfo");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PaymentInfo#equals(Object)}
     *   <li>{@link PaymentInfo#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");
        assertEquals(paymentInfo, paymentInfo);
        int expectedHashCodeResult = paymentInfo.hashCode();
        assertEquals(expectedHashCodeResult, paymentInfo.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PaymentInfo#equals(Object)}
     *   <li>{@link PaymentInfo#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency("GBP");
        paymentInfo1.setReceiptEmail("jane.doe@example.org");
        assertEquals(paymentInfo, paymentInfo1);
        int expectedHashCodeResult = paymentInfo.hashCode();
        assertEquals(expectedHashCodeResult, paymentInfo1.hashCode());
    }

    /**
     * Method under test: {@link PaymentInfo#equals(Object)}
     */
    @Test
    void testEquals5() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(1);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("jane.doe@example.org");

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency("GBP");
        paymentInfo1.setReceiptEmail("jane.doe@example.org");
        assertNotEquals(paymentInfo, paymentInfo1);
    }

    /**
     * Method under test: {@link PaymentInfo#equals(Object)}
     */
    @Test
    void testEquals6() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("USD");
        paymentInfo.setReceiptEmail("jane.doe@example.org");

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency("GBP");
        paymentInfo1.setReceiptEmail("jane.doe@example.org");
        assertNotEquals(paymentInfo, paymentInfo1);
    }

    /**
     * Method under test: {@link PaymentInfo#equals(Object)}
     */
    @Test
    void testEquals7() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency(null);
        paymentInfo.setReceiptEmail("jane.doe@example.org");

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency("GBP");
        paymentInfo1.setReceiptEmail("jane.doe@example.org");
        assertNotEquals(paymentInfo, paymentInfo1);
    }

    /**
     * Method under test: {@link PaymentInfo#equals(Object)}
     */
    @Test
    void testEquals8() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail("GBP");

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency("GBP");
        paymentInfo1.setReceiptEmail("jane.doe@example.org");
        assertNotEquals(paymentInfo, paymentInfo1);
    }

    /**
     * Method under test: {@link PaymentInfo#equals(Object)}
     */
    @Test
    void testEquals9() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail(null);

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency("GBP");
        paymentInfo1.setReceiptEmail("jane.doe@example.org");
        assertNotEquals(paymentInfo, paymentInfo1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PaymentInfo#equals(Object)}
     *   <li>{@link PaymentInfo#hashCode()}
     * </ul>
     */
    @Test
    void testEquals10() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency(null);
        paymentInfo.setReceiptEmail("jane.doe@example.org");

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency(null);
        paymentInfo1.setReceiptEmail("jane.doe@example.org");
        assertEquals(paymentInfo, paymentInfo1);
        int expectedHashCodeResult = paymentInfo.hashCode();
        assertEquals(expectedHashCodeResult, paymentInfo1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PaymentInfo#equals(Object)}
     *   <li>{@link PaymentInfo#hashCode()}
     * </ul>
     */
    @Test
    void testEquals11() {
        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setAmount(10);
        paymentInfo.setCurrency("GBP");
        paymentInfo.setReceiptEmail(null);

        PaymentInfo paymentInfo1 = new PaymentInfo();
        paymentInfo1.setAmount(10);
        paymentInfo1.setCurrency("GBP");
        paymentInfo1.setReceiptEmail(null);
        assertEquals(paymentInfo, paymentInfo1);
        int expectedHashCodeResult = paymentInfo.hashCode();
        assertEquals(expectedHashCodeResult, paymentInfo1.hashCode());
    }
}

