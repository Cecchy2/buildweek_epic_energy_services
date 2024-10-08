package epic_team6.buildweek_epic_energy_services.repositories;

import epic_team6.buildweek_epic_energy_services.entities.Indirizzo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IndirizziRepository extends JpaRepository<Indirizzo, UUID> {

}
