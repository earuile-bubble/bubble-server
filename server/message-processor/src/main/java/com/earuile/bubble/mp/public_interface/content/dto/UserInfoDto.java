package com.earuile.bubble.mp.public_interface.content.dto;

import lombok.Builder;

@Builder
public record UserInfoDto(
        String id,
        String login,
        String name
) {
}