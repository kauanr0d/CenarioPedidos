package com.kauan.PedidoDeVendas.config;

import com.kauan.PedidoDeVendas.domain.Cliente;
import com.kauan.PedidoDeVendas.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public void run(String... args) throws Exception {
        Cliente cliente = new Cliente(null,"Kauan Kenney Dias","Bosta@email123.com","1232456789");
        clienteRepository.save(cliente);
    }
}
