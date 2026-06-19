package com.mycompany.mijpa;

import Persistencia.AlumnoEntidad;
import Persistencia.NaveEntidad;
import Persistencia.VueloEntidad;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author piña Contraseña : itson
 *
 */
public class MiJPA {

    public static class operacionesPrueba {

        public void guardarAlumno(String nombres, String apellidoPaterno, String apellidoMaterno) {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionJPA");
            EntityManager em = emf.createEntityManager();

            AlumnoEntidad alumno = new AlumnoEntidad(nombres, apellidoPaterno, apellidoMaterno);

            try {
                em.getTransaction().begin();

                em.persist(alumno);

                em.getTransaction().commit();

                System.out.println("¡Usuario guardado con éxito! ID generado: " + alumno.getId());

            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }

                e.printStackTrace();
            } finally {
                em.close();
                emf.close();
            }
        }

        public AlumnoEntidad consulatrPorId(int id) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionJPA");
            EntityManager em = emf.createEntityManager();

            AlumnoEntidad alumno = null;

            try {
                alumno = em.find(AlumnoEntidad.class, id);

                if (alumno != null) {
                    System.out.println("¡Alumno encontrado!");
                    System.out.println("Nombres: " + alumno.getNombre());
                    System.out.println("Apellidos: " + alumno.getApellidoPaterno() + " " + alumno.getApellidoMaterno());
                    System.out.println("Activo: " + alumno.isEsActivo());
                    System.out.println("Eliminado: " + alumno.isEsEliminado());

                } else {
                    System.out.println("No se encontro ningun alumno con el id: " + id);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                em.close();
                emf.close();
            }
            return alumno;

        }

        public void editar(int id, String nuevoNomvre) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionJPA");
            EntityManager em = emf.createEntityManager();

            AlumnoEntidad alumno = em.find(AlumnoEntidad.class, id);

            try {
                em.getTransaction().begin();

                if (alumno != null) {
                    alumno.setNombre(nuevoNomvre);

                    em.getTransaction().commit();
                    System.out.println("Alumno editado con exito");
                } else {
                    System.out.println("No se pudo editar al alumno, no se encontro el id");
                    em.getTransaction().rollback();
                }
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                e.printStackTrace();
            } finally {
                em.close();
                emf.close();
            }
        }
    }

    public static void main(String[] args) {
//        
//        operacionesPrueba operaciones = new operacionesPrueba();
//        
//        //guardar
//
//        operaciones.guardarAlumno("Danna Sofia ", "Piña", "Ibarra");
//
//        //consultar
//        operaciones.consulatrPorId(1);
//        
//        //editar
//        operaciones.editar(1, "Danna");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionJPA");
        EntityManager em = emf.createEntityManager();

        NaveEntidad nave1 = new NaveEntidad("navecita");

        List<VueloEntidad> vuelos = new ArrayList<>();

        VueloEntidad vuelo1 = new VueloEntidad(2, nave1);
        VueloEntidad vuelo2 = new VueloEntidad(10, nave1);

        vuelos.add(vuelo1);
        vuelos.add(vuelo2);

        try {
            em.getTransaction().begin();

            em.persist(nave1);

            for (VueloEntidad vuelo : vuelos) {
                em.persist(vuelo); 
            }

            em.getTransaction().commit();

            System.out.println("¡Nave guardado con éxito! ID generado: " + nave1.getId());

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            e.printStackTrace();
        } finally {
            em.close();
            emf.close();

        }
    }
}
