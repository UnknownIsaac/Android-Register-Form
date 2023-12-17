package com.practica.formulari;

import android.util.Patterns;

public class ValidateFormulario {

    public static String validateNombre(String nombre){
        if (nombre.isEmpty()){
            return "'Nombre' no puede estar vacio";
        } else if (!nombre.matches("[a-zA-Z]+")) {
            return "'Nombre' solo puede contener letras";
        }
        return null;
    }
    public static String validateApellido(String apellido) {
        if (apellido.isEmpty()){
            return "'Apellido' no puede estar vacio";
        } else if (!apellido.matches("[a-zA-Z]+")) {
            return "'Apellido' solo puede contener letras";
        }
        return null;
    }
    public static String validateDNI(String dni){
        if (dni.isEmpty()) {
            return "'DNI' no puede estar vacio";
        }
        else if (dni.length() != 9){
            return "'DNI' requiere una longitud de 9 caracteres";
        }
        return null;
    }

    // Telefono no es obligatorio, puede estar vacio
    public static String validateTelefono(String telefono){
        if (!Patterns.PHONE.matcher(telefono).matches()) {
            return "'Número de teléfono' no válido";
        }
        return null;
    }
    public static String validateEmail(String email){
        if (email.isEmpty()) {
            return "'Email' no puede estar vacio";
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return "Formato de 'email' inválido";
        }
        return null;
    }
    public static String validateUsuario(String usuario){
        if (usuario.isEmpty()) {
            return "El 'Nombre de usuario' no puede estar vacío";
        } else if (usuario.length() < 5 || usuario.length() > 20) {
            return "El 'Nombre de usuario' debe tener entre 5 y 20 caracteres";
        }
        return null;
    }
    public static String validatePasswd(String passwd){
        if (passwd.isEmpty()) {
            return "La 'Constraseña' no puede estar vacia";
        }
        else if (passwd.length() < 4){
            return "La 'Contraseña' debe tener 4 carácteres o más";
        }
        // recogido regex de https://stackoverflow.com/questions/7684815/regex-pattern-to-match-at-least-1-number-and-1-character-in-a-string
        else if (!passwd.matches("^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$")){
            return "La 'Contraseña' debe contener números y letras (sin carácteres especiales)";
        }
        return null;
    }
    public static String validateConfirmPasswd(String passwd, String confirmPasswd){
        if (confirmPasswd.isEmpty()) {
            return "La 'Constraseña de Confirmación' no puede estar vacia";
        }
        if (!passwd.equals(confirmPasswd)) {
            return "Las 'Contraseñas' no són iguales";
        }
        return null;
    }
}
