package ma.ensa.programmederotationdessuperviseurssysteme.dao.impl;

import ma.ensa.programmederotationdessuperviseurssysteme.dao.MembreDao;
import ma.ensa.programmederotationdessuperviseurssysteme.models.Membre;

import java.util.HashSet;
import java.util.Set;

public class MembreDaoImp implements MembreDao {

    private Set<Membre> membres = new HashSet<>();

    @Override
    public void inserer(Membre membre) {
        membres.add(membre);
    }

    @Override
    public Set<Membre> chargerListIncidents() {
        return membres;
    }
}
