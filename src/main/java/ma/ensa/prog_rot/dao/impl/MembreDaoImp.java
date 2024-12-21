package ma.ensa.prog_rot.dao.impl;

import ma.ensa.prog_rot.dao.MembreDao;
import ma.ensa.prog_rot.models.Membre;

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

    @Override
    public Set<Membre> getAllMembres() {
        return membres;
    }
}
