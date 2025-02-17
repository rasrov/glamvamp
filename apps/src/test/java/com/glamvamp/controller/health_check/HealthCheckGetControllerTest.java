package com.glamvamp.controller.health_check;

import com.glamvamp.ApplicationTestCase;
import org.junit.jupiter.api.Test;

public class HealthCheckGetControllerTest extends ApplicationTestCase {

    @Test
    void check_the_app_is_working_ok() {
        assertResponse("/health-check", 200, "{'application':'glamvamp_backend','status':'ok'}");
    }

}
