package com.dataqueries;

import com.dataqueries.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryRun implements CommandLineRunner {

    private final BalanceRepository balanceRepository;
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final AddressRepository addressRepository;
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final CustomerRepository customerRepository;
    private final DiscountRepository discountRepository;
    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;

    public QueryRun(BalanceRepository balanceRepository, CategoryRepository categoryRepository, ProductRepository productRepository, AddressRepository addressRepository, CartRepository cartRepository, CartItemRepository cartItemRepository, CustomerRepository customerRepository, DiscountRepository discountRepository, OrderRepository orderRepository, PaymentRepository paymentRepository) {
        this.balanceRepository = balanceRepository;
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.addressRepository = addressRepository;
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.customerRepository = customerRepository;
        this.discountRepository = discountRepository;
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        /// ### Address Repository ####
//        System.out.println("Top 5 balance: "+balanceRepository.findTop5ByBalance());
//        System.out.println("Address starts with: "+ addressRepository.findByStreetStartsWith("Main"));
//        System.out.println(addressRepository.findByCustomerId(160));
//        System.out.println(addressRepository.findByCustomerId(160));

        /// ### Balance Repository ####
//        System.out.println(balanceRepository.retrieveTop5Amount());
//        System.out.println(balanceRepository.retrieveBalanceGreaterThanOrEqual(900));
//        System.out.println(balanceRepository.retrieveBalanceLessThan(100));

        /// ####

  }
}
