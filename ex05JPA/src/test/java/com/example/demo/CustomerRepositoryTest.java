package com.example.demo;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNull;

import java.beans.Transient;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Rollback;

import com.example.demo.customer.repository.Address;
import com.example.demo.customer.repository.AddressRepository;
import com.example.demo.customer.repository.Customer;
import com.example.demo.customer.repository.CustomerRepository;

//@Rollback
//@Transactional
@SpringBootTest
public class CustomerRepositoryTest {
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;

	public void init() {
		 // given 샘플등록
		  customerRepository.deleteAll();
		  customerRepository.save(Customer.builder().name("오길동").phone("010-1111-2222").age(15).build());
		  customerRepository.save(Customer.builder().name("박길동").phone("010-2222-2222").age(25).build());
		  customerRepository.save(Customer.builder().name("정길동").phone("010-3333-2222").age(35).build());
		  customerRepository.save(Customer.builder().name("고길동").phone("010-4444-2222").age(20).build());
	}
	
	// 나이조회 
	// @Transient
	@Rollback
	// @Test
	public void ageBettwen() {

		// when
		List<Customer> list = customerRepository.findByAgeBetween(20, 30);

		// then
		assertEquals(list.size(), 2);
	}
	
	// 이름 조회 
	// @Test
	public void findByNameContaining() {
		List<Customer> list = customerRepository.findByNameContaining("고길동");
		assertEquals(list.size(), 1);
	}
	// @Test
	public void findByName() {
		List<Customer> list = customerRepository.findByName("박길동", 25);
		assertEquals(list.size(), 1);
	}
	
	// @Test
	public void getName() {
		List<String> name = customerRepository.getName();
		System.out.println(name);
	}
	@Test
	public void getAge() {
		List<Object[]> age = customerRepository.getNameAge();
		// System.out.println(age);
		age.stream().forEach( a -> System.out.println(age));
	}
	 @Test
	  void onetoOneAddressOwnerTest() {
		  Customer customerentity = Customer.builder().name("박길동").build();
		  customerRepository.save(customerentity);
		  
		  Address addressEntity = Address.builder().zipcode("04411")
				  								   .address("대구광역시 중구")
				  								   .customer(customerentity)
				  								   .build();
		  addressRepository.save(addressEntity);
		  
		  //Address address = addressRepository.;
		  
		
	  }

	// @Test
	// 등록
//  public void insert() {
//	  // given
//	
//	  // when 
//	  Customer result = customerRepository.save(customer);
//	  // then
//	  Customer cust = customerRepository.findById(result.getId()).get();
//	  assertEquals( cust.getName(), "홍길동");
//	 
//  }
//  // 수정 
//  // @Test
//  public void update() {
//	  // given
//	  Customer customer = Customer.builder().id(1L).name("김길동");
//	  // when
//	 
//	  customerRepository.save(cust);
//	  customerRepository.flush();
//	  // then 
//	  assertEquals(customerRepository.findById(1L).get().getName(), "김길동");
//  }
//  // 삭제 
//  // @Test
//  public void delete() {
//	  // given
//	  Customer cust = customerRepository.findById(1L).get();
//	  // when
//	  customerRepository.delete(cust);
//	  // then 
//	  // assertNull(customerRepository.findById(1L).isEmpty());
//  }

}
