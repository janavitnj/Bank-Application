package com.wiley.Banking.Model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HeadOffice {

    @Id
    private int ho_id;
    private String location;
    @OneToMany(targetEntity = Branch.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "headOffice")
    @JsonManagedReference(value="branch_ref")
    private List<Branch> branches;
}
