package Controller;

import java.util.concurrent.Semaphore;

	public class Multi extends Thread {
		Semaphore  s1;
		
		double seg;
		int p;
		double seg1;

	public Multi(Semaphore s1, int p, double seg, double seg1) {
		this.s1=s1;
		this.seg= seg;
		this.p=p;
		this.seg1=seg1;
	}
	public void run(){
		try {
			double ss= seg1/10000;
			sleep ((long) ss);
			Calculos();
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		
		try {
			double s=seg/10000;
			sleep((long) s);
			s1.acquire();
			transação();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		
		} finally {
			s1.release();
			
		}
		
		
	}
	
		
	
	private void transação() {
		double s =  seg/10;
		System.out.println("Trasação de BD por " + s + " Segundos -> Threads" + p);
		
	}
	private void Calculos() {
		
		System.err.println("Cálculos de "+ seg1 + " segundos -> threads " + p);
		
		
	}
}
