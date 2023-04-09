package com.tech.demo.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "credit_cards")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {
    @Id
    private String id;
    private String number;
    private String name;
    private Double balance;
}
