package br.com.someapp.framework.adapter.in;

import br.com.someapp.application.usecase.GetUsersUseCase;
import br.com.someapp.application.usecase.PostUsersUseCase;
import br.com.someapp.domain.dto.UserDto;
import org.jboss.resteasy.reactive.RestPath;
import org.jboss.resteasy.reactive.RestQuery;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customer/v1")
public class ApiControllerRestIn {
    @Inject
    private GetUsersUseCase getUsersUseCase;

    @Inject
    private PostUsersUseCase postUsersUseCase;

    @GET
    @Path("/{documentNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserDto getUserByDocumentNumber(@RestPath String documentNumber) throws Exception {
        return getUsersUseCase.getUserByDocumentNumber(documentNumber);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDto> getUser() throws Exception {
        return getUsersUseCase.getAllUsers();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public UserDto createUser(UserDto user) throws Exception {
        System.out.println("aqui");
        System.out.println(user);
        return postUsersUseCase.createUser(user);
    }
}
