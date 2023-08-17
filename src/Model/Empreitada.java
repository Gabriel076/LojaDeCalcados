package Model;
import java.time.LocalTime;

public class Empreitada {
	private String cpfFunc;
	private LocalTime horario1;
    private LocalTime horario2;
    
	public Empreitada(String cpfFunc, LocalTime horario1, LocalTime horario2) {
		this.cpfFunc = cpfFunc;
		this.horario1 = horario1;
		this.horario2 = horario2;
	}

	public String getCpfFunc() {
		return cpfFunc;
	}

	public void setCpfFunc(String cpfFunc) {
		this.cpfFunc = cpfFunc;
	}

	public LocalTime getHorario1() {
		return horario1;
	}

	public void setHorario1(LocalTime horario1) {
		this.horario1 = horario1;
	}

	public LocalTime getHorario2() {
		return horario2;
	}

	public void setHorario2(LocalTime horario2) {
		this.horario2 = horario2;
	} 
    
    
}




//Como implementar:
//LocalTime horario2 = LocalTime.of(14, 45); 