package dev.naimsulejmani.grupi3layoutexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    private String id;
    private String name;
    private String description;
    private String professor;
    private String semester;

}
