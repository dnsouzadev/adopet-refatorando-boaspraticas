package br.com.dnsouzadev;

import br.com.dnsouzadev.client.ClientHttpConfiguration;
import br.com.dnsouzadev.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command {

    @Override
    public void execute() {
        var client = new ClientHttpConfiguration();
        var abrigoService = new AbrigoService(client);
        try {
            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
