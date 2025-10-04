// Este archivo define la clase Student.
// Representa la estructura de datos para un estudiante.

public class Student {
    // Atributos o propiedades de la clase
    public String code;
    public String name;
    public int    age;

    // Un método para mostrar los datos del estudiante de forma amigable.
    // Al imprimir el objeto, Java llamará automáticamente a este método.
    @Override
    public String toString() {
        return "Student Info: \n" +
               "  Code: " + code + "\n" +
               "  Name: " + name + "\n" +
               "  Age: " + age;
    }
}