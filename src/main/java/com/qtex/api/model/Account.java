package com.qtex.api.model;

import com.qtex.api.enums.AccountStatus;
import com.qtex.api.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Account")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @SequenceGenerator(name = "pk_sequence", sequenceName = "card_card_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
    @Column(name = "account_id")
    private Long id;
    @Column(name = "qr_code")
    private String qrCode;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;
    @Temporal(TemporalType.DATE)
    @Column(name = "birthday")
    private Date birthday;
    @CreatedDate
    @Column(name = "created_at")
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AccountStatus status;
}
