package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.DetalleCliente;
import com.ejercicio6.jpa.repositories.DetalleClienteRepository;
import com.ejercicio6.jpa.services.DetalleClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DetalleClienteServiceImpl implements DetalleClienteService{

    private final DetalleClienteRepository detalleclienteRepository;

    @Autowired
    public DetalleClienteServiceImpl(DetalleClienteRepository detalleclienteRepository) {
        this.detalleclienteRepository = detalleclienteRepository;
    }

    @Override
    public DetalleCliente guardarDetalleCliente(DetalleCliente detallecliente) throws Exception {
        DetalleCliente detalleClienteLocal = detalleclienteRepository.findByUsuariorol(detallecliente.getUsuariorol());

        if (detalleClienteLocal != null) {
            throw new Exception("El detallecliente ya existe");
        } else {
            detalleClienteLocal = detalleclienteRepository.save(detallecliente);
        }
        return detalleClienteLocal;

    }

    @Override
    public DetalleCliente actualizarDetalleCliente(DetalleCliente detallecliente) {
        return detalleclienteRepository.save(detallecliente);
    }

    @Override
    public void eliminarDetalleCliente(Long id) {
        detalleclienteRepository.deleteById(id);

    }

    @Override
    public DetalleCliente buscarDetalleCliente(Long id) throws Exception {
        return detalleclienteRepository.findById(id).orElseThrow(() -> new Exception("El detallecliente no existe."));
    }

    @Override
    public Set<DetalleCliente> obtenerDetalleClientes() {
        return  new HashSet<>(detalleclienteRepository.findAll());
    }
}
