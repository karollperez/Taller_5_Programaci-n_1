package co.edu.uptc.sala.modelo;

public class EstadoInvalidoException extends Exception {

    public EstadoInvalidoException(String codigo, EstadoPortatil estado, String accion) {
        super(crearMensaje(codigo, estado, accion));
    }

    private static String crearMensaje(String codigo, EstadoPortatil estado, String accion) {
        if (accion.equalsIgnoreCase("prestar")) {
            return "No se puede prestar el portatil " + codigo + ": esta "
                    + estado.getTexto().toLowerCase() + ".";
        }
        return "No se puede devolver el portatil " + codigo + ": no esta prestado.";
    }
}
