package EjercicioKotlin.capitulo9.agenda


import java.awt.Color
import java.awt.Font
import java.awt.Image
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import javax.swing.*

class ViewAgenda : JFrame() {

    var listaAgenda: MutableList<Contacto> = mutableListOf()
    var model: DefaultListModel<String> = DefaultListModel()
    var rutaArchivo = "EjercicioKotlin/capitulo9/agenda/data.dat"

    lateinit var list :JList<String>
    lateinit var textFieldNombre: JTextField
    lateinit var textFieldDireccion: JTextField
    lateinit var textFieldCiudad: JTextField
    lateinit var textFieldCodigoPostal: JTextField
    lateinit var textFieldTelefono: JTextField
    lateinit var textFieldFechaNacimiento: JTextField
    lateinit var buttonGuardar: JButton
    lateinit var buttonElinimar: JButton
    lateinit var buttonNuevo: JButton

    init {
        ventanaPrincipal()
        cargarListaDesdeElArchivo()
        actualizarLista()
    }

    fun cargarListaDesdeElArchivo() {
        ObjectInputStream(FileInputStream(rutaArchivo)).use {
            listaAgenda = (it.readObject() as MutableList<Contacto>)
        }
    }

    private fun ventanaPrincipal() {
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "Lista Agenda"
        setSize(550, 560)
        setLocation(500, 200)
        setLocationRelativeTo(null)
        add(panel())
        isVisible = true
    }

    private fun panel(): JPanel {
        val jPanel = JPanel()
        jPanel.add(label("Lista de contactos", 10, 5, 20))
        jPanel.add(label("Regristro",230 , 5, 20))
        jPanel.isVisible = true
        jPanel.layout = null
        //agregar componentes
        jPanel.add(agregarLista())
        jPanel.add(jpanelRegistro())

        return jPanel
    }

    private fun agregarLista(): JList<String> {

        list = JList(model)

        val evento = object : MouseAdapter() {
            override fun mouseClicked(e: MouseEvent) {
                cargarContacto(list.selectedIndex)
            }
        }

        list.addMouseListener(evento)
        list.setBounds(10, 40, 200, 470)
        list.background = Color.lightGray

        return list
    }

    private fun cargarContacto(index: Int) {
        textFieldNombre.text = listaAgenda[index].nombre
        textFieldDireccion.text = listaAgenda[index].direccion
        textFieldCiudad.text = listaAgenda[index].ciudad
        textFieldCodigoPostal.text = listaAgenda[index].codigoPostal
        textFieldTelefono.text = listaAgenda[index].telefono
        textFieldFechaNacimiento.text = listaAgenda[index].fechaNacimiento
    }

    private fun jpanelRegistro(): JPanel {
        val jPanel = JPanel()
        jPanel.setBounds(220, 40, 280, 470)
        jPanel.isVisible = true
        jPanel.layout = null
        jPanel.background = Color.lightGray

        //agregar textFiel
        jPanel.add(label("Nombre", 10, 10, 16))
        textFieldNombre = textField( 40)
        jPanel.add(textFieldNombre)

        jPanel.add(label("Direccion", 10, 70, 16))
        textFieldDireccion = textField(100)
        jPanel.add(textFieldDireccion)

        jPanel.add(label("Ciudad", 10, 130, 16))
        textFieldCiudad = textField( 160)
        jPanel.add(textFieldCiudad)

        jPanel.add(label("Codigo Postal", 10, 190, 16))
        textFieldCodigoPostal = textField( 220)
        jPanel.add(textFieldCodigoPostal)

        jPanel.add(label("Telefono", 10, 250, 16))
        textFieldTelefono = textField( 280)
        jPanel.add(textFieldTelefono)

        jPanel.add(label("Fecha Nacimiento", 10, 310, 16))
        textFieldFechaNacimiento = textField( 340)
        jPanel.add(textFieldFechaNacimiento)

        configurarButton()

        jPanel.add(buttonGuardar)
        jPanel.add(buttonNuevo)
        jPanel.add(buttonElinimar)

        return jPanel
    }

    private fun configurarButton() {
        //Configuracion button Nuevo
        buttonNuevo = JButton("")
        val iconoNuevo = ImageIcon("Resources/NuevoIcono.png")
        buttonNuevo.icon = ImageIcon(iconoNuevo.image.getScaledInstance(50, 50, Image.SCALE_SMOOTH))
        buttonNuevo.setBounds(10, 390, 60, 60)

        val eventoNuevo = object : MouseAdapter() {
            override fun mouseClicked(e: MouseEvent) {

            }
        }

        buttonNuevo.addMouseListener(eventoNuevo)
        buttonNuevo.isVisible = true

        //Configuracion button Guardar
        buttonGuardar = JButton("")
        val iconoGuardar = ImageIcon("Resources/GuardarIcon.png")
        buttonGuardar.icon = ImageIcon(iconoGuardar.image.getScaledInstance(50, 50, Image.SCALE_SMOOTH))
        buttonGuardar.setBounds(85, 390, 60, 60)

        val eventoGuardar = object : MouseAdapter() {
            override fun mouseClicked(e: MouseEvent) {
                guardarContacto()
            }
        }

        buttonGuardar.addMouseListener(eventoGuardar)
        buttonGuardar.isVisible = true

        //Configuracion button Eliminar
        buttonElinimar = JButton("")
        val iconoEliminar = ImageIcon("Resources/EliminarIcon.png")
        buttonElinimar.icon = ImageIcon(iconoEliminar.image.getScaledInstance(50, 50, Image.SCALE_SMOOTH))
        buttonElinimar.setBounds(165, 390, 60, 60)

        val eventoEliminar = object : MouseAdapter() {
            override fun mouseClicked(e: MouseEvent) {

            }
        }

        buttonElinimar.addMouseListener(eventoEliminar)
        buttonElinimar.isVisible = true


    }

    private fun guardarContacto() {
        val conctato = Contacto(
            nombre = textFieldNombre.text,
            direccion = textFieldDireccion.text,
            ciudad = textFieldCiudad.text,
            codigoPostal = textFieldCodigoPostal.text,
            telefono = textFieldTelefono.text,
            fechaNacimiento = textFieldFechaNacimiento.text
        )

        if (validar()) {
            if (list.selectedIndex != -1) {
                listaAgenda[list.selectedIndex] = conctato
            } else {
                listaAgenda.add(
                    conctato
                )
            }

            actualizarLista()
            limpiarRegistro()
            guardarListaEnArchivo()
        }
    }

    private fun guardarListaEnArchivo() {
        crearArchivo()
        ObjectOutputStream(FileOutputStream(rutaArchivo)).use {
            it.writeObject(listaAgenda)
        }
    }

    private fun crearArchivo() {
        val file = File(rutaArchivo)

        if (!file.exists())
            FileOutputStream(rutaArchivo)
    }

    private fun validar(): Boolean {
        var isValido = true

        if (textFieldNombre.text.isEmpty())
            isValido = false

        if (textFieldDireccion.text.isEmpty())
            isValido = false

        if (textFieldCiudad.text.isEmpty())
            isValido = false

        if (textFieldCodigoPostal.text.isEmpty())
            isValido = false

        if (textFieldTelefono.text.isEmpty())
            isValido = false

        if (textFieldFechaNacimiento.text.isEmpty())
            isValido = false

        return isValido
    }

    private fun actualizarLista() {
        model.clear()
        for (item in listaAgenda)
            model.addElement("${item.nombre} ${item.telefono}")
    }

    private fun limpiarRegistro() {
        textFieldNombre.text = ""
        textFieldDireccion.text = ""
        textFieldCiudad.text = ""
        textFieldCodigoPostal.text = ""
        textFieldTelefono.text = ""
        textFieldFechaNacimiento.text = ""
    }

    private fun textField( y: Int): JTextField {
        val textField = JTextField()
        textField.setBounds(10, y, 220, 25)
        textField.font = Font("arial", 1, 16)
        return textField
    }

    private fun label(texto: String, x: Int, y: Int, fontSize: Int): JLabel {
        val jLabel = JLabel(texto)
        jLabel.font = Font("arial", 1, fontSize)
        jLabel.foreground = Color.BLACK
        jLabel.setBounds(x, y, 300, 30)
        return jLabel
    }
}