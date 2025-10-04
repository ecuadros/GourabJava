// Este es tu archivo principal, el punto de entrada de tu programa.
// Desde aquí, vamos a usar la clase Student.

public class Main {
    public static void main(String[] args) {
        // Creamos una "instancia" u "objeto" de la clase Student.
        // Le pasamos los datos al constructor que definimos en Student.java
        Student student1 = new Student();
        student1.code = "S001";
        student1.name = "Alice";
        student1.age  = 20;

        // Creamos otro estudiante
        Student student2 = new Student();
        student2.code = "S002";
        student2.name = "Bob";
        student2.age  = 22;

        // Imprimimos la información de los estudiantes.
        // Gracias al método toString() en la clase Student, la información se mostrará de forma ordenada.
        System.out.println(student1);
        System.out.println("--------------------");
        System.out.println(student2);
    }
}