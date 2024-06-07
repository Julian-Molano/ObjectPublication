package codeinnnova.ObjectPublication.controllers;

import codeinnnova.ObjectPublication.entities.Publication;
import codeinnnova.ObjectPublication.repository.PublicationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicationController {
    //Atributos

    private PublicationRepository publicationRepository;

    //Constructores

    public PublicationController(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }

    // CRUD
    // Buscar todas las publicaciones (lista de publicaciones)

    /**
    http:localhost:8080/api/publicaciones

    @GetMapping("/api/publicaciones")
    public List<Publication> findAll (){
        // Recupera y devuelve las publicaciones de la base de datos
        return publicationRepository.findAll();
    }

    }





/*
    private PublicationRepository publicationRepository;
    // constructor para repository
    public PublicationController(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }

    //Mirar todos los log In (lista de Log In´s)

     http://localhost:8080/api/logins
     @return

    @GetMapping ("/api/Publication")
    public Publication create (){
        //
        return publicationRepository.findAll();

    }
    */
}