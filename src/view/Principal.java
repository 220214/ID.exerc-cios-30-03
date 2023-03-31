package view;

import java.util.concurrent.Semaphore;

import Controller.Multi;

public class Principal {

		public static void main(String[] args) {
		Semaphore s1 = new Semaphore(1);
		
		for (int c = 1; c < 22 ; c ++) {
				int d = c%3;
				if(d==1) {
				for (int a = 1 ; a <=2; a++) {	
					int seg = (int)((Math.random()*8)+ 2);
					int seg1 = 1;
					Thread c2 = new Multi(s1, c,seg, seg1);
					c2.start();
				}
			}else if (d==2) {
				for(int a =1 ; a<=3; a++) {	
					int seg = (int)((Math.random()*10)+ 5);
					double seg1 = 1.5;
					Thread c2 = new Multi(s1, c, seg,seg1);
					c2.start();
					}
			}else if (d==0) {
					for(int a =1 ; a<=2; a++) {	
						int seg = (int)((Math.random()*10)+ 10);
						double seg1 = 1.5;
						Thread c2 = new Multi(s1, c, seg,seg1);
						c2.start();
						}
				}
			}
		}
		}
