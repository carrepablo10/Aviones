
import java.util.ArrayList;

public class Tienda {

    public static ArrayList<Avion> lista;

    public Tienda() {
        if (lista == null) {
            lista = new ArrayList<>();
        }
    } 

    public boolean AgregarAvion(Avion nuevoAvion) {
        if (BuscarAvion(nuevoAvion.getCodigo()) == false) {
            lista.add(nuevoAvion);
            return true;

        } else {
            return false;
        }
    }

    public boolean BuscarAvion(String codigo) {
        for (Avion avion : lista) {

            if (avion.getCodigo() == codigo) {
                return true;
            }

        }
        return false;
    }

    public boolean EliminarAvion(String codigo) {
        for (Avion avion : lista) {
            if (avion.getCodigo() == codigo) {
                lista.remove(avion);
                return true;
            }
        }
        return false;
    }

    public void listarAvion() {
        for (Avion avion : lista) {
            if (avion instanceof Comercial) {
                System.out.println("===============================");
                ((Comercial) avion).mostrarDatosCOMERCIAL();

            }
            if (avion instanceof Carga) {
                System.out.println("===============================");
                ((Carga) avion).mostrarDatosCARGA();
            }
        }
    }

    public static ArrayList<Avion> retornarLista() {
        return lista;
    }

    public void contadorAvionesEstanque() {
        int contador = 0;
        for (Avion avion : Tienda.retornarLista()) {
            if (avion.getEstanque() > 4000) {
                contador += 1;
            }
        }
        System.out.println("cantidad de aviones con estanque superior a 4000 litros :" + contador);
    }

    public int contadorToneladas(Carga carga) {
        int contador = 0;
        for (Avion avion : lista) {
            if (avion instanceof Carga) {
                if (((Carga) avion).getCapacidad() > 2) {
                    contador += 1;
                }

            }
        }
        System.out.println("cantidad de aviones con carga maxima superior a 2 toneladas :" + contador);
        return contador;
    }

}
