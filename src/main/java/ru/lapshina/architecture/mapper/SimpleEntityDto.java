package ru.lapshina.architecture.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class SimpleEntityDto {
    private Long id;
    private String name;
    private Property property;

}
