package br.com.someapp.application.usecase;

import br.com.someapp.domain.dto.UserDto;

public interface PostUsersUseCase {
    public UserDto createUser(UserDto userDto) throws Exception;
}
