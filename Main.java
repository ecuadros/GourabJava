// Este es tu archivo principal, el punto de entrada de tu programa.
// Desde aquí, vamos a usar la clase Student.

public class Main {
    public static void main(String[] args) {
        // Creamos una "instancia" u "objeto" de la clase Student.
        // Le pasamos los datos al constructor que definimos en Student.java
        Student student1 = new Student("2025", "Gourab", 30);
        student1.setAge(34);
        student1.enrollInCourse(new Course("CS101", "Intro to Computer Science", 4));
        student1.enrollInCourse(new Course("MATH201", "Calculus II", 3));
        student1.enrollInCourse(new Course("PHY101", "Physics I", 4));
        student1.enrollInCourse(new Course("ENG101", "English Literature", 2));
        student1.enrollInCourse(new Course("HIST101", "World History", 3));
        
        // Creamos otro estudiante
        Student student2 = new Student("Ernesto");
        student2.setAge(51);
        student2.setCode("2014");
        student2.enrollInCourse(new Course("CS101", "Intro to Computer Science", 4));
        student2.enrollInCourse(new Course("MATH201", "Calculus II", 3));
        student2.enrollInCourse(new Course("PHY101", "Physics I", 4));
        student2.enrollInCourse(new Course("ENG101", "English Literature", 2));
        student2.enrollInCourse(new Course("HIST101", "World History", 3));
        student2.enrollInCourse(new Course("CHEM101", "Chemistry I", 4));
        student2.enrollInCourse(new Course("BIO101", "Biology I", 4)); 
        student2.enrollInCourse(new Course("ART101", "Art History", 2));
        student2.enrollInCourse(new Course("MUS101", "Music Theory", 2));
        student2.enrollInCourse(new Course("PHIL101", "Philosophy I", 3));
        student2.enrollInCourse(new Course("ECON101", "Economics I", 3));  
        String name = student2.getName();

        // Imprimimos la información de los estudiantes.
        // Gracias al método toString() en la clase Student, la información se mostrará de forma ordenada.
        System.out.println(student1);
        System.out.println("--------------------");
        System.out.println(student2);
        System.out.println("El nombre del segundo estudiante es: " + name);
    }
}