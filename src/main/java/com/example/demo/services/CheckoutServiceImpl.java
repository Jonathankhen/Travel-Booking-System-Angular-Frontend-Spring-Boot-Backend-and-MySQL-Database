package com.example.demo.services;

import com.example.demo.dao.CartRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Cart;
import com.example.demo.entities.CartItem;
import com.example.demo.entities.StatusType;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final CartRepository cartRepository;

    public CheckoutServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        // retrieve data for cart and cartItems
        Cart cart = purchase.getCart();
        Set<CartItem> cartItems = purchase.getCartItems();

        // associate cart with cartItems
        cartItems.forEach(cart::addCartItem);

        // generate order tracking number and set cart.orderTrackingNumber
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        // set cart.status to "ordered"
        cart.setStatus(StatusType.ordered);

        // save cart to the database
        cartRepository.save(cart);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private PurchaseResponse handleEmptyCart() {
        return new PurchaseResponse("Your cart is empty. Please add items before placing an order. No data has been saved.");
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
