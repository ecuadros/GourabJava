public class Course {
    String code;
    String name;
    int credits;

    public Course(String _code, String _name, int _credits) {
        code = _code;
        name = _name;
        credits = _credits;
    }

    @Override
    public String toString() {
        return "Course Info: \n" +
               "  Code: " + code + "\n" +
               "  Name: " + name + "\n" +
               "  Credits: "  + credits;
    }

    public String getName()             { return name;   }
    public void   setName(String _name) { name = _name;  }

    public String getCode()             { return code;   }
    public void   setCode(String _code) { code = _code;  }

    public int    getCredits()          { return credits;}
    public void   setCredits(int _credits) { credits = _credits; }
}