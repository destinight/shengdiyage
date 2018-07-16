/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package us.shengdiyage.cms.service;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Health indicator
 */
@Component
public class CustomHealthIndicator implements HealthIndicator{
    @Override
    public Health health() {
        return Health.up().build();
    }
}