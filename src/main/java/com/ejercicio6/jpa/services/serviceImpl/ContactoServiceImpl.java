package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Contacto;
import com.ejercicio6.jpa.services.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejercicio6.jpa.repositories.ContactoRepository;

import java.util.List;

@Service
public class ContactoServiceImpl implements ContactoService {
    private final ContactoRepository contactoRepository;

    @Autowired
    public ContactoServiceImpl(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    @Override
    public Contacto agrergarContacto(Contacto contacto) throws Exception {
        Contacto contactoLocal = contactoRepository.findById(contacto.getId()).orElse(null);
        if(contactoLocal != null){
            throw new Exception("Ya existe un contacto con ese id");
        }else{
            contactoLocal = contactoRepository.save(contacto);

        }
        return contactoLocal;
    }

    @Override
    public Contacto obtenerContactoPorId(Long id) {
        return contactoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarContacto(Long id) {
        contactoRepository.deleteById(id);
    }

    @Override
    public Contacto actualizarContacto(Contacto contacto) throws Exception {
        return contactoRepository.save(contacto);
    }

    @Override
    public List<Contacto> obtenerContactos() {
        return contactoRepository.findAll();
    }
}
