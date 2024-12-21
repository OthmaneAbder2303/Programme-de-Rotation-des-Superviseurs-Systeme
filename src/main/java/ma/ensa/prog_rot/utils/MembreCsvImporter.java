package ma.ensa.prog_rot.utils;

import ma.ensa.prog_rot.dao.MembreDao;
import ma.ensa.prog_rot.models.Membre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MembreCsvImporter {

    // The method now accepts two arguments: the CSV file path and the MembreDao
    public Set<Membre> chargerListeMembre(String nomFichier, MembreDao membreDao) {
        Set<Membre> membres = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                // Check if the line contains exactly 4 fields: nom, prenom, email, phone
                if (parts.length == 4) {
                    String id = generateRandomId();  // Generate a random ID for each Membre
                    Membre membre = new Membre(id, parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim());

                    // Add the Membre to the set (avoiding duplicates)
                    if (membres.add(membre)) {
                        membreDao.inserer(membre);  // Insert the Membre into the MembreDao
                    }
                } else {
                    System.out.println("Skipping invalid line (incorrect format): " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Imported " + membres.size() + " unique members.");
        return membres;
    }

    // Generate a random ID (could be improved for better uniqueness)
    private String generateRandomId() {
        return "ID" + (int)(Math.random() * 10000);
    }
}
