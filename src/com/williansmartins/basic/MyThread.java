package com.williansmartins.basic;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Run begin");
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa " + i + " está executando");
            try {
                Thread.sleep(1000); // pausa por 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
		System.out.println("Run end");
	}

}
