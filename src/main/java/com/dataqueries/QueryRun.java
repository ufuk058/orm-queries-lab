package com.dataqueries;

import com.dataqueries.enums.CartState;
import com.dataqueries.enums.DiscountType;
import com.dataqueries.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

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

    public QueryRun(BalanceRepository balanceRepository, CategoryRepository categoryRepository,
                    ProductRepository productRepository, AddressRepository addressRepository,
                    CartRepository cartRepository, CartItemRepository cartItemRepository,
                    CustomerRepository customerRepository, DiscountRepository discountRepository,
                    OrderRepository orderRepository, PaymentRepository paymentRepository) {

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

        /// #### CartItem Repository ####

//        System.out.println("Count of all cart items: "+ cartItemRepository.countAllBy());
//        System.out.println("With Spec Cart State: "+ cartItemRepository.findAllByCart_CartState(CartState.CREATED));
//        System.out.println("Cart State And Product Name: "+cartItemRepository.retrieveCartItemsByCartStateAndProductName("CREATED","Cheese"));
//        System.out.println("Spec Cart Item without Discount: "+
//                cartItemRepository.retrieveCartItemsByCartStateWithoutDiscount("Cheese"));

        /// ####### Cart Repository ######
//        System.out.println(cartRepository.findAllByDiscount_DiscountType(DiscountType.AMOUNT_BASED));
//        System.out.println("Cart with spec customer id: "+cartRepository.retrieveCartListByCustomer(1L));

        /// ##### Category Repository €######
//        System.out.println("Category By name: "+ categoryRepository.findByName("Termite Control"));
//        System.out.println(categoryRepository.findTop3ByOrderByNameDesc());

        /// ### Customer Repository ####
//        System.out.println(customerRepository.findByUserName("asturton0"));
//        System.out.println(customerRepository.retrieveCustomerByEmail("cmulqueeny1@networkadvertising.org"));

        /// ### Discount Repository ####
//        System.out.println(discountRepository.findAllByDiscountGreaterThan(new BigDecimal(20)));
//        System.out.println(discountRepository.findAllByDiscountType(DiscountType.AMOUNT_BASED));
//        System.out.println(discountRepository.retrieveAllDiscountBetween(new BigDecimal(40),new BigDecimal(55)));


        /// #### Order Repository #####
//        System.out.println(orderRepository.findTop5ByOrderByTotalPrice());
//        System.out.println(orderRepository.existsByCustomerEmail("cmulqueeny1@networkadvertising.org"));
//        System.out.println(orderRepository.retrieveAllOrdersTotalPriceAndPaidPrice());

        /// ### Payment Repository ####
//        System.out.println(paymentRepository.retrievePaidPriceSum());
//        System.out.println(paymentRepository.retrieveAveragePaidPrice());

        /// ### Product Repository ###
//        System.out.println(productRepository.findFirstByName("Cheese"));
        System.out.println(productRepository.countProductByPriceGreaterThan(new BigDecimal(30)));












  }

}
