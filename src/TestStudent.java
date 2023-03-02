public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Probando clase Student");

        Student ianBernardo=new Student(); //EL O LOS METODOS QUE ME PERMITEN CONSTRUIR METODOS SE LLAMA CONSTRUCTOR
        System.out.println("ianBernardo = " + ianBernardo.toString());

        ianBernardo.setName("Ian"); //set para darle un valor a un atributo
        System.out.println("El nombre del alumno es: "+ianBernardo.getName()); //get

        ianBernardo.setLastName("Pillado");
        System.out.println("El primer apellido del alumno es: "+ianBernardo.getLastName());

        ianBernardo.setControlNumber(22670007);
        System.out.println("El número de control del alumno es: "+ianBernardo.getControlNumber());

        ianBernardo.setCareer("Informatica");
        System.out.println("La carrera del alumno es: "+ianBernardo.getCareer());

        ianBernardo.setSemester(2);
        System.out.println("El semestres del alumno es: "+ianBernardo.getSemester());

        ianBernardo.setAverage(9.8);
        System.out.println("El promedio del alumno es "+ianBernardo.getAverage());
    }
}
