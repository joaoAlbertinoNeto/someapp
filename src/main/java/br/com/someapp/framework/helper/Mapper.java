package br.com.someapp.framework.helper;

import br.com.someapp.domain.User;
import br.com.someapp.domain.dto.UserDto;

import javax.enterprise.context.ApplicationScoped;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class Mapper {
    public UserDto convert(User user){
        if(Objects.nonNull(user)){
            return UserDto.builder().age(user.getAge()).name(user.getName()).documentNumber(user.getDocumentNumber()).position(user.getPosition()).build();
        }
        return null;

    }

    public User convert(UserDto user){
        if(Objects.nonNull(user)) {
            return User.builder().age(user.getAge()).name(user.getName()).documentNumber(user.getDocumentNumber()).position(user.getPosition()).build();
        }
        return null;
    }

    public List<UserDto> convert(List<User> users){
        if(Objects.nonNull(users) && users.size() > 0) {
            List<UserDto> userDtos = new LinkedList<>();
            users.forEach(user -> {
                userDtos.add(convert(user));
            });
            return userDtos;
        }
        return null;
    }
}