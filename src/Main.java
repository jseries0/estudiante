
public class Main {
    public static void main(String[] args) {
        estudiante e1 = new estudiante("Juan", 2.0, 4.1, 3.9);
        e1.mostrarinformacion();
        System.out.println(e1.calcularpromedio());

        class estudiante {

            private String nombre;
            private double nota1;
            private double nota2;
            private double nota3;

            public estudiante() {
            }

            public estudiante(String nombre, double nota1, double nota2, double nota3) {
                this.nombre = nombre;
                this.nota1 = nota1;
                this.nota2 = nota2;
                this.nota3 = nota3;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public double getNota1() {
                return nota1;
            }

            public void setNota1(double nota1) {
                this.nota1 = nota1;
            }

            public double getNota2() {
                return nota2;
            }

            public void setNota2(double nota2) {
                this.nota2 = nota2;
            }

            public double getNota3() {
                return nota3;
            }

            public void setNota3(double nota3) {
                this.nota3 = nota3;
            }

            @Override
            public String toString() {
                return "Estudiante{" +
                        "nombre='" + nombre + '\'' +
                        ", nota1=" + nota1 +
                        ", nota2=" + nota2 +
                        ", nota3=" + nota3 +
                        '}';
            }
            //METODOS PROPIOS
            //sin parametros sin sin retorno
            public void mostrarinformacion(){
                System.out.println("NOMBRE: " + this.getNombre());
                System.out.println("nota1: " + this.getNota1());
                System.out.println("nota2: " + this.getNota2());
                System.out.println("nota3: " + this.getNota3());
            }
            //con parametros sin retorno
            public void asignarnotas(double n1, double n2, double n3){
                this.nota1 = n1;
                this.nota2 = n2;
                this.nota3 = n3;
            }
            public double calcularpromedio(){
                return (this.nota1 + this.nota2 + this.nota3)/3;
            }
            public boolean estaaprobado(double notaMinima){
                double promedio = calcularpromedio();
                return promedio>=notaMinima;

            }


        }}
}