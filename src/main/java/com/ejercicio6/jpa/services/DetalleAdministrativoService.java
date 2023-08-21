package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.DetalleAdministrativo;

import java.util.Set;

public interface DetalleAdministrativoService {

    DetalleAdministrativo crearDetalleAdministrativo(DetalleAdministrativo detalleadministrativo) throws Exception;

    DetalleAdministrativo actualizarDetalleAdministrativo(DetalleAdministrativo detalleadministrativo);

    void eliminarDetalleAdministrativo(Long id) throws Exception;

    DetalleAdministrativo obtenerDetalleAdministrativo(Long id) throws Exception;

    Set<DetalleAdministrativo> listarDetalleAdministrativos();
}
