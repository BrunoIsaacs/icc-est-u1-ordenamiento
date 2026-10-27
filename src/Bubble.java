import models.Estudiante;

public class Bubble {
    public void sort(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            boolean cambio = false;
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    cambio = true;
                }
            }
            if (!cambio) {
                break;
            }
        }
    }

    public void sortEstudiantesN(Estudiante[] estudiantes) {
        sortEstudiantes(estudiantes, (primero, segundo) ->
                Double.compare(primero.getNota(), segundo.getNota()));
    }

    public void sortEstudiantesName(Estudiante[] estudiantes) {
        sortEstudiantes(estudiantes, (primero, segundo) ->
                primero.getName().compareToIgnoreCase(segundo.getName()));
    }

    private void sortEstudiantes(Estudiante[] estudiantes,
            java.util.Comparator<Estudiante> comparador) {
        for (int i = 0; i < estudiantes.length - 1; i++) {
            boolean cambio = false;
            for (int j = 0; j < estudiantes.length - i - 1; j++) {
                if (comparador.compare(estudiantes[j], estudiantes[j + 1]) > 0) {
                    Estudiante temporal = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temporal;
                    cambio = true;
                }
            }
            if (!cambio) {
                break;
            }
        }
    }
}
