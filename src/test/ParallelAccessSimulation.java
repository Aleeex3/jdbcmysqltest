/**
 *
 */
package test;

import java.util.ArrayList;

import user.UserDao;

/**
 * @author hugog10 oct 2025
 */
public class ParallelAccessSimulation {

    public static void main(String[] args) {

        // creamos un objeto que se pueda conectar a la clase UserDao
        UserDao userDao = new UserDao();
        int fromUserId = 4;
        int toUserId = 5;
// creamos una lista con 100 espacios de capacidad
        ArrayList<Thread> threads;
        threads = new ArrayList<Thread>(100);
// bucle que sirve para añadir 100 hilos en la capacidad de la lista a este threads.add(thread);
        // porque el otro solo recorre las 100 posiciones
        for (int i = 0; i < 100; i++) {
            // creacion de hilo
            // () -> {} = hace que el codigo sea mas flexible
            Thread thread = new Thread(() -> {
                userDao.transferWithTransaction(fromUserId, toUserId, 1);
            });
            threads.add(thread);

        }
        for (Thread thread : threads) {
            thread.start();
        }
    }
}