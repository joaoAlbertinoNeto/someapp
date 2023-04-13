package br.com.someapp.framework.adapter.out;

import br.com.someapp.application.port.out.UsersDbPortOut;
import br.com.someapp.domain.User;
import br.com.someapp.domain.dto.UserDto;
import br.com.someapp.framework.helper.Mapper;
import br.com.someapp.framework.repository.UsersRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UsersMariaDbAdapterOut implements UsersDbPortOut {

    @Inject
    Mapper mapper;

    @Inject
    UsersRepository usersRepository;

    @Override
    public User createUser(UserDto userDto) throws Exception {
        User user = mapper.convert(userDto);
        return usersRepository.save(user);
    }

    @Override
    public User getUserByDocumentNumber(String documentNumber) throws Exception {
        return usersRepository.findByDocumentNumber(documentNumber);
    }

    @Override
    public List<User> getAllUsersByDocumentNumber(String documentNumber) throws Exception {
        return usersRepository.findAllByDocumentNumber(documentNumber);
    }

    @Override
    public List<User> getAllUsers() throws Exception {
        return usersRepository.findAll();
    }
}
