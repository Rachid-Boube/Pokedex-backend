package com.pokedex.entite;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles") // Utilisation de la collection MongoDB
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id // Identifiant unique dans MongoDB
    private String id; // Mongo utilise un type String pour l'ID, mais peut aussi utiliser ObjectId

    private TypeRole libelle; // Le rôle (en énumération)
}

