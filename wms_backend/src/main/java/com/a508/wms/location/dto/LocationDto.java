package com.a508.wms.location.dto;

import com.a508.wms.floor.dto.FloorDto;
import com.a508.wms.util.constant.StatusEnum;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class LocationDto {

    private Long id;
    private Long warehouseId;
    private Long productStorageTypeId;
    private String name;
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private List<FloorDto> floorDtos;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private StatusEnum statusEnum;

}
