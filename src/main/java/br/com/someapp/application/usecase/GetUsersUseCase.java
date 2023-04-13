package br.com.someapp.application.usecase;

import br.com.someapp.domain.dto.UserDto;

import java.util.List;

public interface GetUsersUseCase {
    public UserDto getUserByDocumentNumber(String documentNumber) throws Exception;
    public List<UserDto> getAllUsers() throws Exception;
}
