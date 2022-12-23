package ru.lapshina.architecture.mapper;

public class SimpleMapper {
    public SimpleEntityDto mapToDto(SimpleEntityView view){
        return SimpleEntityDto.builder().id(view.getId())
                .name(view.getName()).property(view.getProperty()).build();
    }
}
