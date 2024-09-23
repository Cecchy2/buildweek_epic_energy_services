package epic_team6.buildweek_epic_energy_services.services;

import epic_team6.buildweek_epic_energy_services.entities.Cliente;
import epic_team6.buildweek_epic_energy_services.exceptions.NotFoundException;
import epic_team6.buildweek_epic_energy_services.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    // Metodo per salvare un cliente
    public Cliente salvaCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Metodo per ottenere tutti i clienti
    public List<Cliente> trovaTuttiClienti() {
        return clienteRepository.findAll();
    }

    public Cliente findById(UUID clienteId) {
        return this.clienteRepository.findById(clienteId).orElseThrow(() -> new NotFoundException(clienteId));
    }

}
