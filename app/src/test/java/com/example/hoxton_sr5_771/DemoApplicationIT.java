package com.example.hoxton_sr5_771;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode.LOCAL;

@SpringBootTest
@AutoConfigureStubRunner(stubsMode = LOCAL, ids = {"com.example.hoxton_sr5_771:app:+:stubs:8081"})
class DemoApplicationIT {
    @Test
    void happyFlow() {
        assertTrue(true);
    }
}
