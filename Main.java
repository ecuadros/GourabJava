// Este es tu archivo principal, el punto de entrada de tu programa.
// Desde aquí, vamos a usar la clase Student.

public class Main {
    public static void main(String[] args) {
        // Creamos una "instancia" u "objeto" de la clase Student.
        // Le pasamos los datos al constructor que definimos en Student.java
        Student student1 = new Student("2025", "Gourab", 30);
        student1.setAge(34);
        
        // Creamos otro estudiante
        Student student2 = new Student("Ernesto");
        student2.setAge(51);
        student2.setCode("2014");
        String name = student2.getName();

        // Imprimimos la información de los estudiantes.
        // Gracias al método toString() en la clase Student, la información se mostrará de forma ordenada.
        System.out.println(student1);
        System.out.println("--------------------");
        System.out.println(student2);
        System.out.println("El nombre del segundo estudiante es: " + name);
    }
}