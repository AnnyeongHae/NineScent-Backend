package shop.ninescent.cart.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.ninescent.cart.domain.CartItem;
import shop.ninescent.cart.repository.CartRepository;
import shop.ninescent.cart.service.CartService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;

    @GetMapping("/{cartId}")
    public ResponseEntity<List<CartItem>> getCartItems(@PathVariable Long cartId) {
        return ResponseEntity.ok(cartService.getAllItems(cartId));
    }
}