package io.neko;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static io.neko.App.greeting;

public class AppTest {
    @Test
    public void testGreeting() {
        assertThat(
            greeting(),
            equalTo("Hello, world!"));
    }
}
