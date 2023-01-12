package com.sosa.productservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sosa.productservice.dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@RequiredArgsConstructor
class ProductServiceApplicationTests {

//	private final MockMvc mockMvc;
//
//	private final ObjectMapper objectMapper;
//
//	@Container
//	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.1");
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry registry) {
//		registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}
//
////	@Test
//	void shouldCreateProduct() throws Exception {
//
//		var product = getProductRequest();
//
//		var productJson = objectMapper.writeValueAsString(product);
//
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//				.contentType("application/json")
//				.content(productJson))
//				.andExpect(status().isCreated());
//
//	}
//
//	private ProductRequest getProductRequest() throws Exception {
//		return ProductRequest.builder()
//				.name("test")
//				.description("test")
//				.price(BigDecimal.valueOf(10.0))
//				.build();
//	}

}
