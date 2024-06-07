package codeinnnova.ObjectPublication;

import codeinnnova.ObjectPublication.entities.Publication;
import codeinnnova.ObjectPublication.repository.PublicationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObjectPublicationApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObjectPublicationApplication.class, args);
		//context.getBean(PublicationRepository.class);
		PublicationRepository repository = context.getBean(PublicationRepository.class);

		// CRUD
		// crear publicación CREATED
		String[] multimediacomment = {"URLcomment"};
		String[] multimedia = {"URLimage", "URLvidio"};
		String[] etiquetas = {"#recicla", "#ReduceReciduos"};
		Publication.Comment comment1 = new Publication.Comment(null,2,"Que buena actividad",multimediacomment);
		Publication publication1 = new Publication(null,1,"DIA DE SIEMBRA","Hoy nos encontramos sembrando arboles en el municipio de La Vega",multimedia,etiquetas,3,1,comment1);

		String[] multimediacomment2 = {"URLcomment2"};
		String[] multimedia2 = {"URLimage", "URLvidio"};
		String[] etiquetas2 = {"#recicla", "#ReduceReciduos"};
		Publication.Comment comment2 = new Publication.Comment(null,1,"Que buena actividad",multimediacomment2);
		Publication publication2 = new Publication(null,2,"RECICLA PRODUCTOS","el reciclaje es una alternativa para reducir la contaminación",multimedia2,etiquetas2,2,0,comment2);

		// almacenar Publicaciones en READ
		System.out.println("CANTIDAD DE PUBLICACIONES" + repository.findAll().size());
		repository.save(publication1);
		repository.save(publication2);

		// recuperar todas las PUBLICACIONES UPDATE
		System.out.println("CANTIDAD DE PUBLICACIONES" + repository.findAll().size());

		// borrar una PUBLICACIÓN DELETED



	}

}
