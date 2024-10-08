package epic_team6.buildweek_epic_energy_services.repositories;


import epic_team6.buildweek_epic_energy_services.entities.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProvinceRepository extends JpaRepository<Provincia, UUID> {

    Provincia findByNome (String nome);


}
