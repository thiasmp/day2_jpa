/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thias
 */
@Entity
@Table(name = "Datasheet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datasheet.findAll", query = "SELECT d FROM Datasheet d"),
    @NamedQuery(name = "Datasheet.findById", query = "SELECT d FROM Datasheet d WHERE d.id = :id"),
    @NamedQuery(name = "Datasheet.findBySemester", query = "SELECT d FROM Datasheet d WHERE d.semester = :semester")})
public class Datasheet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "semester")
    private String semester;
    @JoinColumn(name = "Student_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Student student;

    public Datasheet() {
    }

    public Datasheet(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

  
    
}
