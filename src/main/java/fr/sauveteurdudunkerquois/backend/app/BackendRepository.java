package fr.sauveteurdudunkerquois.backend.app;

import fr.sauveteurdudunkerquois.backend.data.DataIdentity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BackendRepository implements CrudRepository<DataIdentity, Long> {
    @Override
    public <S extends DataIdentity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends DataIdentity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<DataIdentity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<DataIdentity> findAll() {
        return null;
    }

    @Override
    public Iterable<DataIdentity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {}

    @Override
    public void delete(DataIdentity entity) {}

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {}

    @Override
    public void deleteAll(Iterable<? extends DataIdentity> entities) {}

    @Override
    public void deleteAll() {}
}
