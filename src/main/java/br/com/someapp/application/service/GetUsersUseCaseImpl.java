package br.com.someapp.application.service;

import br.com.someapp.application.port.out.UsersDbPortOut;
import br.com.someapp.application.usecase.GetUsersUseCase;
import br.com.someapp.domain.dto.UserDto;
import br.com.someapp.framework.helper.Mapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class GetUsersUseCaseImpl implements GetUsersUseCase {

    @Inject
    UsersDbPortOut usersDbPortOut;

    @Inject
    Mapper mapper;

    @Override
    public UserDto getUserByDocumentNumber(String documentNumber) throws Exception {
        return mapper.convert(usersDbPortOut.getUserByDocumentNumber(documentNumber));
    }


    @Override
    public List<UserDto> getAllUsers() throws Exception {
        return mapper.convert(usersDbPortOut.getAllUsers());
    }


}
