package com.apitwoap.secondapi.service;

import com.apitwoap.secondapi.model.Persona;
import com.apitwoap.secondapi.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonalService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        personaRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = personaRepository.findById(id).orElse(null);
        return perso;
    }
}
