// Este archivo define la clase Student.
// Representa la estructura de datos para un estudiante.

public class Student {
    // Atributos o propiedades de la clase
    String code;
    String name;
    int    age;

    Course[] courses; // Array de objetos de la clase Course
    int      courseCount; // Número de cursos inscritos

    // Este es el "constructor" de la clase.
    // Se llama cuando creas una nueva instancia (un nuevo objeto) de Student.
    // Nos permite inicializar los atributos con valores específicos.

    // Los Constructores tienen las siquientes caracteristicas:
    // 1. Tienen el mismo nombre que la clase.
    // 2. No tienen un tipo de retorno (ni siquiera void).
    // 3. Pueden tener parámetros (o no).
    // 4. Pueden haver varios constructores con diferentes parámetros.
    // 5. Si no defines un constructor, Java crea uno por defecto (sin parámetros).
    // 6. Si defines un constructor con parámetros, el constructor por defecto ya no estará disponible.
    public Student(String _code, String _name, int _age) {
        // 'this' se usa para diferenciar el atributo de la clase del parámetro del constructor.
        this.code = _code;
        code = _code; // Es lo mismo que la línea anterior.
        name = _name;
        age  = _age;

        courses = new Course[10]; // Inicializamos el array con capacidad para 10 cursos
        courseCount = 0;       // Inicializamos el contador de cursos
    }
    public Student(String _name) {
        name = _name;
        code = "N/A"; // Valor por defecto
        age  = 0;      // Valor por defecto

        courses = new Course[10]; // Inicializamos el array con capacidad para 10 cursos
        courseCount = 0;       // Inicializamos el contador de cursos
    }

    // Un método para mostrar los datos del estudiante de forma amigable.
    // Al imprimir el objeto, Java llamará automáticamente a este método.
    @Override
    public String toString() {
        String courses = "";
        for (int i = 0; i < courseCount; i++) {
            courses += "    " + this.courses[i].getCode() + "\n";
            courses += "    " + this.courses[i].getName() + "\n";
            courses += "    " + this.courses[i].getCredits() + "\n";
        }
        
        return "Student Info: \n" +
               "  Code: " + code + "\n" +
               "  Name: " + name + "\n" +
               "  Age: "  + age + "\n" +
               "  Enrolled Courses: \n" + courses;
    }

    public String getName()             { return name;   }
    public void   setName(String _name) { name = _name;  }

    public String getCode()             { return code;   }
    public void   setCode(String _code) { code = _code;  }

    public int    getAge()              { return age;    }
    public void   setAge(int _age)      { age = _age;    }

    // Métodos para manejar los cursos
    public void enrollInCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            courseCount++;
        } else {
            System.out.println("No se pueden inscribir más cursos.");
        }
    }
}