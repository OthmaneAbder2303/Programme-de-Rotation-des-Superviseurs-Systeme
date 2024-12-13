package ma.ensa.programmederotationdessuperviseurssysteme.utils;

import ma.ensa.programmederotationdessuperviseurssysteme.models.Membre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MembreCsvImporter {
    public Set<Membre> chargerListeMembre(String nomFichier) {
        Set<Membre> membres = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = generateRandomId();
                    membres.add(new Membre(id, parts[0], parts[1], parts[2], parts[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return membres;
    }

    private String generateRandomId() {
        return "ID" + (int)(Math.random() * 10000);
    }
}
