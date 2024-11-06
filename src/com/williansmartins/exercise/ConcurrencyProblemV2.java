package com.williansmartins.exercise;



public class ConcurrencyProblemV2 {
	
	
    public static void main(String[] args) throws InterruptedException {
        Person person = new Person("John", 25);

        // Criando duas threads que alteram o mesmo objeto simultaneamente
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
//                person.setAge(person.getAge() + 1);
                person.withAge(i);
            }
            System.out.println("Thread 1: " + person.getAge());
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
//                person.setAge(person.getAge() - 1);
                person.withAge(i);
            }
            System.out.println("Thread 2: " + person.getAge());
        });

        // Iniciando as threads
        thread1.start();
        thread2.start();

        // Aguardando as threads terminarem
        thread1.join();
        thread2.join();

        // Imprimindo o valor final da idade
        System.out.println("Final Age: " + person.getAge());
    }
    
    static class Person {
	    private final String name;
	    private final int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }


	    public int getAge() {
	        return age;
	    }
//	    public void setName(String name) {
//	    	this.name = name;
//	    }
	//
//	    public void setAge(int age) {
//	        this.age = age;
//	    }
	    
	    public Person withName(String newName) {
	        return new Person(newName, this.age);
	    }

	    public Person withAge(int newAge) {
	        return new Person(this.name, newAge);
	    }
	}
}
