package facade;

import Entity.Student;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thias
 */
public class StudentFacade {
    private static EntityManagerFactory emf;
    private static StudentFacade sf;
    
    
    public StudentFacade() {
    }
    
    
    public static StudentFacade getFacade(EntityManagerFactory _emf) {
        
        if (sf == null){
            sf = new StudentFacade();
            emf = _emf;
        }
        return sf;
        
    }
    
    
    public Student getStudent(int id)   {
        EntityManager em = emf.createEntityManager();
        Student student = em.find(Student.class, id);
        return student;
    }
    
    public static void main(String[] args) {
        StudentFacade sf = getFacade(Persistence.createEntityManagerFactory("pu"));
        Student s = sf.getStudent(1);
        System.out.println(s);
    }
}
