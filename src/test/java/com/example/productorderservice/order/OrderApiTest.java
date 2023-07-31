package com.example.productorderservice.order;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.productorderservice.ApiTest;
import com.example.productorderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class OrderApiTest extends ApiTest {

    @Test
    void 상품주문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final var request = OrderSteps.상품주문요청_생성();
        final var response = OrderSteps.상품주문요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }
}
