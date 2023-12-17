package com.practica.formulari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class FormAPP extends AppCompatActivity {

    private TextInputEditText inputNombre;
    private TextInputEditText inputApellido;
    private TextInputEditText inputDni;
    private TextInputEditText inputTelefono;
    private TextInputEditText inputMail;
    private TextInputEditText inputUsuario;
    private EditText inputPasswd;
    private EditText inputConfirmaPasswd;
    private Button buttonRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulari);
        inputNombre = findViewById(R.id.nombre);
        inputApellido = findViewById(R.id.apellido);
        inputDni = findViewById(R.id.dni);
        inputTelefono = findViewById(R.id.telefono);
        inputMail = findViewById(R.id.email);
        inputUsuario = findViewById(R.id.usuario);
        inputPasswd = findViewById(R.id.contraseña);
        inputConfirmaPasswd = findViewById(R.id.confirmaPasswd);
        buttonRegistrar = findViewById(R.id.buttonRegistrar);
    }
    // Valida telefono (numeros y longitud de 7)

    public void onClickRegistrar(View v){
        // Inputs de campos del Formulario
        String nombre = String.valueOf(inputNombre.getText()).trim();
        String apellido = String.valueOf(inputApellido.getText()).trim();
        String dni = String.valueOf(inputDni.getText()).trim();
        String telefono = String.valueOf(inputTelefono.getText()).trim();
        String email = String.valueOf(inputMail.getText()).trim();
        String usuario = String.valueOf(inputUsuario.getText()).trim();
        String passwd = String.valueOf(inputPasswd.getText());
        String confirmaPasswd = String.valueOf(inputConfirmaPasswd.getText());

        // Metodos de Validación
        String nombreError = ValidateFormulario.validateNombre(nombre);
        String apellidoError = ValidateFormulario.validateApellido(apellido);
        String dniError = ValidateFormulario.validateDNI(dni);
        String telefonoError = ValidateFormulario.validateTelefono(telefono);
        String emailError = ValidateFormulario.validateEmail(email);
        String usuarioError = ValidateFormulario.validateUsuario(usuario);
        String passwdError = ValidateFormulario.validatePasswd(passwd);
        String confirmaPasswdError = ValidateFormulario.validateConfirmPasswd(passwd, confirmaPasswd);

        if (nombreError != null) {
            Toast.makeText(this, nombreError, Toast.LENGTH_SHORT).show();
        } else if (apellidoError != null) {
            Toast.makeText(this, apellidoError, Toast.LENGTH_SHORT).show();
        } else if (dniError != null) {
            Toast.makeText(this, dniError, Toast.LENGTH_SHORT).show();
        } else if (telefonoError != null) {
            Toast.makeText(this, telefonoError, Toast.LENGTH_SHORT).show();
        } else if (emailError != null) {
            Toast.makeText(this, emailError, Toast.LENGTH_SHORT).show();
        } else if (usuarioError != null) {
            Toast.makeText(this, usuarioError, Toast.LENGTH_SHORT).show();
        } else if (passwdError != null) {
            Toast.makeText(this, passwdError, Toast.LENGTH_SHORT).show();
        } else if (confirmaPasswdError != null) {
            Toast.makeText(this, confirmaPasswdError, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Se ha registrado correctamente!", Toast.LENGTH_SHORT).show();
            buttonRegistrar.setEnabled(false);
            buttonRegistrar.setBackgroundColor(3231);
        }
    }
}