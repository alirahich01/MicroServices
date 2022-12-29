package com.Models;


import lombok.*;
import org.springframework.data.annotation.Id;

@Data @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Profile {
    @Id
    private String id;
    private String name;
    private String adresseWallets;


}
