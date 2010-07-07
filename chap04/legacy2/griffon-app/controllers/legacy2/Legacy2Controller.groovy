package legacy2

class Legacy2Controller {
    def model
    def view

    def login = { evt = null ->
        def (m, v, c) = createMVCGroup("login", [mainFrame: view.mainFrame])
        v.loginDialog.show()
    }

    def exit = { evt = null ->
        app.shutdown()
    }
}
