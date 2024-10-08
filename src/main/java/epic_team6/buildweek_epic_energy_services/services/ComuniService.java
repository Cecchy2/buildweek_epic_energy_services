package epic_team6.buildweek_epic_energy_services.services;

import epic_team6.buildweek_epic_energy_services.entities.Comune;
import epic_team6.buildweek_epic_energy_services.entities.Provincia;
import epic_team6.buildweek_epic_energy_services.exceptions.NotFoundException;
import epic_team6.buildweek_epic_energy_services.repositories.ComuniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ComuniService {
    @Autowired
    private ComuniRepository comuniRepository;


    public List<Comune> saveAll(List<Comune> comuni){
        return comuniRepository.saveAll(comuni);
    }

    public Comune findById (UUID comune_id){
        return this.comuniRepository.findById(comune_id).orElseThrow(()->new NotFoundException(comune_id));
    }

    public Page<Comune> findAll(int page, int size, String sortBy) {
        if (page > 100) page = 100;
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.comuniRepository.findAll(pageable);
    }
}
