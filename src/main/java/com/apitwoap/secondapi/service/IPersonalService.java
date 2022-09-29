package com.apitwoap.secondapi.service;

import com.apitwoap.secondapi.model.Persona;

import java.util.List;

public interface IPersonalService {

    public List<Persona> getPersonas();

    public void savePersona (Persona perso);

    public void deletePersona (Long id);

    public Persona findPersona (Long id);

}
