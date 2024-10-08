public class Flores {

    //Declaración de atributos
    String especie;
    String color;
    String sexo;
    int edadAnos; //edad_anos
    String paisDeOrigen;
    double altura;

    //Creación de metodo para imprimir.
    public void imprimir() {
        System.out.println("Especie : " +this.especie);
        System.out.println("Color : " +this.color);
        System.out.println("Sexo : " +this. sexo);
        System.out.println("Edad en años : " +this.edadAnos);
        System.out.println("País de origen : " +this.paisDeOrigen);
        System.out.println("Altura : " +this.altura);
    }

    //Creación de metodo para concatenar
    public String concatenar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Especie : " +this.especie + "     ");
        sb.append("Color   :" +this.color + "    ");
        sb.append("Sexo    :" +this.sexo + "     ");
        sb.append("Edad en años :" +this.edadAnos + "    ");
        sb.append("Pais de Origen : " +this.paisDeOrigen + "     ");
        sb.append("Altura :" +this.altura + "cm     ");
        return sb.toString();
    }
    /* Mayuscula: Tipo de dato clase.
       Minúscula: Tipo de dato nativo. */
}
