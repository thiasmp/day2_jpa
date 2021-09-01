package Entity;

import Entity.Student;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-09-01T14:53:15", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Datasheet.class)
public class Datasheet_ { 

    public static volatile SingularAttribute<Datasheet, Student> student;
    public static volatile SingularAttribute<Datasheet, String> semester;
    public static volatile SingularAttribute<Datasheet, Integer> id;

}