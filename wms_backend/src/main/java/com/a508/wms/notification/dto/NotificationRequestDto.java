package com.a508.wms.notification.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class NotificationRequestDto {
    private Long businessId;
    private Long key;

}
