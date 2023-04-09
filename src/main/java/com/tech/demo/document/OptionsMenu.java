package com.tech.demo.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "option_menu")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OptionsMenu {

    @Id
    private String id;
    private String name;
}
