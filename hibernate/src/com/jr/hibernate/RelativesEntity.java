package com.jr.hibernate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "relatives", schema = "hibernate", catalog = "")
public class RelativesEntity {
    private String name;
    private String birth;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "birth")
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelativesEntity that = (RelativesEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(birth, that.birth);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, birth);
    }
}
