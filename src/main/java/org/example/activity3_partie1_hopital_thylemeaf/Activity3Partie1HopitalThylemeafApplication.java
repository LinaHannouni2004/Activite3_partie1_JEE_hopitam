package org.example.activity3_partie1_hopital_thylemeaf;

import org.example.activity3_partie1_hopital_thylemeaf.entities.patient;
import org.example.activity3_partie1_hopital_thylemeaf.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Activity3Partie1HopitalThylemeafApplication implements CommandLineRunner {
    @Autowired
private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Activity3Partie1HopitalThylemeafApplication.class, args);
    }

    public void run(String... args) throws Exception {
        patient patient=new patient();
        patient.setId(null);
        patient.setNom("mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(230);


        patient patient2 =new patient(null,"yassine",new Date(),false,123);

        patient patient3 =patient.builder()
                .nom("imane")
                .dateNaissance(new Date())
                .score(530)
                .malade(true)
                .build();
        patientRepository.save(patient);
        patientRepository.save(patient2);
        patientRepository.save(patient3);

    }
}
