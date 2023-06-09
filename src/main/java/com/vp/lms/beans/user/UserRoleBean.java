package com.vp.lms.beans.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_role")
public class UserRoleBean implements Serializable {

    @Id
    @Column(length = 50)
    private String id;
    private boolean disabled;
    private boolean deleted;

}

