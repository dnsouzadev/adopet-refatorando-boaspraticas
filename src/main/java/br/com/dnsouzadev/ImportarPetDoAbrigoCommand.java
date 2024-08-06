package br.com.dnsouzadev;

import br.com.dnsouzadev.client.ClientHttpConfiguration;
import br.com.dnsouzadev.service.PetService;

import java.io.IOException;

public class ImportarPetDoAbrigoCommand implements Command {

    @Override
    public void execute() {
        var client = new ClientHttpConfiguration();
        PetService petService = new PetService(client);
        try {
            petService.importarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
