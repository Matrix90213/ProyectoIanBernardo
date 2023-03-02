public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Probando clase Student");

        Student ianBernardo=new Student(); //EL O LOS METODOS QUE ME PERMITEN CONSTRUIR METODOS SE LLAMA CONSTRUCTOR
        System.out.println("ianBernardo = " + ianBernardo.toString());

        ianBernardo.setName("Ian"); //set para darle un valor a un atributo
        System.out.println("El nombre es: "+ianBernardo.getName()); //get

        ianBernardo.setLastName("Pillado");
        System.out.println("El primer apellido es: "+ianBernardo.getLastName());

        ianBernardo.setControlNumber(22670007);
        System.out.println("El no. de control es: "+ianBernardo.getControlNumber());

        ianBernardo.setCareer("Informatica");
        System.out.println("La carrera es: "+ianBernardo.getCareer());

        ianBernardo.setSemester(2);
        System.out.println("El semestres es: "+ianBernardo.getSemester());

        ianBernardo.setAverage(9.8);
        System.out.println("El promedio es "+ianBernardo.getAverage());
    }
}
