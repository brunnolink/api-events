package com.events.api.dto.coupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {}
