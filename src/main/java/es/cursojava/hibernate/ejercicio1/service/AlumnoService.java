package es.cursojava.hibernate.ejercicio1.service;

import java.util.HashMap;
import java.util.Map;

import es.cursojava.hibernate.ejercicio1.dto.AlumnoDTO;

public class AlumnoService {

    public Map<String, String> validar(AlumnoDTO dto) {

        Map<String, String> errores = new HashMap<>();

        if (dto.getNombre() == null || dto.getNombre().isBlank()) {
            errores.put("nombre", "El nombre es obligatorio");
        }

        if (dto.getEmail() == null || dto.getEmail().isBlank()) {
            errores.put("email", "El email es obligatorio");
        }

        if (dto.getEdad() <= 0) {
            errores.put("edad", "La edad debe ser mayor que 0");
        }

        if (dto.getCodigo_curso() <= 0) {
            errores.put("curso", "Debe seleccionar un curso válido");
        }

        return errores;
    }
}