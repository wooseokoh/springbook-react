package com.cos.book.web;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.transaction.annotation.Transactional;
/**
 * 통합 테스트 (모든 bean들을 똑같이 ioc에 올리고 테스트 하는 것)
 * WebEnvironment.MOCK = 실제 톰캣을 올리는게 아니라, 다른 톰켓으로 테스트
 * WebEnvironment.RANDOM_PORT = 실제 톰캣으로 테스트
 * @AutoConfigureMockMvc MockMvc를 Ioc에 등록해줌.
 * @Transactional 은 각 각의 테스트함수가 종료될 때마다 트랜잭션을 rollback 해주는 어노테이션!!
 */

@Transactional
@AutoConfigurationPackage
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class BookControllerIntegreTest {
	
	@Autowired
	private Mock mockMvc;
}
