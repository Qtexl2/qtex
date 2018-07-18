package com.qtex.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "card")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "card_card_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
    @Column(name = "card_id")
    private Long id;
    @Column(name = "qr_code")
    private String qrCode;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "verification_key")
    private String verificationKey;
}
