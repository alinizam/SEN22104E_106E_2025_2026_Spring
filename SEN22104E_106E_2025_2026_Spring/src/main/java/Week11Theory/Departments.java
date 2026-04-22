/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ali.nizam
 */
@Entity
@Table(name = "departments")
@NamedQueries({
    @NamedQuery(name = "Departments.findAll", query = "SELECT d FROM Departments d"),
    @NamedQuery(name = "Departments.findByDepartmentId", query = "SELECT d FROM Departments d WHERE d.departmentId = :departmentId"),
    @NamedQuery(name = "Departments.findByName", query = "SELECT d FROM Departments d WHERE d.name = :name"),
    @NamedQuery(name = "Departments.findByManagerId", query = "SELECT d FROM Departments d WHERE d.managerId = :managerId"),
    @NamedQuery(name = "Departments.findByEmpCount", query = "SELECT d FROM Departments d WHERE d.empCount = :empCount")})
public class Departments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEPARTMENT_ID")
    private Integer departmentId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MANAGER_ID")
    private Integer managerId;
    @Column(name = "EMP_COUNT")
    private Integer empCount;

    public Departments() {
    }

    public Departments(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Departments(Integer departmentId, String name, Integer managerId, Integer empCount) {
        this.departmentId = departmentId;
        this.name = name;
        this.managerId = managerId;
        this.empCount = empCount;
    }
     
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getEmpCount() {
        return empCount;
    }

    public void setEmpCount(Integer empCount) {
        this.empCount = empCount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departmentId != null ? departmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departments)) {
            return false;
        }
        Departments other = (Departments) object;
        if ((this.departmentId == null && other.departmentId != null) || (this.departmentId != null && !this.departmentId.equals(other.departmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Week11Theory.Departments[ departmentId=" + departmentId + " ]";
    }
    
}
