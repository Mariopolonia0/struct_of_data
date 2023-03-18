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
        jPanel.add(label("Registro", 5, 0, 20))
        jPanel.setBounds(230, 40, 280, 470)
        jPanel.isVisible = true
        jPanel.layout = null
        jPanel.background = Color.lightGray

        //agregar textFiel
        jPanel.add(label("Nombre", 5, 30, 16))
        textFieldNombre = textField(5, 60)
        jPanel.add(textFieldNombre)

        jPanel.add(label("Direccion", 5, 90, 16)) //y = 60 + 30
        textFieldDireccion = textField(5, 120) // y = 90 + 30
        jPanel.add(textFieldDireccion)

        jPanel.add(label("Ciudad", 5, 150, 16))
        textFieldCiudad = textField(5, 180)
        jPanel.add(textFieldCiudad)

        jPanel.add(label("Codigo Postal", 5, 210, 16))
        textFieldCodigoPostal = textField(5, 240)
        jPanel.add(textFieldCodigoPostal)

        jPanel.add(label("Telefono", 5, 270, 16))
        textFieldTelefono = textField(5, 300)
        jPanel.add(textFieldTelefono)

        jPanel.add(label("Fecha Nacimiento", 5, 330, 16))
        textFieldFechaNacimiento = textField(5, 360)
        jPanel.add(textFieldFechaNacimiento)

        configurarButton()
        jPanel.add(buttonGuardar)
        return jPanel
    }

    private fun configurarButton() {
        buttonGuardar = JButton("")
        val icono = ImageIcon("Resources/GuardarIcon.png")
        buttonGuardar.icon = ImageIcon(icono.image.getScaledInstance(50, 50, Image.SCALE_SMOOTH))
        buttonGuardar.setBounds(20, 400, 60, 60)

        val evento = object : MouseAdapter() {
            override fun mouseClicked(e: MouseEvent) {
                guardarContacto()
            }
        }

        buttonGuardar.addMouseListener(evento)
        buttonGuardar.isVisible = true
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

    private fun textField(x: Int, y: Int): JTextField {
        val textField = JTextField()
        textField.setBounds(x, y, 220, 25)
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