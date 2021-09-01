package Entity;

import Entity.Datasheet;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-09-01T14:53:15", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile ListAttribute<Student, Datasheet> datasheetList;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Integer> id;

}