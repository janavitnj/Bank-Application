package com.wiley.Banking.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Manager {

    @Id
    private int manager_id;
    private String name;
    private String password;
    private int branch_password;

}
