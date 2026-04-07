public class trabalhoModelo {


    private int id_empregado;
private String nome_empregado;
private double cargaHoraria_empregado;
private double salario_empregado;
private int horasMes_empregado;
public int getId_empregado() {
    return id_empregado;
}
public void setId_empregado(int id_empregado) {
    this.id_empregado = id_empregado;
}
public String getNome_empregado() {
    return nome_empregado;
}
public void setNome_empregado(String nome_empregado) {
    this.nome_empregado = nome_empregado;
}
public double getCargaHoraria_empregado() {
    return cargaHoraria_empregado;
}
public void setCargaHoraria_empregado(double cargaHoraria_empregado) {
    this.cargaHoraria_empregado = cargaHoraria_empregado;
}
public double getSalario_empregado() {
    return salario_empregado;
}
public void setSalario_empregado(double salario_empregado) {
    this.salario_empregado = salario_empregado;
}
public int getHorasMes_empregado() {
    return horasMes_empregado;
}
public void setHorasMes_empregado(int horasMes_empregado) {
    this.horasMes_empregado = horasMes_empregado;
}

public double calcularsalario(){
double salario_empregado = (horasMes_empregado*cargaHoraria_empregado);
System.out.println(salario_empregado);
return calcularsalario();


}

}
