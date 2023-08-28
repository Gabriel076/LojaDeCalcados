package Model;
import java.time.LocalTime;

public class Empreitada {
	private String cpfFunc;
	private LocalTime horaEntrada;
    private LocalTime horaSaida;
    
	public Empreitada(String cpfFunc, LocalTime horaEntrada, LocalTime horaSaida) {
		this.cpfFunc = cpfFunc;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}

	
	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}


	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}


	public LocalTime getHoraSaida() {
		return horaSaida;
	}


	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}


	public String getCpfFunc() {
		return cpfFunc;
	}

	public void setCpfFunc(String cpfFunc) {
		this.cpfFunc = cpfFunc;
	} 
    
}
