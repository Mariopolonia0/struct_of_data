package EjercicioKotlin.capitulo9.agenda

import java.io.Serializable


class Contacto(
    var nombre: String = "",
    var direccion: String = "",
    var ciudad: String = "",
    var codigoPostal: String = "",
    var telefono: String = "",
    var fechaNacimiento: String = ""
) : Serializable
