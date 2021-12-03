package fr.sauveteurdudunkerquois.backend.app;

import fr.sauveteurdudunkerquois.backend.data.DataIdentity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BackendRepository extends CrudRepository<DataIdentity, Long> {}
