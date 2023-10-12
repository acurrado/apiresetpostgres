package intraway.com.ApiRestPostgresExample.mapper;

import intraway.com.ApiRestPostgresExample.dto.request.UserRequest;
import intraway.com.ApiRestPostgresExample.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User userRequestToUser(UserRequest userRequest);
}
