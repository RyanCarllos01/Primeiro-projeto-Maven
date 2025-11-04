package br.com.dio.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import br.com.dio.dto.UserDTO;
import br.com.dio.model.UserModel;

@Mapper(componentModel = "spring") // opcional, útil se usar Spring
public interface UserMapper {

    @Mapping(target = "code", source = "id")
    @Mapping(target = "userName", source = "name")
    UserModel toModel(UserDTO dto);

    @Mapping(target = "id", source = "code")
    @Mapping(target = "name", source = "userName")
    UserDTO toDTO(UserModel model);
}

