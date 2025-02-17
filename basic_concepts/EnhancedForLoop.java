class Docente {

    long matricula;
    String nome;
}

public class EnhancedForLoop {
    
    public static void main(String[] args) {

        Docente p1 = new Docente();
        Docente p2 = new Docente();
        Docente p3 = new Docente();

        p1.matricula = 20183101881L;
        p1.nome = "Wladia";

        p2.matricula = 20183101882L;
        p2.nome = "Ricardo";

        p3.matricula = 20183101883L;
        p2.nome = "Ivo";

        Docente semestre[] = {p1, p2, p3};

        //---------- ENHANCED FOR LOOP ----------//

        for(Docente professor : semestre) {
            System.out.println(professor.matricula + ": " + professor.nome );
        }

    }
}
