package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.DetalleAdministrativo;
import com.ejercicio6.jpa.repositories.DetalleAdministrativoRepository;
import com.ejercicio6.jpa.services.DetalleAdministrativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class DetalleAdministrativoServiceImpl implements DetalleAdministrativoService {

    private final DetalleAdministrativoRepository detalleadministrativoRepository;

    @Autowired
    public DetalleAdministrativoServiceImpl(DetalleAdministrativoRepository detalleadministrativoRepository) {
        this.detalleadministrativoRepository = detalleadministrativoRepository;
    }
    @Override
    @Transactional
    public DetalleAdministrativo crearDetalleAdministrativo(DetalleAdministrativo detalleadministrativo) throws Exception {
        DetalleAdministrativo detalleAdministrativoLocal = detalleadministrativoRepository.findByUsuariorol(detalleadministrativo.getUsuariorol());
        if (detalleAdministrativoLocal != null) {
            throw new Exception("El detalleadministrativo ya existe");
        } else {
            detalleAdministrativoLocal = detalleadministrativoRepository.save(detalleadministrativo);
        }
        return detalleAdministrativoLocal;

    }

    @Override
    @Transactional
    public DetalleAdministrativo actualizarDetalleAdministrativo(DetalleAdministrativo detalleadministrativo) {
        return detalleadministrativoRepository.save(detalleadministrativo);
    }

    @Override
    @Transactional
    public void eliminarDetalleAdministrativo(Long id) throws Exception {
        detalleadministrativoRepository.deleteById(id);

    }

    @Override
    @Transactional(readOnly = true)
    public DetalleAdministrativo obtenerDetalleAdministrativo(Long id) throws Exception {

        return detalleadministrativoRepository.findById(id).orElseThrow(() -> new Exception("El detalleadministrativo no existe."));
    }

    @Override
    @Transactional(readOnly = true)
    public Set<DetalleAdministrativo> listarDetalleAdministrativos() {
        return new HashSet<>(detalleadministrativoRepository.findAll());
    }
}
