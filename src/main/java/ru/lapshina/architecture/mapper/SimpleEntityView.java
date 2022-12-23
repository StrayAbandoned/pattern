package ru.lapshina.architecture.mapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SimpleEntityView {
    private Long id;
    private String name;
    private Property property;
}
