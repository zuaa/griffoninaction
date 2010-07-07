package ping

class PingController {
    def model
    int count = 0

    def doPing = { evt = null ->
        model.output = ""
        app.event("Ping")
    }

    def onPing = {
        String text = "Pong! (${++count})" 
        execAsync { model.output = text }
    } 

    void mvcGroupInit(Map args) {
        createMVCGroup("pong")
    }

    def onPong = { pongText ->
        execAsync { model.pongText = pongText }
    }
}
