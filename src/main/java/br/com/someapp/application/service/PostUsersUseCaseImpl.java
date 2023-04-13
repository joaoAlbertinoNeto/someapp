package br.com.someapp.application.service;

import br.com.someapp.application.port.out.UsersDbPortOut;
import br.com.someapp.application.usecase.PostUsersUseCase;
import br.com.someapp.domain.dto.UserDto;
import br.com.someapp.framework.helper.Mapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PostUsersUseCaseImpl implements PostUsersUseCase {

    @Inject
    UsersDbPortOut usersDbPortOut;

    @Inject
    Mapper mapper;

    @Override
    public UserDto createUser(UserDto userDto) throws Exception {
        return mapper.convert(usersDbPortOut.createUser(userDto));
    }
}
