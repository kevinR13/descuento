package ejerCLASE;

public class descuento {

	private double descuento;
	private double totalCompra;
	
	public descuento(double descuentoParam, double totalCompraParam){
		this.descuento=descuentoParam;
		this.totalCompra=totalCompraParam;
	}
	
	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}

	public double getTotal(){
		double total=totalCompra-totalCompra*descuento;
		return total;
	}
	
	
}