package codeinnnova.ObjectPublication.repository;

import codeinnnova.ObjectPublication.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PublicationRepository extends JpaRepository <Publication, Integer>{

}