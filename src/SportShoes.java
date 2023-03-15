public class SportShoes {
    private String name;
    private String mark;
    private String color;
    private int size;
    private int amount;
    private int age;
    private char sex;
    public SportShoes(){

    }
    public SportShoes(String name,String mark, String color, int size,int amount,int age,char sex) {
        this.name = name;
        this.mark = mark;
        this.color = color;
        this.size = size;
        this.amount = amount;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String toString(){
        System.out.println("Hola "+getName()+" estos son tus datos ");
        System.out.println("Cantidad de Zapatos: "+getAmount());
        System.out.println("Marca: "+getMark());
        System.out.println("Tamaño/Talla: "+getSize());
        System.out.println("Color: "+getColor());
        System.out.println("Edad: "+getAge());
        System.out.println("Sexo: "+getSex());
        return "";
    }
}
