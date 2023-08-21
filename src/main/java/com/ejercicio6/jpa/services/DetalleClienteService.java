package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.DetalleCliente;

import java.util.Set;

public interface DetalleClienteService {

    DetalleCliente guardarDetalleCliente(DetalleCliente detallecliente) throws Exception;

    DetalleCliente actualizarDetalleCliente(DetalleCliente detallecliente);

    void eliminarDetalleCliente(Long id) ;

    DetalleCliente buscarDetalleCliente(Long id) throws Exception;

    Set<DetalleCliente> obtenerDetalleClientes();



}
