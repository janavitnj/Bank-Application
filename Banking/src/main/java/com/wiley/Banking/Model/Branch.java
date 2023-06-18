package com.wiley.Banking.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Branch {

    @Id
    private int branch_id;
    private String location;
    private int branch_password;
    private int ho_id;
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name= "ho_id", insertable = false, updatable = false, referencedColumnName = "ho_id")
    @JsonBackReference(value="branch_ref")
    private HeadOffice headOffice;
}
