package com.raj.publisher;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

@ExtendWith(MockitoExtension.class)
public class GpayTest {
	@Mock
	ApplicationEventPublisher eventpublisher;

	@InjectMocks
	Gpay gpay;

	@Test
	void testsuccesssendmail() {
		int ret = gpay.sendmoney("raju", 120, false);
		assertEquals(ret, 1);
	}

	@Test
	void testfailuresendmail() {
		int ret = gpay.sendmoney("raju", 112, true);
		assertEquals(ret, 0);
	}

}
