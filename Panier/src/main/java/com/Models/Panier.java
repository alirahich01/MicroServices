package com.Models;


import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Panier {
    @Id
    private String id;
    private String adresseWallets;
    private String items;
}
