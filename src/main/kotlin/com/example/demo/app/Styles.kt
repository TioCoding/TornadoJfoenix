package com.example.demo.app

import com.jfoenix.controls.JFXButton
import javafx.scene.Cursor
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val buttonLogin by cssclass()

        val jfxRippler by cssclass()
        val jfxRipplerFill by cssproperty<Color>()
        val jfxButtonType by cssproperty<JFXButton.ButtonType>()
    }

    init {
        buttonLogin {
            jfxRippler{
                jfxRipplerFill.value = c("ORANGE") // NO APPLY CSS
            }
            jfxButtonType.value = JFXButton.ButtonType.RAISED // NO APPLY CSS
            prefWidth = 200.0.px
            fontSize = 15.0.px
            textFill = c("WHITE")
            backgroundColor += c("GREEN")
            cursor = Cursor.HAND
        }
    }
}