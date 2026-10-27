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

    public void bubbleSort(Estudiante[] estudiantes) {
        int n = estudiantes.length;
        for (int i = 0; i < n - 1; i++) {
            boolean cambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (estudiantes[j].getNota() > estudiantes[j + 1].getNota()) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                    cambio = true;
                }
            }
            if (!cambio) {
                break;
                }
        }
    }
}
