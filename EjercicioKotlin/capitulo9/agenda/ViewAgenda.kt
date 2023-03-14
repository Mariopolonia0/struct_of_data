package EjercicioKotlin.capitulo9.agenda


import java.awt.Color
import java.awt.Font
import javax.swing.*
import javax.swing.text.Element

class ViewAgenda : JFrame() {

    init {
        ventanaPrincipal()
    }

    private fun ventanaPrincipal() {
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "Lista Agenda"
        setSize(500, 500)
        setLocation(500, 200)
        setLocationRelativeTo(null)
        add(panel())
        isVisible = true
    }

    private fun panel(): JPanel {
        val jPanel = JPanel()
        jPanel.add(label("Lista de contactos", 20, 20,20))
        jPanel.isVisible = true
        jPanel.layout = null

        jPanel.add(agregarLista())
        jPanel.add(jpanelRegistro())

        return jPanel
    }

    private fun agregarLista(): JList<String> {
        val l1: DefaultListModel<String> = DefaultListModel()
        val list: JList<String> = JList(l1)

        for (it in 0..15)
            l1.addElement("mario Peña Polonia")

        list.addListSelectionListener {
            println("${it.lastIndex}")

        }

        list.setBounds(10, 60, 200, 380)
        list.background = Color.lightGray

        return list
    }

    private fun jpanelRegistro(): JPanel {
        val jPanel = JPanel()
        jPanel.add(label("Registro", 5, 0,20))
        jPanel.setBounds(220, 60, 250, 380)
        jPanel.isVisible = true
        jPanel.layout = null
        jPanel.background = Color.lightGray

        jPanel.add(label("Nombre", 5, 30,16))

        return jPanel
    }

    private fun label(texto: String, x: Int, y: Int, fontSize: Int): JLabel {
        val jLabel = JLabel(texto)
        jLabel.font = Font("arial", 1, fontSize)
        jLabel.foreground = Color.BLACK
        jLabel.setBounds(x, y, 300, 30)
        return jLabel
    }


}

