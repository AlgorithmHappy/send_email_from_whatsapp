package dev.gerardomarquez.sendEmailFromWhatsapp.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import dev.gerardomarquez.sendEmailFromWhatsapp.projections.OnlyNameUserProjection;
import dev.gerardomarquez.sendEmailFromWhatsapp.repositories.AllowNamesUsersRepository;
import dev.gerardomarquez.sendEmailFromWhatsapp.responses.PageResponse;
import dev.gerardomarquez.sendEmailFromWhatsapp.responses.Response;
import dev.gerardomarquez.sendEmailFromWhatsapp.responses.UserNameResponse;

/*
 * {@inheritDoc}
 */
@Service
public class AllowUsersSendEmailFromWhatsappServiceImplementation implements AllowUsersSendEmailFromWhatsappServiceInterface {

    @Autowired
    private AllowNamesUsersRepository allowNamesUsersRepository;

    /*
    * {@inheritDoc}
    */
    @Override
    public Response<PageResponse<UserNameResponse>> getAllNamesUsers(Pageable pageable) {
        
        Page<OnlyNameUserProjection> page = allowNamesUsersRepository.findAllNames(pageable);
        
        List<UserNameResponse> listUserNameResponse = page
            .stream()
            .map(it -> new UserNameResponse(it.getFullName() ) )
            .collect(Collectors.toList() );

        PageResponse<UserNameResponse> pageResponse = PageResponse.<UserNameResponse>builder()
            .totalElements(page.getTotalElements())
            .pageSize(page.getSize())
            .pageNumber(page.getNumber())
            .content(listUserNameResponse)
            .build();

        Response response = new Response<PageResponse<UserNameResponse> >(
            Boolean.TRUE,
            "Operacion correcta",
            pageResponse
        );

        return response;
    }

}
